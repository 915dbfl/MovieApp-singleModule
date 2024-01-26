package kr.co.fastcampus.part4plus.movieapp.features.common.network.api

import com.google.gson.reflect.TypeToken
import kr.co.fastcampus.part4plus.movieapp.features.common.network.model.MovieResponse
import kr.co.fastcampus.part4plus.movieapp.libraries.network.model.ApiResult
import kr.co.fastcampus.part4plus.movieapp.libraries.network.retrofit.NetworkRequestFactory
import javax.inject.Inject

class MovieAppNetworkApi @Inject constructor(
    private val networkRequestFactory: NetworkRequestFactory
): IMovieAppNetworkApi {
    override suspend fun getMovies(): ApiResult<List<MovieResponse>> {
        return networkRequestFactory.create(
            url = "top250.json",
            // type: gson으로 파싱을 하기 위한 타입을 넣어줌
            type = object: TypeToken<List<MovieResponse>>() {}.type
        )

    }
}