package ru.skillbranch.skillarticles.ui.auth

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Int
import ru.skillbranch.skillarticles.AuthDirections
import ru.skillbranch.skillarticles.R

class AuthFragmentDirections private constructor() {
  private data class ActionNavAuthToRegistrationFragment(
    val privateDestination: Int = -1
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_nav_auth_to_registrationFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("private_destination", this.privateDestination)
      return result
    }
  }

  companion object {
    fun actionAuthFragmentToPrivacyPolicyFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_authFragment_to_privacyPolicyFragment)

    fun actionNavAuthToRegistrationFragment(privateDestination: Int = -1): NavDirections =
        ActionNavAuthToRegistrationFragment(privateDestination)

    fun startLogin(): NavDirections = AuthDirections.startLogin()

    fun finishLogin(): NavDirections = AuthDirections.finishLogin()
  }
}
