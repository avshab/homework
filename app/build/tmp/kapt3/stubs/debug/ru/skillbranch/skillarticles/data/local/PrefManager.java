package ru.skillbranch.skillarticles.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0004R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0011R+\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b \u0010!R/\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0003\u001a\u0004\u0018\u00010#8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b)\u0010\u000b\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R#\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0011R+\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b1\u0010\u000b\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\t\u00a8\u00066\u00b2\u0006\u0010\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u008a\u0084\u0002\u00b2\u0006\u0010\u00108\u001a\b\u0012\u0004\u0012\u00020\u00130\rX\u008a\u0084\u0002\u00b2\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\u00130\rX\u008a\u0084\u0002"}, d2 = {"Lru/skillbranch/skillarticles/data/local/PrefManager;", "", "()V", "<set-?>", "", "accessToken", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "accessToken$delegate", "Lkotlin/properties/ReadWriteProperty;", "appSettings", "Landroidx/lifecycle/LiveData;", "Lru/skillbranch/skillarticles/data/models/AppSettings;", "kotlin.jvm.PlatformType", "getAppSettings", "()Landroidx/lifecycle/LiveData;", "isAuthLive", "", "isAuthLive$delegate", "Lkotlin/Lazy;", "isBigText", "()Z", "setBigText", "(Z)V", "isBigText$delegate", "isDarkMode", "setDarkMode", "isDarkMode$delegate", "preferences", "Landroid/content/SharedPreferences;", "getPreferences$app_debug", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lru/skillbranch/skillarticles/data/models/User;", "profile", "getProfile", "()Lru/skillbranch/skillarticles/data/models/User;", "setProfile", "(Lru/skillbranch/skillarticles/data/models/User;)V", "profile$delegate", "profileLive", "getProfileLive", "profileLive$delegate", "Lru/skillbranch/skillarticles/data/delegates/PrefLiveObjDelegate;", "refreshToken", "getRefreshToken", "setRefreshToken", "refreshToken$delegate", "clearAll", "", "replaceAvatarUrl", "url", "app_debug", "token", "isDarkModeLive", "isBigTextLive"})
public final class PrefManager {
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy preferences$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.properties.ReadWriteProperty isDarkMode$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.properties.ReadWriteProperty isBigText$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.properties.ReadWriteProperty accessToken$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.properties.ReadWriteProperty refreshToken$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private static final kotlin.properties.ReadWriteProperty profile$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy isAuthLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final ru.skillbranch.skillarticles.data.delegates.PrefLiveObjDelegate profileLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.models.AppSettings> appSettings = null;
    public static final ru.skillbranch.skillarticles.data.local.PrefManager INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPreferences$app_debug() {
        return null;
    }
    
    public final boolean isDarkMode() {
        return false;
    }
    
    public final void setDarkMode(boolean p0) {
    }
    
    public final boolean isBigText() {
        return false;
    }
    
    public final void setBigText(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    public final void setRefreshToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ru.skillbranch.skillarticles.data.models.User getProfile() {
        return null;
    }
    
    public final void setProfile(@org.jetbrains.annotations.Nullable()
    ru.skillbranch.skillarticles.data.models.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isAuthLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.models.User> getProfileLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.models.AppSettings> getAppSettings() {
        return null;
    }
    
    public final void clearAll() {
    }
    
    public final void replaceAvatarUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    private PrefManager() {
        super();
    }
}