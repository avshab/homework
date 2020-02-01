package ru.skillbranch.skillarticles.data.delegates

import androidx.fragment.app.FragmentActivity
import ru.skillbranch.skillarticles.data.local.PrefManager
import ru.skillbranch.skillarticles.viewmodels.base.ViewModelDelegate
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class PrefDelegate<T>(private val defaultValue: T) : ReadWriteProperty<PrefManager, T?> {

    override fun getValue(thisRef: PrefManager, property: KProperty<*>): T? = when {
        defaultValue is String -> thisRef.preferences.getString(property.name, defaultValue)
        defaultValue is Boolean -> thisRef.preferences.getBoolean(property.name, defaultValue)
        defaultValue is Int -> thisRef.preferences.getInt(property.name, defaultValue)
        defaultValue is Long -> thisRef.preferences.getLong(property.name, defaultValue)
        defaultValue is Float -> thisRef.preferences.getFloat(property.name, defaultValue)
        else -> null
    } as T

    override fun setValue(thisRef: PrefManager, property: KProperty<*>, value: T?) {
        when {
            value is String -> thisRef.preferences.edit().putString(property.name, value).apply()
            value is Boolean -> thisRef.preferences.edit().putBoolean(property.name, value).apply()
            value is Int -> thisRef.preferences.edit().putInt(property.name, value).apply()
            value is Long -> thisRef.preferences.edit().putLong(property.name, value).apply()
            value is Float -> thisRef.preferences.edit().putFloat(property.name, value).apply()
            else -> return
        }
    }
}