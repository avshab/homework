package ru.skillbranch.skillarticles.data.local.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\'J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\'\u00a8\u0006\r"}, d2 = {"Lru/skillbranch/skillarticles/data/local/dao/BaseDao;", "T", "", "delete", "", "obj", "(Ljava/lang/Object;)V", "insert", "", "(Ljava/lang/Object;)J", "", "list", "update", "app_debug"})
public abstract interface BaseDao<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.util.List<java.lang.Long> insert(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    T obj);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    T obj);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    T obj);
}