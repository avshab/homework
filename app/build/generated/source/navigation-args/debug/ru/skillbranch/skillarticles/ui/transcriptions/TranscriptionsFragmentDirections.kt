package ru.skillbranch.skillarticles.ui.transcriptions

import androidx.navigation.NavDirections
import ru.skillbranch.skillarticles.MobileNavigationDirections

class TranscriptionsFragmentDirections private constructor() {
  companion object {
    fun startLogin(): NavDirections = MobileNavigationDirections.startLogin()

    fun finishLogin(): NavDirections = MobileNavigationDirections.finishLogin()
  }
}
