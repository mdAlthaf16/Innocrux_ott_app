package com.task.innocrux.features.moviedetail.domain.model


data class MovieDetailResponse(
    val moviePosterUrl: Int = 0,
    val movieNameUrl: Int = 0,
    val movieDescription : String = "",
    val movieInfo: List<MovieInfo>  = emptyList(),
    val movieDetail: List<MovieDetail> = emptyList(),
    val movieCast: List<CastMember> = emptyList(),
    val movieEpisodes: List<Episode> = emptyList(),
    val movieSeasons: List<Season> = emptyList(),
    val relatedMovie : List<Episode> = emptyList()
)

data class MovieInfo(
    val movieInfo: String
)

data class MovieDetail(
    val detailKey: String,
    val detailValue: String
)

data class CastMember(
    val name: String,
    val role: String,
    val profileUrl: Int
)

data class Episode(
    val episodeBanner : Int = 0,
    val episodeTitle: String = "",
    val episodeNumber: Int = 0,
    val episodeReleaseDate: String = "",
    val episodeDuration: Float = 0f,
    val playedDuration : Float = 0f,
    val episodeDescription : String = "",
)

data class Season(
    val seasonNumber: Int,
    val seasonTitle: String,
    val numberOfEpisodes: Int
)




