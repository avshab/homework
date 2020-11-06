package ru.skillbranch.skillarticles.ui.dialogs

import androidx.navigation.NavDirections
import ru.skillbranch.skillarticles.MobileNavigationDirections

class AvatarActionsDialogDirections private constructor() {
  companion object {
    fun startLogin(): NavDirections = MobileNavigationDirections.startLogin()

    fun finishLogin(): NavDirections = MobileNavigationDirections.finishLogin()
  }
}
