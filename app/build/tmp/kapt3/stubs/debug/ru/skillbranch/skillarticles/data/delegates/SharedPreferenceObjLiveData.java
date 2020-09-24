package ru.skillbranch.skillarticles.data.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0002\u00a2\u0006\u0002\u0010\u001aR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2 = {"Lru/skillbranch/skillarticles/data/delegates/SharedPreferenceObjLiveData;", "T", "Landroidx/lifecycle/LiveData;", "sharedPrefs", "Landroid/content/SharedPreferences;", "key", "", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;)V", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "preferenceChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "setSharedPrefs", "(Landroid/content/SharedPreferences;)V", "onActive", "", "onInactive", "readValue", "()Ljava/lang/Object;", "app_debug"})
public final class SharedPreferenceObjLiveData<T extends java.lang.Object> extends androidx.lifecycle.LiveData<T> {
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener preferenceChangeListener = null;
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences sharedPrefs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String key;
    @org.jetbrains.annotations.NotNull()
    private final com.squareup.moshi.JsonAdapter<T> adapter = null;
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final T readValue() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.moshi.JsonAdapter<T> getAdapter() {
        return null;
    }
    
    public SharedPreferenceObjLiveData(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPrefs, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<T> adapter) {
        super(null);
    }
}