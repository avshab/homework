package ru.skillbranch.skillarticles.data.local

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.preference.PreferenceManager
import ru.skillbranch.skillarticles.App
import ru.skillbranch.skillarticles.data.delegates.PrefDelegate
import ru.skillbranch.skillarticles.data.delegates.PrefLiveDelegate
import ru.skillbranch.skillarticles.data.models.AppSettings


object PrefManager {
    /*private val preferenceChangeListener =
        SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
            Log.e("PrefManager", "pref change : key :$key d $isDarkMode b $isBigText");
            when (key) {
                ::isDarkMode.name -> appSettings.postValue(appSettings.value!!.copy(isDarkMode = isDarkMode!!))
                ::isBigText.name -> appSettings.postValue(appSettings.value!!.copy(isBigText = isBigText!!))
                ::isAuth.name -> isAuthLiveData.postValue(isAuth)
            }
        }*/

    internal val preferences: SharedPreferences by lazy {
        PreferenceManager.getDefaultSharedPreferences(App.applicationContext())
    }


    var isAuth by PrefDelegate(false)

    val isAuthLiveData: LiveData<Boolean> by PrefLiveDelegate(false, "isAuth")
    private val isDarkMode: LiveData<Boolean> by PrefLiveDelegate(false)
    private val isBigText: LiveData<Boolean> by PrefLiveDelegate(false)

    val appSettings = MediatorLiveData<AppSettings>().apply {
        value = AppSettings()
        addSource(isDarkMode) {
            val copy = value!!.copy(isDarkMode = it)
            if (value != copy) value = copy
        }
        addSource(isBigText) {
            val copy = value!!.copy(isBigText = it)
            if(value != copy)  value = copy
        }
    }

    fun clearAll() {
        preferences.edit().clear().apply()
    }

    fun updateSettings(settings: AppSettings) {
        with(preferences.edit()) {
            putBoolean("isDarkMode", settings.isDarkMode)
            putBoolean("isBigText", settings.isBigText)
            apply()
        }
    }
}