package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bH&J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH&J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\rH&\u00a8\u0006 "}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/IArticleRepository;", "", "decrementLike", "", "articleId", "", "fetchArticleContent", "findArticle", "Landroidx/lifecycle/LiveData;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleFull;", "findArticleCommentCount", "", "getAppSettings", "Lru/skillbranch/skillarticles/data/models/AppSettings;", "incrementLike", "isAuth", "", "loadAllComments", "Lru/skillbranch/skillarticles/data/repositories/CommentsDataFactory;", "total", "loadCommentsByRange", "", "Lru/skillbranch/skillarticles/data/models/CommentItemData;", "slug", "size", "sendMessage", "text", "answerToSlug", "toggleBookmark", "toggleLike", "updateSettings", "copy", "app_debug"})
public abstract interface IArticleRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.local.entities.ArticleFull> findArticle(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.models.AppSettings> getAppSettings();
    
    public abstract void toggleLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    public abstract void toggleBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> isAuth();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ru.skillbranch.skillarticles.data.models.CommentItemData> loadCommentsByRange(@org.jetbrains.annotations.Nullable()
    java.lang.String slug, int size, @org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    public abstract void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String answerToSlug);
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.skillbranch.skillarticles.data.repositories.CommentsDataFactory loadAllComments(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, int total);
    
    public abstract void decrementLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    public abstract void incrementLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    public abstract void updateSettings(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.models.AppSettings copy);
    
    public abstract void fetchArticleContent(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> findArticleCommentCount(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
}