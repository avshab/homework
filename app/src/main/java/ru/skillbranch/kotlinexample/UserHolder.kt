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

    fun registerUserByPhone(fullName: String, rawPhone: String) : User {
        if(!rawPhone.isValidPhone()) throw IllegalArgumentException("Enter a valid phone number starting with a + and containing 11 digits")

        return if (map.values.filter { it.checkPhone(rawPhone.trimPhone()) }.isNullOrEmpty()) {
            User.makeUser(fullName, phone = rawPhone)
                .also { user ->
                    map[user.login] = user
                }
        } else throw IllegalArgumentException("A user with this phone already exists")
    }

    fun requestAccessCode(login: String): Unit {
        var currentLogin = login.trim()
        if(login.isValidPhone()) {
            currentLogin = currentLogin.trimPhone()
        }
        map[currentLogin]?.run {
            this.accessCode = this.changePassword()
        }
    }

    fun importUsers(list: List<String>) =
        list.map{
            val (fullName, email, access, phone) = it.split(";")
            val cuser = User.makeImportUser(fullName, email, access, phone)?.also { user -> map[user.login] = user }
            val hhh =  cuser?.userInfo
            cuser
        }
}
