package kr.co.fastcampus.part4plus.movieapp.features.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kr.co.fastcampus.part4plus.movieapp.features.feed.presentation.screen.FeedScreen
import kr.co.fastcampus.part4plus.movieapp.features.feed.presentation.viewmodel.FeedViewModel
import kr.co.fastcampus.part4plus.movieapp.ui.theme.MovieAppTheme

@AndroidEntryPoint
class FeedFragment: Fragment() {
    private val viewModel by viewModels<FeedViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                MovieAppTheme {
//                    FeedScreen(
//                        feedStateHolder = viewModel.feedState,
//                        input =
//                    )
                }
            }
        }
    }
}