package ru.skillbranch.skillarticles.ui.profile

import androidx.navigation.NavDirections
import ru.skillbranch.skillarticles.MobileNavigationDirections

class ProfileFragmentDirections private constructor() {
  companion object {
    fun startLogin(): NavDirections = MobileNavigationDirections.startLogin()

    fun finishLogin(): NavDirections = MobileNavigationDirections.finishLogin()
  }
}
