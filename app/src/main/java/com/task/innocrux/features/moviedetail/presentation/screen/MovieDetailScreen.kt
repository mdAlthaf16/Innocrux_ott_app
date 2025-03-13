package com.task.innocrux.features.moviedetail.presentation.screen

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.task.innocrux.base.network.ApiState
import com.task.innocrux.features.moviedetail.domain.model.MovieDetailRequest
import com.task.innocrux.features.moviedetail.domain.model.MovieDetailResponse
import com.task.innocrux.features.moviedetail.presentation.components.MovieCastDetailView
import com.task.innocrux.features.moviedetail.presentation.components.MovieDetailHeader
import com.task.innocrux.features.moviedetail.presentation.components.MovieDetailTabView
import com.task.innocrux.features.moviedetail.presentation.components.MovieMakingDetail
import com.task.innocrux.features.moviedetail.presentation.components.ShimmerMovieDetails
import com.task.innocrux.features.moviedetail.presentation.viewmodel.MovieDetailViewModel
import com.task.innocrux.ui.theme.PrimaryColor

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MovieDetailScreen(calculateBottomPadding: Dp) {

    val context = LocalContext.current

    val viewModel: MovieDetailViewModel = viewModel()
    val apiState by viewModel.apiState.collectAsState()

    var movieDetailResponse by remember { mutableStateOf(MovieDetailResponse()) }
    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }

    val movieDetailRequest = MovieDetailRequest(movieId = 1)
    LaunchedEffect(Unit) { viewModel.fetchMovieDetail(movieDetailRequest) }

    when (val state = apiState) {
        is ApiState.Success -> {
            movieDetailResponse = state.data
        }

        is ApiState.Error -> {
            Toast.makeText(context, state.message, Toast.LENGTH_SHORT).show()
        }

        else -> Unit
    }

    Scaffold(
        modifier = Modifier.fillMaxSize().padding(bottom = calculateBottomPadding),
        containerColor = PrimaryColor,
    ) {


        // Show the shimmer when the api is in progress state
        if (apiState is ApiState.Loading) {
            ShimmerMovieDetails()
        }


        // Simulates the UI once after the api success

        if (apiState is ApiState.Success) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {

                // Header Item
                item {
                    MovieDetailHeader(movieDetailResponse)
                }

                // Movie Details (for example, making details)
                items(movieDetailResponse.movieDetail.take(2)) { movieDetail ->
                    MovieMakingDetail(movieDetail)
                }

                // Cast Details
                item {
                    Column(modifier = Modifier.padding(horizontal = 12.dp)) {
                        MovieCastDetailView(movieDetailResponse.movieCast)
                    }
                }

                // Tab View
                item {
                    MovieDetailTabView(
                        movieDetailResponse = movieDetailResponse,
                        onClickTab = { tabIndex ->
                            selectedTabIndex = tabIndex
                        }
                    )
                }

                // Spacer to avoid layout overflow
                item {
                    Spacer(Modifier.height(50.dp))
                }
            }
        }

    }
}


