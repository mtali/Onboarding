package com.mtali.onboarding.core.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color
import com.mtali.onboarding.core.ui.theme.Purple700

data class Onboarding(
    @DrawableRes val image: Int,
    @StringRes val title: Int,
    @StringRes val desc: Int,
    val backgroundColor: Color,
    val mainColor: Color = Purple700
)
