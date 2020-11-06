package ru.skillbranch.skillarticles.ui.profile

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import ru.skillbranch.skillarticles.MobileNavigationDirections
import ru.skillbranch.skillarticles.R

class ProfileFragmentDirections private constructor() {
  private data class ActionNavProfileToDialogAvatarActions(
    val hasAvatar: Boolean
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_nav_profile_to_dialog_avatar_actions

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putBoolean("has_avatar", this.hasAvatar)
      return result
    }
  }

  private data class EditProfile(
    val name: String,
    val about: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.edit_profile

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("name", this.name)
      result.putString("about", this.about)
      return result
    }
  }

  companion object {
    fun actionNavProfileToDialogAvatarActions(hasAvatar: Boolean): NavDirections =
        ActionNavProfileToDialogAvatarActions(hasAvatar)

    fun editProfile(name: String, about: String): NavDirections = EditProfile(name, about)

    fun startLogin(): NavDirections = MobileNavigationDirections.startLogin()

    fun finishLogin(): NavDirections = MobileNavigationDirections.finishLogin()
  }
}
