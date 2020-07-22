package ru.skillbranch.skillarticles.data.local.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "article_tag_x_ref", primaryKeys = {"t_id", "a_id"}, foreignKeys = {@androidx.room.ForeignKey(entity = ru.skillbranch.skillarticles.data.local.entities.Article.class, childColumns = {"a_id"}, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lru/skillbranch/skillarticles/data/local/entities/ArticleTagXRef;", "", "articleId", "", "tagId", "(Ljava/lang/String;Ljava/lang/String;)V", "getArticleId", "()Ljava/lang/String;", "getTagId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class ArticleTagXRef {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "a_id")
    private final java.lang.String articleId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "t_id")
    private final java.lang.String tagId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArticleId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTagId() {
        return null;
    }
    
    public ArticleTagXRef(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    java.lang.String tagId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.local.entities.ArticleTagXRef copy(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    java.lang.String tagId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}