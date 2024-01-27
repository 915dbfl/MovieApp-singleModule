package kr.co.fastcampus.part4plus.movieapp.features.feed.presentation.output

import kr.co.fastcampus.part4plus.movieapp.features.common.entity.MovieFeedItemEntity

sealed class FeedState {
    object Loading: FeedState()
    class Main(
        val movieList: List<MovieFeedItemEntity>
    ): FeedState()

    class Failed(
        val reason: String
    ): FeedState()
}