package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017H\u0016J\u0019\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017H\u0016J,\u0010 \u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001a2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00100$H\u0016J\u0019\u0010&\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\'\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J+\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J(\u0010,\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0019\u0010-\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010.\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u001cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/ArticleRepository;", "Lru/skillbranch/skillarticles/data/repositories/IArticleRepository;", "()V", "articleContentDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticleContentsDao;", "articleCountsDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticleCountsDao;", "articlePersonalDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticlePersonalInfosDao;", "articlesDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticlesDao;", "network", "Lru/skillbranch/skillarticles/data/remote/RestService;", "preferences", "Lru/skillbranch/skillarticles/data/local/PrefManager;", "addBookmark", "", "articleId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decrementLike", "fetchArticleContent", "findArticle", "Landroidx/lifecycle/LiveData;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleFull;", "findArticleCommentCount", "", "getAppSettings", "Lru/skillbranch/skillarticles/data/models/AppSettings;", "incrementLike", "isAuth", "", "loadAllComments", "Lru/skillbranch/skillarticles/data/repositories/CommentsDataFactory;", "totalCount", "errHandler", "Lkotlin/Function1;", "", "refreshCommentsCount", "removeBookmark", "sendMessage", "message", "answerToMessageId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupTestDao", "toggleBookmark", "toggleLike", "updateSettings", "settings", "app_debug"})
public final class ArticleRepository implements ru.skillbranch.skillarticles.data.repositories.IArticleRepository {
    private static final ru.skillbranch.skillarticles.data.remote.RestService network = null;
    private static final ru.skillbranch.skillarticles.data.local.PrefManager preferences = null;
    private static ru.skillbranch.skillarticles.data.local.dao.ArticlesDao articlesDao;
    private static ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao articlePersonalDao;
    private static ru.skillbranch.skillarticles.data.local.dao.ArticleCountsDao articleCountsDao;
    private static ru.skillbranch.skillarticles.data.local.dao.ArticleContentsDao articleContentDao;
    public static final ru.skillbranch.skillarticles.data.repositories.ArticleRepository INSTANCE = null;
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.NONE)
    public final void setupTestDao(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.dao.ArticlesDao articlesDao, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao articlePersonalDao, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.dao.ArticleCountsDao articleCountsDao, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.dao.ArticleContentsDao articleContentDao) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.local.entities.ArticleFull> findArticle(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.models.AppSettings> getAppSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> isAuth() {
        return null;
    }
    
    @java.lang.Override()
    public void updateSettings(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.models.AppSettings settings) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object decrementLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object incrementLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object toggleLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object toggleBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String answerToMessageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object refreshCommentsCount(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchArticleContent(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Integer> findArticleCommentCount(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.skillarticles.data.repositories.CommentsDataFactory loadAllComments(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, int totalCount, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errHandler) {
        return null;
    }
    
    private ArticleRepository() {
        super();
    }
}