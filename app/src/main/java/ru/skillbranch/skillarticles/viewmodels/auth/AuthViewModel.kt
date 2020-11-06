package ru.skillbranch.skillarticles.viewmodels.auth

import androidx.lifecycle.SavedStateHandle
import kotlinx.android.synthetic.main.fragment_registration.*
import ru.skillbranch.skillarticles.data.repositories.RootRepository
import ru.skillbranch.skillarticles.viewmodels.base.BaseViewModel
import ru.skillbranch.skillarticles.viewmodels.base.IViewModelState
import ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand
import ru.skillbranch.skillarticles.viewmodels.base.Notify


class AuthViewModel(handle: SavedStateHandle) : BaseViewModel<AuthState>(handle, AuthState()), IAuthViewModel{
    private val repository = RootRepository
    init {
        subscribeOnDataSource(repository.isAuth()){isAuth, state ->
            state.copy(isAuth = isAuth)
        }
    }

    override fun handleLogin(login:String, pass:String, dest:Int?){
        launchSafety {
            repository.login(login, pass)
            navigate(NavigationCommand.FinishLogin(dest))
        }

    }

    override fun handleRegister(name:String, login:String, password:String, dest:Int?) {
        launchSafety {
            repository.handleRegister(name, login, password, dest)
            navigate(NavigationCommand.FinishLogin(dest))
        }
    }

    fun isValid(name: String, login: String, password: String): Boolean {
        var isValid = false
        if (name.isEmpty() || login.isEmpty() || password.isEmpty()) {
            notify(Notify.ErrorMessage("Name, login, password it is required fields and not must be empty"))
        } else if (!checkName(name)) {
            notify(Notify.ErrorMessage("The name must be at least 3 characters long and contain only letters and numbers and can also contain the characters \"-\" and \"_\""))
        } else if (!checkEmail(login)) {
            notify(Notify.ErrorMessage("Incorrect Email entered"))
        } else if (!checkPassword(password)) {
            notify(Notify.ErrorMessage("Password must be at least 8 characters long and contain only letters and numbers"))
//        } else if (password != currentState.repeatPass) {
//            notify(Notify.ErrorMessage("Password does not match"))
        } else {
            isValid = true
        }
        return isValid
    }

    private fun checkPassword(password: String): Boolean {
        return "[a-zA-Z0-9]{8,}".toRegex().matches(password)
    }

    private fun checkName(name: String): Boolean {
        return name.length > 2
    }

    private fun checkEmail(email: String): Boolean {
        with(email) {
            return isNotBlank() && android.util.Patterns.EMAIL_ADDRESS.matcher(this)
                .matches()
        }
    }
}

data class AuthState(val isAuth: Boolean = false): IViewModelState
