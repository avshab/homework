package ru.skillbranch.skillarticles.ui.article

import androidx.navigation.NavDirections
import ru.skillbranch.skillarticles.MobileNavigationDirections

class ArticleFragmentDirections private constructor() {
  companion object {
    fun startLogin(): NavDirections = MobileNavigationDirections.startLogin()

    fun finishLogin(): NavDirections = MobileNavigationDirections.finishLogin()
  }
}
