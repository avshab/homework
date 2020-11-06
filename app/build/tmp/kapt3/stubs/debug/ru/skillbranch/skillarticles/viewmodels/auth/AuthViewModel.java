package ru.skillbranch.skillarticles.viewmodels.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016\u00a2\u0006\u0002\u0010\u0017J/\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016\u00a2\u0006\u0002\u0010\u0019J&\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/auth/AuthViewModel;", "Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "Lru/skillbranch/skillarticles/viewmodels/auth/AuthState;", "Lru/skillbranch/skillarticles/viewmodels/auth/IAuthViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "repository", "Lru/skillbranch/skillarticles/data/repositories/RootRepository;", "checkEmail", "", "email", "", "checkName", "name", "checkPassword", "password", "handleLogin", "", "login", "pass", "dest", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "handleRegister", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "isValid", "repeatPassword", "app_debug"})
public final class AuthViewModel extends ru.skillbranch.skillarticles.viewmodels.base.BaseViewModel<ru.skillbranch.skillarticles.viewmodels.auth.AuthState> implements ru.skillbranch.skillarticles.viewmodels.auth.IAuthViewModel {
    private final ru.skillbranch.skillarticles.data.repositories.RootRepository repository = null;
    
    @java.lang.Override()
    public void handleLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dest) {
    }
    
    @java.lang.Override()
    public void handleRegister(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dest) {
    }
    
    public final boolean isValid(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String repeatPassword) {
        return false;
    }
    
    private final boolean checkPassword(java.lang.String password) {
        return false;
    }
    
    private final boolean checkName(java.lang.String name) {
        return false;
    }
    
    private final boolean checkEmail(java.lang.String email) {
        return false;
    }
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handle) {
        super(null, null);
    }
}