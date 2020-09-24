package ru.skillbranch.skillarticles.data.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0096\u0002R\u0010\u0010\u0007\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/skillbranch/skillarticles/data/delegates/PrefLiveDelegate;", "T", "Lkotlin/properties/ReadOnlyProperty;", "", "Landroidx/lifecycle/LiveData;", "fieldKey", "", "defaultValue", "preferences", "Landroid/content/SharedPreferences;", "(Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V", "Ljava/lang/Object;", "storedValue", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "app_debug"})
public final class PrefLiveDelegate<T extends java.lang.Object> implements kotlin.properties.ReadOnlyProperty<java.lang.Object, androidx.lifecycle.LiveData<T>> {
    private androidx.lifecycle.LiveData<T> storedValue;
    private final java.lang.String fieldKey = null;
    private final T defaultValue = null;
    private final android.content.SharedPreferences preferences = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<T> getValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    public PrefLiveDelegate(@org.jetbrains.annotations.NotNull()
    java.lang.String fieldKey, T defaultValue, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        super();
    }
}