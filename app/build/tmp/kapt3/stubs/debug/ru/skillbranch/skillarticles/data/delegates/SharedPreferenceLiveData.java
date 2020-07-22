package ru.skillbranch.skillarticles.data.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u001dR\u001c\u0010\u0007\u001a\u00028\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001e"}, d2 = {"Lru/skillbranch/skillarticles/data/delegates/SharedPreferenceLiveData;", "T", "Landroidx/lifecycle/LiveData;", "sharedPrefs", "Landroid/content/SharedPreferences;", "key", "", "defValue", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)V", "getDefValue", "()Ljava/lang/Object;", "setDefValue", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "preferenceChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "setSharedPrefs", "(Landroid/content/SharedPreferences;)V", "onActive", "", "onInactive", "readValue", "defaultValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "app_debug"})
public final class SharedPreferenceLiveData<T extends java.lang.Object> extends androidx.lifecycle.LiveData<T> {
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener preferenceChangeListener = null;
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences sharedPrefs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String key;
    private T defValue;
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    private final T readValue(T defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPrefs() {
        return null;
    }
    
    public final void setSharedPrefs(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public final void setKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final T getDefValue() {
        return null;
    }
    
    public final void setDefValue(T p0) {
    }
    
    public SharedPreferenceLiveData(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPrefs, @org.jetbrains.annotations.NotNull()
    java.lang.String key, T defValue) {
        super(null);
    }
}