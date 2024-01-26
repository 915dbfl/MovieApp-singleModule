package kr.co.fastcampus.part4plus.movieapp.libraries.network.retrofit

import kr.co.fastcampus.part4plus.movieapp.libraries.network.model.ApiResult
import kr.co.fastcampus.part4plus.movieapp.libraries.network.model.NetworkRequestInfo
import java.lang.reflect.Type

interface NetworkRequestFactory {

    suspend fun <T> create(
        url: String,
        requestInfo: NetworkRequestInfo = NetworkRequestInfo.Builder().build(),
        type: Type
    ): ApiResult<T>
}
