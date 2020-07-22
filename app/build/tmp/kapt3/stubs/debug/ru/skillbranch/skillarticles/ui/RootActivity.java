package ru.skillbranch.skillarticles.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lru/skillbranch/skillarticles/ui/RootActivity;", "Lru/skillbranch/skillarticles/ui/base/BaseActivity;", "Lru/skillbranch/skillarticles/viewmodels/RootViewModel;", "()V", "isAuth", "", "()Z", "setAuth", "(Z)V", "layout", "", "getLayout", "()I", "viewModel", "getViewModel", "()Lru/skillbranch/skillarticles/viewmodels/RootViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "renderNotification", "notify", "Lru/skillbranch/skillarticles/viewmodels/base/Notify;", "subscribeOnState", "state", "Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "app_debug"})
public final class RootActivity extends ru.skillbranch.skillarticles.ui.base.BaseActivity<ru.skillbranch.skillarticles.viewmodels.RootViewModel> {
    private boolean isAuth = false;
    private final int layout = ru.skillbranch.skillarticles.R.layout.activity_root;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isAuth() {
        return false;
    }
    
    public final void setAuth(boolean p0) {
    }
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.skillarticles.viewmodels.RootViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void renderNotification(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.Notify notify) {
    }
    
    @java.lang.Override()
    public void subscribeOnState(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.IViewModelState state) {
    }
    
    public RootActivity() {
        super();
    }
}