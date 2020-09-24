package ru.skillbranch.skillarticles.data.remote.interceptors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lru/skillbranch/skillarticles/data/remote/interceptors/TokenAuthenticator;", "Lokhttp3/Authenticator;", "()V", "prefManager", "Lru/skillbranch/skillarticles/data/local/PrefManager;", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "app_debug"})
public final class TokenAuthenticator implements okhttp3.Authenticator {
    private final ru.skillbranch.skillarticles.data.local.PrefManager prefManager = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable()
    okhttp3.Route route, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response) {
        return null;
    }
    
    public TokenAuthenticator() {
        super();
    }
}