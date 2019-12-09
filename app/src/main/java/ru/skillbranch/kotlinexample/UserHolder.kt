package ru.skillbranch.kotlinexample

import ru.skillbranch.kotlinexample.extensions.isValidPhone
import ru.skillbranch.kotlinexample.extensions.trimPhone


object UserHolder {
    private val map = mutableMapOf<String, User>()

    fun registerUser (
        fullName: String,
        email: String,
        password: String
        ) = if (!hasPassword(password)) {
            User.makeUser(fullName, email = email, password = password)
                .also { user -> map[user.login] = user }
        } else throw IllegalArgumentException("A user with this email already exists")


    fun loginUser(login: String, password: String) : String? {
        var currentLogin = login.trim()
        if(login.isValidPhone()) {
            currentLogin = currentLogin.trimPhone()
        }
        return map[currentLogin]?.run {
            if(checkPassword(password)) this.userInfo
            else null
        }
    }

    fun hasPassword(password: String) : Boolean {
        return if(map.values.filter { it.checkPassword(password) }.isNotEmpty()) true
        else false
    }

    fun registerUserByPhone(fullName: String, rawPhone: String)  = if(map.values.filter { it.checkPhone(rawPhone.trimPhone()) }.isNullOrEmpty()) {
        User.makeUser(fullName, phone = rawPhone)
            .also {
                    user -> map[user.login] = user
            }
    } else throw IllegalArgumentException("A user with this phone already exists")

    fun requestAccessCode(login: String): Unit {
        var currentLogin = login.trim()
        if(login.isValidPhone()) {
            currentLogin = currentLogin.trimPhone()
        }
        map[currentLogin]?.run {
            this.accessCode = this.changePassword()
        }
    }
}