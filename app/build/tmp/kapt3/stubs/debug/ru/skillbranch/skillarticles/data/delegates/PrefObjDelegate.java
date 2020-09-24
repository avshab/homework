package ru.skillbranch.skillarticles.data.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J+\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0086\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lru/skillbranch/skillarticles/data/delegates/PrefObjDelegate;", "T", "", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "(Lcom/squareup/moshi/JsonAdapter;)V", "storedValue", "Ljava/lang/Object;", "provideDelegate", "Lkotlin/properties/ReadWriteProperty;", "Lru/skillbranch/skillarticles/data/local/PrefManager;", "thisRef", "prop", "Lkotlin/reflect/KProperty;", "app_debug"})
public final class PrefObjDelegate<T extends java.lang.Object> {
    private T storedValue;
    private final com.squareup.moshi.JsonAdapter<T> adapter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.properties.ReadWriteProperty<ru.skillbranch.skillarticles.data.local.PrefManager, T> provideDelegate(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.PrefManager thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> prop) {
        return null;
    }
    
    public PrefObjDelegate(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<T> adapter) {
        super();
    }
}