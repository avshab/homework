package ru.skillbranch.skillarticles.ui.dialogs

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.jvm.JvmStatic

data class AvatarActionsDialogArgs(
  val hasAvatar: Boolean
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("has_avatar", this.hasAvatar)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): AvatarActionsDialogArgs {
      bundle.setClassLoader(AvatarActionsDialogArgs::class.java.classLoader)
      val __hasAvatar : Boolean
      if (bundle.containsKey("has_avatar")) {
        __hasAvatar = bundle.getBoolean("has_avatar")
      } else {
        throw IllegalArgumentException("Required argument \"has_avatar\" is missing and does not have an android:defaultValue")
      }
      return AvatarActionsDialogArgs(__hasAvatar)
    }
  }
}
