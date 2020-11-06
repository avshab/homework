package ru.skillbranch.skillarticles.ui.auth;

import java.lang.System;

/**
 * Created by Anna Shabaeva on 05.11.2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tB\u0005\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020 H\u0016R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006!"}, d2 = {"Lru/skillbranch/skillarticles/ui/auth/RegistrationFragment;", "Lru/skillbranch/skillarticles/ui/base/BaseFragment;", "Lru/skillbranch/skillarticles/viewmodels/auth/AuthViewModel;", "mockRoot", "Lru/skillbranch/skillarticles/ui/RootActivity;", "mockFactory", "Lkotlin/Function1;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Lru/skillbranch/skillarticles/ui/RootActivity;Lkotlin/jvm/functions/Function1;)V", "()V", "_mockFactory", "get_mockFactory", "()Lkotlin/jvm/functions/Function1;", "set_mockFactory", "(Lkotlin/jvm/functions/Function1;)V", "args", "Lru/skillbranch/skillarticles/ui/auth/RegistrationFragmentArgs;", "getArgs", "()Lru/skillbranch/skillarticles/ui/auth/RegistrationFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "layout", "", "getLayout", "()I", "viewModel", "getViewModel", "()Lru/skillbranch/skillarticles/viewmodels/auth/AuthViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "setupViews", "", "app_debug"})
public final class RegistrationFragment extends ru.skillbranch.skillarticles.ui.base.BaseFragment<ru.skillbranch.skillarticles.viewmodels.auth.AuthViewModel> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super androidx.savedstate.SavedStateRegistryOwner, ? extends androidx.lifecycle.ViewModelProvider.Factory> _mockFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final int layout = ru.skillbranch.skillarticles.R.layout.fragment_registration;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<androidx.savedstate.SavedStateRegistryOwner, androidx.lifecycle.ViewModelProvider.Factory> get_mockFactory() {
        return null;
    }
    
    public final void set_mockFactory(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super androidx.savedstate.SavedStateRegistryOwner, ? extends androidx.lifecycle.ViewModelProvider.Factory> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.skillarticles.viewmodels.auth.AuthViewModel getViewModel() {
        return null;
    }
    
    private final ru.skillbranch.skillarticles.ui.auth.RegistrationFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void setupViews() {
    }
    
    public RegistrationFragment() {
        super();
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.NONE)
    public RegistrationFragment(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.ui.RootActivity mockRoot, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super androidx.savedstate.SavedStateRegistryOwner, ? extends androidx.lifecycle.ViewModelProvider.Factory> mockFactory) {
        super();
    }
}