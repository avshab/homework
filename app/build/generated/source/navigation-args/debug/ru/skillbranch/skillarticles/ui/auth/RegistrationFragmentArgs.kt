package ru.skillbranch.skillarticles.ui.auth

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

data class RegistrationFragmentArgs(
  val privateDestination: Int = -1
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("private_destination", this.privateDestination)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): RegistrationFragmentArgs {
      bundle.setClassLoader(RegistrationFragmentArgs::class.java.classLoader)
      val __privateDestination : Int
      if (bundle.containsKey("private_destination")) {
        __privateDestination = bundle.getInt("private_destination")
      } else {
        __privateDestination = -1
      }
      return RegistrationFragmentArgs(__privateDestination)
    }
  }
}
