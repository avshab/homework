package ru.skillbranch.skillarticles.ui.auth

import androidx.navigation.NavDirections
import ru.skillbranch.skillarticles.AuthDirections

class AuthFragmentDirections private constructor() {
  companion object {
    fun startLogin(): NavDirections = AuthDirections.startLogin()

    fun finishLogin(): NavDirections = AuthDirections.finishLogin()
  }
}
