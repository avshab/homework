package ru.skillbranch.skillarticles.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001eH\u0014J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0003H&R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00028\u0000X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006/"}, d2 = {"Lru/skillbranch/skillarticles/ui/base/BaseActivity;", "T", "Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "bottombarBuilder", "Lru/skillbranch/skillarticles/ui/base/BottombarBuilder;", "getBottombarBuilder", "()Lru/skillbranch/skillarticles/ui/base/BottombarBuilder;", "layout", "", "getLayout", "()I", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "toolbarBuilder", "Lru/skillbranch/skillarticles/ui/base/ToolbarBuilder;", "getToolbarBuilder", "()Lru/skillbranch/skillarticles/ui/base/ToolbarBuilder;", "viewModel", "getViewModel", "()Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRestoreInstanceState", "onSaveInstanceState", "outState", "onSupportNavigateUp", "", "renderLoading", "loadingState", "Lru/skillbranch/skillarticles/viewmodels/base/Loading;", "renderNotification", "notify", "Lru/skillbranch/skillarticles/viewmodels/base/Notify;", "subscribeOnNavigation", "command", "Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand;", "subscribeOnState", "state", "app_debug"})
public abstract class BaseActivity<T extends ru.skillbranch.skillarticles.viewmodels.base.BaseViewModel<? extends ru.skillbranch.skillarticles.viewmodels.base.IViewModelState>> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull()
    private final ru.skillbranch.skillarticles.ui.base.ToolbarBuilder toolbarBuilder = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.skillbranch.skillarticles.ui.base.BottombarBuilder bottombarBuilder = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract T getViewModel();
    
    protected abstract int getLayout();
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.ui.base.ToolbarBuilder getToolbarBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.ui.base.BottombarBuilder getBottombarBuilder() {
        return null;
    }
    
    public abstract void subscribeOnState(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.IViewModelState state);
    
    public abstract void renderNotification(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.Notify notify);
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void subscribeOnNavigation(ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand command) {
    }
    
    public void renderLoading(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.Loading loadingState) {
    }
    
    public BaseActivity() {
        super();
    }
}