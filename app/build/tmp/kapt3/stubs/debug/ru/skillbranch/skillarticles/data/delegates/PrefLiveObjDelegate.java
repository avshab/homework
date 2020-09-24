package ru.skillbranch.skillarticles.data.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u00040\u0002B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ%\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00042\u0006\u0010\u000e\u001a\u00020\u00032\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0096\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/skillbranch/skillarticles/data/delegates/PrefLiveObjDelegate;", "T", "Lkotlin/properties/ReadOnlyProperty;", "", "Landroidx/lifecycle/LiveData;", "fieldKey", "", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "preferences", "Landroid/content/SharedPreferences;", "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Landroid/content/SharedPreferences;)V", "storedValue", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "app_debug"})
public final class PrefLiveObjDelegate<T extends java.lang.Object> implements kotlin.properties.ReadOnlyProperty<java.lang.Object, androidx.lifecycle.LiveData<T>> {
    private androidx.lifecycle.LiveData<T> storedValue;
    private final java.lang.String fieldKey = null;
    private final com.squareup.moshi.JsonAdapter<T> adapter = null;
    private final android.content.SharedPreferences preferences = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<T> getValue(@org.jetbrains.annotations.NotNull()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    public PrefLiveObjDelegate(@org.jetbrains.annotations.NotNull()
    java.lang.String fieldKey, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<T> adapter, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        super();
    }
}