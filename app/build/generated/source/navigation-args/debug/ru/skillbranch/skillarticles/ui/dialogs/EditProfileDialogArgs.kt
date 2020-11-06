package ru.skillbranch.skillarticles.ui.dialogs

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class EditProfileDialogArgs(
  val name: String,
  val about: String
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("name", this.name)
    result.putString("about", this.about)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): EditProfileDialogArgs {
      bundle.setClassLoader(EditProfileDialogArgs::class.java.classLoader)
      val __name : String?
      if (bundle.containsKey("name")) {
        __name = bundle.getString("name")
        if (__name == null) {
          throw IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue")
      }
      val __about : String?
      if (bundle.containsKey("about")) {
        __about = bundle.getString("about")
        if (__about == null) {
          throw IllegalArgumentException("Argument \"about\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"about\" is missing and does not have an android:defaultValue")
      }
      return EditProfileDialogArgs(__name, __about)
    }
  }
}
