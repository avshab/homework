package ru.skillbranch.skillarticles.ui.auth

import android.util.Patterns
import androidx.annotation.VisibleForTesting
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import androidx.savedstate.SavedStateRegistryOwner
import kotlinx.android.synthetic.main.fragment_registration.*
import ru.skillbranch.skillarticles.R
import ru.skillbranch.skillarticles.ui.RootActivity
import ru.skillbranch.skillarticles.ui.base.BaseFragment
import ru.skillbranch.skillarticles.viewmodels.auth.AuthViewModel

/**
 * Created by Anna Shabaeva on 05.11.2020
 */

class RegistrationFragment() : BaseFragment<AuthViewModel>() {

    //for testing
    var _mockFactory: ((SavedStateRegistryOwner) -> ViewModelProvider.Factory)? = null

    override val viewModel: AuthViewModel by viewModels {
        _mockFactory?.invoke(this) ?: defaultViewModelProviderFactory
    }

    private val args: RegistrationFragmentArgs by navArgs()
    override val layout: Int = R.layout.fragment_registration

    //testing constructor
    @VisibleForTesting(otherwise = VisibleForTesting.NONE)
    constructor(
        mockRoot: RootActivity,
        mockFactory: ((SavedStateRegistryOwner) -> ViewModelProvider.Factory)? = null
    ) : this() {
        _mockRoot = mockRoot
        _mockFactory = mockFactory
    }


    override fun setupViews() {

        btn_login.setOnClickListener {
            if (checkPassword() && checkName() && checkEmail()) {
                viewModel.handleRegister(et_name.text.toString(), et_login.text.toString(), et_password.text.toString(), null)
            }
        }
    }

    private fun checkPassword(): Boolean {
        return "[a-zA-Z0-9]{8,}".toRegex().matches(et_password.text)
    }

    private fun checkName(): Boolean {
        return et_name.text.length > 2
    }

    private fun checkEmail(): Boolean {
        with(et_login.text.toString()) {
            return isNotBlank() && Patterns.EMAIL_ADDRESS.matcher(this)
                .matches()
        }
    }

}
