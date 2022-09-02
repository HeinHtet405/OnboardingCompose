package com.devshub.onboardingcompose.util

import androidx.annotation.DrawableRes
import com.devshub.onboardingcompose.R

/**
 * Created by Hein Htet Aung on 01/09/2022 11:23 PM.
 */
sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.img_first_slide,
        title = "CELEBRATING HOMEMAKERS",
        description = "When you place an order on Khaika, you are directly empowering the women of our country."
    )

    object Second : OnBoardingPage(
        image = R.drawable.img_second_slide,
        title = "HEALTHY &amp; HYGIENIC",
        description = "We’ve got amazing desi food from south to north, east to west! Prepared with love."
    )

    object Third : OnBoardingPage(
        image = R.drawable.img_third_slide,
        title = "DELIVERED ON TIME",
        description = "Our growing list of khaika heroes deliver your food warm, when you want it, where you want it."
    )
}