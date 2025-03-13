package com.task.innocrux.features.moviedetail.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.task.innocrux.R
import com.task.innocrux.base.network.ApiState
import com.task.innocrux.features.moviedetail.domain.model.CastMember
import com.task.innocrux.features.moviedetail.domain.model.Episode
import com.task.innocrux.features.moviedetail.domain.model.MovieDetail
import com.task.innocrux.features.moviedetail.domain.model.MovieDetailRequest
import com.task.innocrux.features.moviedetail.domain.model.MovieDetailResponse
import com.task.innocrux.features.moviedetail.domain.model.MovieInfo
import com.task.innocrux.features.moviedetail.domain.model.Season
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieDetailViewModel : ViewModel() {

    private val _apiState = MutableStateFlow<ApiState<MovieDetailResponse>>(ApiState.Idle)
    val apiState: StateFlow<ApiState<MovieDetailResponse>> = _apiState

    fun fetchMovieDetail(movieDetailRequest: MovieDetailRequest) {
        viewModelScope.launch {
            try {

                _apiState.value = ApiState.Loading

                delay(200)

                // Simulating API call by returning dummy data
                _apiState.value = ApiState.Success(dummyMovieDetailResponse)

            } catch (e: Exception) {
                _apiState.value = ApiState.Error(e.message ?: "An error occurred")
            }
        }
    }
}

// dummy data for movie detail response

const val description = "The film follows Tony Stark (Iron Man) as he struggles with the emotional and psychological aftermath of the alien invasion in The Avengers. Dealing with anxiety and PTSD, " +
        "Tony " +
        "becomes obsessed with creating more Iron Man suits while distancing himself from friends and loved ones. When a terrorist known as the Mandarin begins attacking the U.S., Tony’s life is " +
        "turned upside down. His mansion is destroyed, and he is forced to survive without his usual technology. On a journey to stop the Mandarin and uncover his true identity, Tony confronts the villain Aldrich Killian, who has created a dangerous virus called Extremis. Alongside his friend Rhodes, Tony faces deadly threats and uncovers secrets that challenge his role as a hero."


val dummyMovieDetailResponse = MovieDetailResponse(
    moviePosterUrl = R.drawable.poster_image,
    movieNameUrl = R.drawable.iron_man_title_image,
    movieDescription = description,
    movieInfo = listOf(
        MovieInfo("2011"),
        MovieInfo("Thriller"),
        MovieInfo("135 min"),
        MovieInfo("13+"),
    ),

    movieDetail = listOf(
        MovieDetail(detailKey = "Production House", detailValue = "Marvel Studios"),
        MovieDetail(detailKey = "Director", detailValue = "Shane Black"),
        MovieDetail(detailKey = "Release Year", detailValue = "2013"),
        MovieDetail(detailKey = "Genre", detailValue = "Action, Adventure, Sci-Fi"),
        MovieDetail(detailKey = "Main Actor", detailValue = "Robert Downey Jr."),
        MovieDetail(detailKey = "Producer", detailValue = "Kevin Feige"),
        MovieDetail(detailKey = "Music", detailValue = "Brian Tyler"),
        MovieDetail(detailKey = "Cinematography", detailValue = "John Toll"),
        MovieDetail(detailKey = "Budget", detailValue = "$200 million"),
        MovieDetail(detailKey = "Box Office", detailValue = "$1.215 billion"),
        MovieDetail(detailKey = "IMDb Rating", detailValue = "7.2/10"),
        MovieDetail(detailKey = "Running Time", detailValue = "130 minutes"),
        MovieDetail(detailKey = "Screenplay", detailValue = "Shane Black, Drew Pearce"),
        MovieDetail(detailKey = "Distributor", detailValue = "Walt Disney Studios Motion Pictures"),

    ),
    movieCast = listOf(
        CastMember(name = "Robert Downey", role = "Director", profileUrl = R.drawable.cast_image_1),
        CastMember(name = "McDormand", role = "Arlo", profileUrl = R.drawable.cast_image_2),
        CastMember(name = "Jeffrey Wright", role = "Poppa", profileUrl = R.drawable.cast_image_3),
        CastMember(name = "McDormand", role = "Arlo", profileUrl = R.drawable.cast_image_4),
        CastMember(name = "Jeffrey Wright", role = "Poppa", profileUrl = R.drawable.cast_image_5)

    ),
    movieEpisodes = listOf(
        Episode(
            episodeBanner = R.drawable.poster_image,
            episodeTitle = "Episode 1 - The flea and the Acrobat",
            episodeNumber = 1,
            episodeReleaseDate = "2025-03-12",
            episodeDuration = 45.34f,
            playedDuration = 35.34f,
            episodeDescription = "In the pilot episode, we are introduced to the main characters and the world they live in. The episode sets the stage for the main conflict of the series."
        ),
        Episode(
            episodeBanner = R.drawable.episode_2_image,
            episodeTitle = "Episode 2 - The flea and the Acrobat",
            episodeNumber = 2,
            episodeReleaseDate = "2025-03-19",
            episodeDuration = 50.45f,
            playedDuration = 10.12f,
            episodeDescription = "In this episode, the characters embark on a thrilling chase that tests their loyalty and survival skills. Secrets are revealed as they race against time."
        ),
        Episode(
            episodeBanner = R.drawable.episode_3_image,
            episodeTitle = "Episode 3 - The flea and the Acrobat",
            episodeNumber = 3,
            episodeReleaseDate = "2025-03-26",
            episodeDuration = 55.12f,
            playedDuration = 30.38f,
            episodeDescription = "The battle for dominance reaches its peak in this episode. Characters face their greatest challenges yet as alliances are formed and broken."
        )
    ),
    movieSeasons = listOf(
        Season(seasonNumber = 1, seasonTitle = "Season 1", numberOfEpisodes = 10),
        Season(seasonNumber = 2, seasonTitle = "Season 2", numberOfEpisodes = 12)
    ),

    relatedMovie = listOf(
        Episode(
            episodeBanner = R.drawable.poster_image,
            episodeTitle = "The Matrix Resurrections",
            episodeDuration = 148f,
            episodeDescription = "Neo returns to the world of the living and must once again battle against the machines controlling the fate of humanity."
        ),
        Episode(
            episodeBanner = R.drawable.episode_2_image,
            episodeTitle = "Dune",
            episodeDuration = 155f,
            episodeDescription = "A noble family becomes embroiled in a war for control of the galaxy's most valuable asset while its heir becomes troubled by visions of a dark future."
        ),
        Episode(
            episodeBanner = R.drawable.episode_3_image,
            episodeTitle = "Spider-Man: No Way Home",
            episodeDuration = 148f,
            episodeDescription = "Peter Parker's life and reputation are turned upside down when his identity is revealed. He seeks help from Doctor Strange, but things spiral out of control."
        ),

    )

)


