package kr.co.fastcampus.part4plus.movieapp

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import kr.co.fastcampus.part4plus.movieapp.features.common.viewmodel.ThemeViewModel

open class BaseDialogFragment : DialogFragment() {
    // 매번 테마를 바꿔주기 위해 테마에 대한 설정을 넣어주기 위한 viewModel
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}
