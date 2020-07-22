package ru.skillbranch.skillarticles.ui.auth

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

data class AuthFragmentArgs(
  val privateDestination: Int = -1
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("private_destination", this.privateDestination)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): AuthFragmentArgs {
      bundle.setClassLoader(AuthFragmentArgs::class.java.classLoader)
      val __privateDestination : Int
      if (bundle.containsKey("private_destination")) {
        __privateDestination = bundle.getInt("private_destination")
      } else {
        __privateDestination = -1
      }
      return AuthFragmentArgs(__privateDestination)
    }
  }
}
