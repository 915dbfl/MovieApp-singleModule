package kr.co.fastcampus.part4plus.movieapp.features.common.repository

import kr.co.fastcampus.part4plus.movieapp.features.common.network.api.IMovieAppNetworkApi
import kr.co.fastcampus.part4plus.movieapp.libraries.network.model.ApiResponse
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val movieNetworkApi: IMovieAppNetworkApi
): IMovieDataSource {
    override suspend fun getMovieList() {
        val data = movieNetworkApi.getMovies()
        if (data.response is ApiResponse.Success) {
            val movieList = data.response
        }
    }
}