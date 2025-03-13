package com.task.innocrux.features.moviedetail.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.task.innocrux.common.components.SkeletonView
import com.task.innocrux.ui.theme.PrimaryColor

@Composable
@Preview(showBackground = true)
fun ShimmerMovieDetails() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
    ) {

        SkeletonView(
            radius = 0,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Spacer(Modifier.height(10.dp))

        SkeletonView(
            radius = 0,
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        )


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
        ) {

            Spacer(Modifier.height(10.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .padding(horizontal = 100.dp)
            )

            Spacer(Modifier.height(15.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .padding(horizontal = 12.dp)
            )

            Spacer(Modifier.height(15.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                repeat(5) {
                    SkeletonView(
                        modifier = Modifier
                            .size(60.dp),
                        radius = 100
                    )
                    Spacer(Modifier.width(10.dp))


                }

            }

            Spacer(Modifier.height(20.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .padding(end = 100.dp)
            )

            Spacer(Modifier.height(10.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .padding(end = 140.dp)

            )


            Spacer(Modifier.height(10.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .padding(end = 300.dp)
            )


            Spacer(Modifier.height(20.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
            )

            Spacer(Modifier.height(10.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
            )


            Spacer(Modifier.height(20.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .padding(end = 300.dp)
            )

            Spacer(Modifier.height(20.dp))


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                repeat(5) {
                    SkeletonView(
                        modifier = Modifier
                            .size(80.dp),
                        radius = 100
                    )
                    Spacer(Modifier.width(10.dp))


                }

            }

            Spacer(Modifier.height(20.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
            )

            Spacer(Modifier.height(10.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
            )

            Spacer(Modifier.height(20.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .padding(end = 100.dp)
            )

            Spacer(Modifier.height(10.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .padding(end = 140.dp)

            )


            Spacer(Modifier.height(10.dp))

            SkeletonView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .padding(end = 300.dp)
            )
        }

    }
}