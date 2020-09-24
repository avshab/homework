package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aH\u0016J\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u001aH\u0016J\u0019\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\"\u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J#\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u00162\u0006\u0010)\u001a\u00020\'H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020/H\u0016J\u0019\u00100\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u00101\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J8\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0019\u00103\u001a\u0002042\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00065"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/ArticlesRepository;", "Lru/skillbranch/skillarticles/data/repositories/IArticlesRepository;", "()V", "articleCountsDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticleCountsDao;", "articlePersonalDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticlePersonalInfosDao;", "articlesContentDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticleContentsDao;", "articlesDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticlesDao;", "categoriesDao", "Lru/skillbranch/skillarticles/data/local/dao/CategoriesDao;", "network", "Lru/skillbranch/skillarticles/data/remote/RestService;", "prefs", "Lru/skillbranch/skillarticles/data/local/PrefManager;", "tagsDao", "Lru/skillbranch/skillarticles/data/local/dao/TagsDao;", "addBookmark", "", "articleId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchArticleContent", "findCategoriesData", "Landroidx/lifecycle/LiveData;", "", "Lru/skillbranch/skillarticles/data/local/entities/CategoryData;", "findLastArticleId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findTags", "incrementTagUseCount", "tag", "insertArticlesToDb", "articles", "Lru/skillbranch/skillarticles/data/remote/res/ArticleRes;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadArticlesFromNetwork", "", "start", "size", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawQueryArticles", "Landroidx/paging/DataSource$Factory;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleItem;", "filter", "Lru/skillbranch/skillarticles/data/repositories/ArticleFilter;", "removeArticleContent", "removeBookmark", "setupTestDao", "toggleBookmark", "", "app_debug"})
public final class ArticlesRepository implements ru.skillbranch.skillarticles.data.repositories.IArticlesRepository {
    private static final ru.skillbranch.skillarticles.data.remote.RestService network = null;
    private static final ru.skillbranch.skillarticles.data.local.PrefManager prefs = null;
    private static ru.skillbranch.skillarticles.data.local.dao.ArticlesDao articlesDao;
    private static ru.skillbranch.skillarticles.data.local.dao.ArticleContentsDao articlesContentDao;
    private static ru.skillbranch.skillarticles.data.local.dao.ArticleCountsDao articleCountsDao;
    private static ru.skillbranch.skillarticles.data.local.dao.CategoriesDao categoriesDao;
    private static ru.skillbranch.skillarticles.data.local.dao.TagsDao tagsDao;
    private static ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao articlePersonalDao;
    public static final ru.skillbranch.skillarticles.data.repositories.ArticlesRepository INSTANCE = null;
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.NONE)
    public final void setupTestDao(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.dao.ArticlesDao articlesDao, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.dao.ArticleCountsDao articleCountsDao, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.dao.CategoriesDao categoriesDao, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.dao.TagsDao tagsDao, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao articlePersonalDao, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.dao.ArticleContentsDao articlesContentDao) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<java.lang.String>> findTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<ru.skillbranch.skillarticles.data.local.entities.CategoryData>> findCategoriesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource.Factory<java.lang.Integer, ru.skillbranch.skillarticles.data.local.entities.ArticleItem> rawQueryArticles(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.repositories.ArticleFilter filter) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object incrementTagUseCount(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadArticlesFromNetwork(@org.jetbrains.annotations.Nullable()
    java.lang.String start, int size, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2) {
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
    public java.lang.Object findLastArticleId(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchArticleContent(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeArticleContent(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    private ArticlesRepository() {
        super();
    }
}