package kr.co.fastcampus.part4plus.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kr.co.fastcampus.part4plus.movieapp.R
import kr.co.fastcampus.part4plus.movieapp.ui.models.buttons.LeadingIconData
import kr.co.fastcampus.part4plus.movieapp.ui.models.dialog.DialogButton
import kr.co.fastcampus.part4plus.movieapp.ui.theme.MovieAppTheme

@Preview
@Composable
fun AlertPreview() {
    MovieAppTheme {
        DialogPopup.Alert(
            title = "Title",
            bodyText = "abc abc abc abc ",
            buttons = listOf(
                DialogButton.UnderlinedText("ok")
            )
        )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MovieAppTheme {
        DialogPopup.Default(
            title = "Title",
            bodyText = "abc abc abc abc ",
            buttons = listOf(
                DialogButton.Primary("OPEN"),
                DialogButton.SecondaryBorderless("CANCEL"),
            )
        )
    }
}

@Preview
@Composable
fun RatingPreview() {
    MovieAppTheme {
        DialogPopup.Rating(
            movieName = "Movie Name",
            rating = 3.5f,
            buttons = listOf(
                DialogButton.Primary(
                    title = "SUBMIT",
                    leadingIconData = LeadingIconData(
                        iconDrawable = R.drawable.ic_send,
                        iconContentDescription = null
                    )
                ),
                DialogButton.SecondaryBorderless("CANCEL")
            )
        )
    }
}