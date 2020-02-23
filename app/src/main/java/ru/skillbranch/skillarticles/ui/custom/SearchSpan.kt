package ru.skillbranch.skillarticles.ui.custom

import android.text.TextPaint
import android.text.style.BackgroundColorSpan
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.view.View
import androidx.core.graphics.ColorUtils

//оптимизировнно отрисовывает текст
open class SearchSpan(bgColor: Int, private val fgColor: Int) : BackgroundColorSpan(bgColor) {
    private val alphaColor by lazy {
        ColorUtils.setAlphaComponent(backgroundColor, 160)
    }

    override fun updateDrawState(textPaint: TextPaint) {
        textPaint.bgColor = alphaColor
        textPaint.color = fgColor
    }
}

open class ActiveTextSpan(private val fgColor: Int) : ClickableSpan() {
    override fun onClick(widget: View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}