package ru.skillbranch.skillarticles.viewmodels.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a2\u0006\u0002\u0010\tJ/\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/auth/IAuthViewModel;", "", "handleLogin", "", "login", "", "pass", "dest", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "handleRegister", "name", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "app_debug"})
public abstract interface IAuthViewModel {
    
    /**
     * обработка авторизации пользователя
     */
    public abstract void handleLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dest);
    
    public abstract void handleRegister(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dest);
}