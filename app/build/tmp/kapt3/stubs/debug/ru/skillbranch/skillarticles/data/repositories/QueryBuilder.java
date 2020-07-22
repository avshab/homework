package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/QueryBuilder;", "", "()V", "joinTables", "", "order", "selectColumns", "table", "whereCondition", "appendWhere", "condition", "logic", "build", "innerJoin", "on", "orderBy", "column", "isDesc", "", "app_debug"})
public final class QueryBuilder {
    private java.lang.String table;
    private java.lang.String selectColumns = "*";
    private java.lang.String joinTables;
    private java.lang.String whereCondition;
    private java.lang.String order;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.repositories.QueryBuilder table(@org.jetbrains.annotations.NotNull()
    java.lang.String table) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.repositories.QueryBuilder orderBy(@org.jetbrains.annotations.NotNull()
    java.lang.String column, boolean isDesc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.repositories.QueryBuilder appendWhere(@org.jetbrains.annotations.NotNull()
    java.lang.String condition, @org.jetbrains.annotations.NotNull()
    java.lang.String logic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.repositories.QueryBuilder innerJoin(@org.jetbrains.annotations.NotNull()
    java.lang.String table, @org.jetbrains.annotations.NotNull()
    java.lang.String on) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String build() {
        return null;
    }
    
    public QueryBuilder() {
        super();
    }
}