package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0018H\u0016J(\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\u0010$\u001a\u0004\u0018\u00010\u00122\u0006\u0010%\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010&\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010\u0012H\u0016J(\u0010)\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/ArticleRepository;", "Lru/skillbranch/skillarticles/data/repositories/IArticleRepository;", "()V", "articleContentDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticleContentsDao;", "articleCountsDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticleCountsDao;", "articlePersonalDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticlePersonalInfosDao;", "articlesDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticlesDao;", "network", "Lru/skillbranch/skillarticles/data/NetworkDataHolder;", "preferences", "Lru/skillbranch/skillarticles/data/local/PrefManager;", "decrementLike", "", "articleId", "", "fetchArticleContent", "findArticle", "Landroidx/lifecycle/LiveData;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleFull;", "findArticleCommentCount", "", "getAppSettings", "Lru/skillbranch/skillarticles/data/models/AppSettings;", "incrementLike", "isAuth", "", "loadAllComments", "Lru/skillbranch/skillarticles/data/repositories/CommentsDataFactory;", "totalCount", "loadCommentsByRange", "", "Lru/skillbranch/skillarticles/data/models/CommentItemData;", "slug", "size", "sendMessage", "comment", "answerToSlug", "setupTestDao", "toggleBookmark", "toggleLike", "updateSettings", "settings", "app_debug"})
public final class ArticleRepository implements ru.skillbranch.skillarticles.data.repositories.IArticleRepository {
    private static final ru.skillbranch.skillarticles.data.NetworkDataHolder network = null;
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
    
    @java.lang.Override()
    public void toggleLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
    }
    
    @java.lang.Override()
    public void toggleBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
    }
    
    @java.lang.Override()
    public void updateSettings(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.models.AppSettings settings) {
    }
    
    @java.lang.Override()
    public void fetchArticleContent(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Integer> findArticleCommentCount(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> isAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.skillarticles.data.repositories.CommentsDataFactory loadAllComments(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, int totalCount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ru.skillbranch.skillarticles.data.models.CommentItemData> loadCommentsByRange(@org.jetbrains.annotations.Nullable()
    java.lang.String slug, int size, @org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
        return null;
    }
    
    @java.lang.Override()
    public void decrementLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
    }
    
    @java.lang.Override()
    public void incrementLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
    }
    
    @java.lang.Override()
    public void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    java.lang.String comment, @org.jetbrains.annotations.Nullable()
    java.lang.String answerToSlug) {
    }
    
    private ArticleRepository() {
        super();
    }
}