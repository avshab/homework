package ru.skillbranch.skillarticles.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0012R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u001a8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006#"}, d2 = {"Lru/skillbranch/skillarticles/data/local/PrefManager;", "", "()V", "appSettings", "Landroidx/lifecycle/MediatorLiveData;", "Lru/skillbranch/skillarticles/data/models/AppSettings;", "getAppSettings", "()Landroidx/lifecycle/MediatorLiveData;", "<set-?>", "", "isAuth", "()Ljava/lang/Boolean;", "setAuth", "(Ljava/lang/Boolean;)V", "isAuth$delegate", "Lkotlin/properties/ReadWriteProperty;", "isAuthLiveData", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isAuthLiveData$delegate", "Lkotlin/properties/ReadOnlyProperty;", "isBigText", "isBigText$delegate", "isDarkMode", "isDarkMode$delegate", "preferences", "Landroid/content/SharedPreferences;", "getPreferences$app_debug", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/Lazy;", "clearAll", "", "updateSettings", "settings", "app_debug"})
public final class PrefManager {
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy preferences$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final kotlin.properties.ReadWriteProperty isAuth$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.properties.ReadOnlyProperty isAuthLiveData$delegate = null;
    private static final kotlin.properties.ReadOnlyProperty isDarkMode$delegate = null;
    private static final kotlin.properties.ReadOnlyProperty isBigText$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MediatorLiveData<ru.skillbranch.skillarticles.data.models.AppSettings> appSettings = null;
    public static final ru.skillbranch.skillarticles.data.local.PrefManager INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPreferences$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isAuth() {
        return null;
    }
    
    public final void setAuth(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isAuthLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isDarkMode() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isBigText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<ru.skillbranch.skillarticles.data.models.AppSettings> getAppSettings() {
        return null;
    }
    
    public final void clearAll() {
    }
    
    public final void updateSettings(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.models.AppSettings settings) {
    }
    
    private PrefManager() {
        super();
    }
}