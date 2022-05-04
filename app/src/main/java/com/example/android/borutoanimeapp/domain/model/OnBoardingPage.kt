package com.example.android.borutoanimeapp.domain.model

import androidx.annotation.DrawableRes
import com.example.android.borutoanimeapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.greetings,
        title = "Greetings",
        description = "Test description 1"
    )

    object Second : OnBoardingPage(
        image = R.drawable.explore,
        title = "Explore",
        description = "Test description 2"
    )

    object Third : OnBoardingPage(
        image = R.drawable.power,
        title = "Power",
        description = "Test description 3"
    )
}