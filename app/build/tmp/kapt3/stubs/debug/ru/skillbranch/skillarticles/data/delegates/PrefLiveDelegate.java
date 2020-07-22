package ru.skillbranch.skillarticles.data.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J/\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\r2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0086\u0002R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lru/skillbranch/skillarticles/data/delegates/PrefLiveDelegate;", "T", "", "defaultValue", "fieldKey", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "Ljava/lang/Object;", "getFieldKey", "()Ljava/lang/String;", "storedValue", "Landroidx/lifecycle/LiveData;", "provideDelegate", "Lkotlin/properties/ReadOnlyProperty;", "Lru/skillbranch/skillarticles/data/local/PrefManager;", "thisRef", "prop", "Lkotlin/reflect/KProperty;", "app_debug"})
public final class PrefLiveDelegate<T extends java.lang.Object> {
    private androidx.lifecycle.LiveData<T> storedValue;
    private final T defaultValue = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String fieldKey = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.properties.ReadOnlyProperty<ru.skillbranch.skillarticles.data.local.PrefManager, androidx.lifecycle.LiveData<T>> provideDelegate(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.PrefManager thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> prop) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFieldKey() {
        return null;
    }
    
    public PrefLiveDelegate(T defaultValue, @org.jetbrains.annotations.Nullable()
    java.lang.String fieldKey) {
        super();
    }
}