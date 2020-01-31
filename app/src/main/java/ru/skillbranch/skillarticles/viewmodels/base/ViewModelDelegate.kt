package ru.skillbranch.skillarticles.ui.base

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import ru.skillbranch.skillarticles.viewmodels.base.ViewModelFactory
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ViewModelDelegate<T : ViewModel>(private val clazz: Class<T>, private val arg: Any?) :
    ReadOnlyProperty<FragmentActivity, T> {

    override fun getValue(thisRef: FragmentActivity, property: KProperty<*>): T {
        return ViewModelProviders.of(thisRef, ViewModelFactory(property)).get(clazz)
    }
}