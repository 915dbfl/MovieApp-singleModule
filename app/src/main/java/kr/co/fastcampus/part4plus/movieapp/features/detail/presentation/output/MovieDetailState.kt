package kr.co.fastcampus.part4plus.movieapp.features.detail.presentation.output

import kr.co.fastcampus.part4plus.movieapp.features.common.entity.MovieDetailEntity

sealed class MovieDetailState {
    // 저장된 정보를 가져올 것이기 때문에 loading이 아니라 initial
    object Initial : MovieDetailState()
    class Main(val movieDetailEntity: MovieDetailEntity) : MovieDetailState()
}
