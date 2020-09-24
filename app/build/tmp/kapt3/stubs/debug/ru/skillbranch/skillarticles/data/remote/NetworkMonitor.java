package ru.skillbranch.skillarticles.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00060\u00060\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000f0\u000f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lru/skillbranch/skillarticles/data/remote/NetworkMonitor;", "", "()V", "cm", "Landroid/net/ConnectivityManager;", "isConnected", "", "()Z", "setConnected", "(Z)V", "isConnectedLive", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "networkTypeLive", "Lru/skillbranch/skillarticles/data/remote/NetworkType;", "getNetworkTypeLive", "obtainNetworkType", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "registerNetworkMonitor", "", "ctx", "Landroid/content/Context;", "setNetworkIsConnected", "app_debug"})
public final class NetworkMonitor {
    private static boolean isConnected = false;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isConnectedLive = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.data.remote.NetworkType> networkTypeLive = null;
    private static android.net.ConnectivityManager cm;
    public static final ru.skillbranch.skillarticles.data.remote.NetworkMonitor INSTANCE = null;
    
    public final boolean isConnected() {
        return false;
    }
    
    public final void setConnected(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isConnectedLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.data.remote.NetworkType> getNetworkTypeLive() {
        return null;
    }
    
    public final void registerNetworkMonitor(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
    }
    
    private final ru.skillbranch.skillarticles.data.remote.NetworkType obtainNetworkType(android.net.NetworkCapabilities networkCapabilities) {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.NONE)
    public final void setNetworkIsConnected(boolean isConnected) {
    }
    
    private NetworkMonitor() {
        super();
    }
}