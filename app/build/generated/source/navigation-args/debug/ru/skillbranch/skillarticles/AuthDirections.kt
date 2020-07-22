package ru.skillbranch.skillarticles

import androidx.navigation.NavDirections

class AuthDirections private constructor() {
  companion object {
    fun startLogin(): NavDirections = MobileNavigationDirections.startLogin()

    fun finishLogin(): NavDirections = MobileNavigationDirections.finishLogin()
  }
}
