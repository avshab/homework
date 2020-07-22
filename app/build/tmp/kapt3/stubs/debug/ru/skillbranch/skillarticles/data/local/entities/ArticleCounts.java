package ru.skillbranch.skillarticles.data.local.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "article_counts", foreignKeys = {@androidx.room.ForeignKey(entity = ru.skillbranch.skillarticles.data.local.entities.Article.class, childColumns = {"article_id"}, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lru/skillbranch/skillarticles/data/local/entities/ArticleCounts;", "", "articleId", "", "likes", "", "comments", "readDuration", "updatedAt", "Ljava/util/Date;", "(Ljava/lang/String;IIILjava/util/Date;)V", "getArticleId", "()Ljava/lang/String;", "getComments", "()I", "getLikes", "getReadDuration", "getUpdatedAt", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ArticleCounts {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "article_id")
    @androidx.room.PrimaryKey()
    private final java.lang.String articleId = null;
    private final int likes = 0;
    private final int comments = 0;
    @androidx.room.ColumnInfo(name = "read_duration")
    private final int readDuration = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "updated_at")
    private final java.util.Date updatedAt = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArticleId() {
        return null;
    }
    
    public final int getLikes() {
        return 0;
    }
    
    public final int getComments() {
        return 0;
    }
    
    public final int getReadDuration() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getUpdatedAt() {
        return null;
    }
    
    public ArticleCounts(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, int likes, int comments, int readDuration, @org.jetbrains.annotations.NotNull()
    java.util.Date updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.local.entities.ArticleCounts copy(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, int likes, int comments, int readDuration, @org.jetbrains.annotations.NotNull()
    java.util.Date updatedAt) {
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