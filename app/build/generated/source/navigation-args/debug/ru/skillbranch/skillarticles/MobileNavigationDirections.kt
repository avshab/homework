package ru.skillbranch.skillarticles

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class MobileNavigationDirections private constructor() {
  companion object {
    fun startLogin(): NavDirections = ActionOnlyNavDirections(R.id.start_login)

    fun finishLogin(): NavDirections = ActionOnlyNavDirections(R.id.finish_login)
  }
}
