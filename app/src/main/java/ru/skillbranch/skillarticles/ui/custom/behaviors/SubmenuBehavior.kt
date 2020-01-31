package ru.skillbranch.skillarticles.ui.custom.behaviors

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.marginRight
import ru.skillbranch.skillarticles.ui.custom.ArticleSubmenu
import ru.skillbranch.skillarticles.ui.custom.Bottombar


class SubmenuBehavior() : CoordinatorLayout.Behavior<ArticleSubmenu>() {
    constructor(context: Context, attrs: AttributeSet) : this()

    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: ArticleSubmenu,
        dependency: View
    ): Boolean {
        return dependency is Bottombar
    }//не надо переопределять если есть anchor

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: ArticleSubmenu,
        dependency: View
    ): Boolean {
        return if (child.isOpen && dependency.translationY >= 0f) {
            animate(child, dependency)
            true
        } else false
    }

    private fun animate(child: View, dependency: View) {
        val fraction = dependency.translationY / dependency.height
        child.translationX = (child.width + child.marginRight) * fraction
    }

//    override fun onDependentViewRemoved(parent: CoordinatorLayout, child: V, dependency: View) {
//        super.onDependentViewRemoved(parent, child, dependency)
//    }
//
//    override fun onStartNestedScroll(
//        coordinatorLayout: CoordinatorLayout,
//        child: V,
//        directTargetChild: View,
//        target: View,
//        axes: Int,
//        type: Int//тип скрола
//    ): Boolean {
//        return axes == ViewCompat.SCROLL_AXIS_VERTICAL
//    }//указываем оси для отслеживания
//
//    override fun onNestedPreScroll( //когда скрол еще не отработал (обычно все анимации здесь запускаются)
//        coordinatorLayout: CoordinatorLayout,
//        child: V,
//        target: View,
//        dx: Int,
//        dy: Int,
//        consumed: IntArray,
//        type: Int
//    ) {
//        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type)
//        if (child.visibility == View.VISIBLE) {
//            child.translationX = max(0f, min(hypot(centerX, centerY), child.translationX + dy))
//            child.translationY = max(0f, min(hypot(centerX, centerY), child.translationY + dy))
//        }
//    }
//
//    override fun onNestedScroll( //после прокрутки с неиспользоваными пикселями
//        coordinatorLayout: CoordinatorLayout,
//        child: V,
//        target: View,
//        dxConsumed: Int,
//        dyConsumed: Int,
//        dxUnconsumed: Int,
//        dyUnconsumed: Int,
//        type: Int,
//        consumed: IntArray
//    ) {
//        super.onNestedScroll(
//            coordinatorLayout,
//            child,
//            target,
//            dxConsumed,
//            dyConsumed,
//            dxUnconsumed,
//            dyUnconsumed,
//            type,
//            consumed
//        )
//    }
//
//    override fun onStopNestedScroll(
//        coordinatorLayout: CoordinatorLayout,
//        child: V,
//        target: View,
//        type: Int
//    ) {
//        super.onStopNestedScroll(coordinatorLayout, child, target, type)
//    }
}