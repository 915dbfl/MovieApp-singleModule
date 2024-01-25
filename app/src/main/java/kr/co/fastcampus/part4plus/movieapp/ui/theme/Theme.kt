package kr.co.fastcampus.part4plus.movieapp.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import kr.co.fastcampus.part4plus.movieapp.ui.theme.color.ColorSet
import kr.co.fastcampus.part4plus.movieapp.ui.theme.color.MyColors

private val LocalColors = staticCompositionLocalOf { ColorSet.Red.LightColors }

@Composable
fun MovieAppTheme(
    myColors: ColorSet = ColorSet.Red,
    typography: Typography = Typography,
    shapes: Shapes = Shapes,
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> myColors.DarkColors
        else -> myColors.LightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    CompositionLocalProvider(LocalColors provides colorScheme) {
        MaterialTheme (
            colors = colorScheme.material,
            typography = typography,
            shapes = shapes,
            content = content
        )
    }
}

// 현재 테마에 적용된 색상을 확장함수된 형태로 가져올 수 있게 된다.
val MaterialTheme.colorScheme: MyColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current