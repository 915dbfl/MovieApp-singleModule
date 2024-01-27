package kr.co.fastcampus.part4plus.movieapp.libraries.storage.usecases

import kr.co.fastcampus.part4plus.movieapp.libraries.storage.IStorage
import javax.inject.Inject

class StorageClearUseCase @Inject constructor(
    private val storage: IStorage
) : IStorageClearUseCase {
    override fun invoke() {
        storage.clear()
    }
}
