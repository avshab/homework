package ru.skillbranch.skillarticles.viewmodels.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/auth/AuthViewModel;", "Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "Lru/skillbranch/skillarticles/viewmodels/auth/AuthState;", "Lru/skillbranch/skillarticles/viewmodels/auth/IAuthViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "repository", "Lru/skillbranch/skillarticles/data/repositories/RootRepository;", "handleLogin", "", "login", "", "pass", "dest", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "app_debug"})
public final class AuthViewModel extends ru.skillbranch.skillarticles.viewmodels.base.BaseViewModel<ru.skillbranch.skillarticles.viewmodels.auth.AuthState> implements ru.skillbranch.skillarticles.viewmodels.auth.IAuthViewModel {
    private final ru.skillbranch.skillarticles.data.repositories.RootRepository repository = null;
    
    @java.lang.Override()
    public void handleLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dest) {
    }
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handle) {
        super(null, null);
    }
}