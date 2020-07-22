package ru.skillbranch.skillarticles.ui.custom.behaviors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016\u00a8\u0006\u0013"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/behaviors/SubmenuBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lru/skillbranch/skillarticles/ui/custom/ArticleSubmenu;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "()V", "animate", "", "child", "Landroid/view/View;", "dependency", "layoutDependsOn", "", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "onDependentViewChanged", "app_debug"})
public final class SubmenuBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<ru.skillbranch.skillarticles.ui.custom.ArticleSubmenu> {
    
    @java.lang.Override()
    public boolean layoutDependsOn(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.ui.custom.ArticleSubmenu child, @org.jetbrains.annotations.NotNull()
    android.view.View dependency) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onDependentViewChanged(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.ui.custom.ArticleSubmenu child, @org.jetbrains.annotations.NotNull()
    android.view.View dependency) {
        return false;
    }
    
    private final void animate(android.view.View child, android.view.View dependency) {
    }
    
    public SubmenuBehavior() {
        super();
    }
    
    public SubmenuBehavior(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super();
    }
}