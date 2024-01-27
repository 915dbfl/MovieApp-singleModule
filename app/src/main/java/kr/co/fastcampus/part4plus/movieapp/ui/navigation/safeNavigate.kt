package kr.co.fastcampus.part4plus.movieapp.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavDirections

// 여러 번 클랙했을 때 스택이 쌓이는 것을 방지
fun NavController.safeNavigate(direction: NavDirections) {
    currentDestination?.getAction(direction.actionId)?.run { navigate(direction) }
}
