package ru.skillbranch.skillarticles.ui.custom.behaviors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J8\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016\u00a8\u0006\u0015"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/behaviors/BottombarBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lru/skillbranch/skillarticles/ui/custom/Bottombar;", "()V", "onNestedPreScroll", "", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "target", "Landroid/view/View;", "dx", "", "dy", "consumed", "", "type", "onStartNestedScroll", "", "directTargetChild", "axes", "app_debug"})
public final class BottombarBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<ru.skillbranch.skillarticles.ui.custom.Bottombar> {
    
    @java.lang.Override()
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.ui.custom.Bottombar child, @org.jetbrains.annotations.NotNull()
    android.view.View directTargetChild, @org.jetbrains.annotations.NotNull()
    android.view.View target, int axes, int type) {
        return false;
    }
    
    @java.lang.Override()
    public void onNestedPreScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.ui.custom.Bottombar child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int dx, int dy, @org.jetbrains.annotations.NotNull()
    int[] consumed, int type) {
    }
    
    public BottombarBehavior() {
        super();
    }
}