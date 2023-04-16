package com.mtali.onboarding.app

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.mtali.onboarding.R
import com.mtali.onboarding.core.models.Onboarding
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {


    companion object {
        val onboardingData = listOf(
            Onboarding(
                image = R.drawable.tigp,
                title = R.string.tigo_title,
                desc = R.string.tigo_desc,
                backgroundColor = Color(0xFF183E66),
                mainColor = Color(0xFF183E66),
            ),
            Onboarding(
                image = R.drawable.airtel,
                title = R.string.airtel_title,
                desc = R.string.airtel_desc,
                backgroundColor = Color(0xFFECF5FC),
                mainColor = Color(0xFFED0006)
            ),
            Onboarding(
                image = R.drawable.vodacom,
                title = R.string.mpesa_title,
                desc = R.string.mpesa_desc,
                backgroundColor = Color(0xFFFA0000),
                mainColor = Color(0xFFED0006)
            ),
        )
    }
}