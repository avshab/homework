package ru.skillbranch.skillarticles.ui.custom.delegates

import android.content.Context
import android.content.res.Resources
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.core.view.isVisible
import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AttrValue (@AttrRes private val res: Int): ReadOnlyProperty<Context, Int> {
    private var value: Int? = null
    override fun getValue(thisRef: Context, property: KProperty<*>): Int {
        if(value == null) {
            val tv = TypedValue()
            if(thisRef.theme.resolveAttribute(res, tv, true)) value = tv.data
            else throw Resources.NotFoundException("Resource with id $res not found")
        }
        return value!!
    }
}
//
//class TextViewDelegate(val tv: TextView, val hideWhenEmpty: Boolean = true) : ReadWriteProperty<View, String?> {
//    private var value: String? = null
//    override fun getValue(thisRef: View, property: KProperty<*>): String? = value
//
//    override fun setValue(thisRef: View, property: KProperty<*>, value: String?) {
//        this.value  = value
//        tv.text = value
//        tv.isVisible = hideWhenEmpty && !value.isNullOrEmpty()
//    }
//}

//from custom view
//var title by TextViewDelegate