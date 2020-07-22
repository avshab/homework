package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0016\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011H\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0016J0\u0010$\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/ArticlesRepository;", "Lru/skillbranch/skillarticles/data/repositories/IArticlesRepository;", "()V", "articleCountsDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticleCountsDao;", "articlePersonalDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticlePersonalInfosDao;", "articlesDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticlesDao;", "categoriesDao", "Lru/skillbranch/skillarticles/data/local/dao/CategoriesDao;", "network", "Lru/skillbranch/skillarticles/data/NetworkDataHolder;", "tagsDao", "Lru/skillbranch/skillarticles/data/local/dao/TagsDao;", "findCategoriesData", "Landroidx/lifecycle/LiveData;", "", "Lru/skillbranch/skillarticles/data/local/entities/CategoryData;", "findTags", "", "incrementTagUseCount", "", "tag", "insertArticlesToDb", "articles", "Lru/skillbranch/skillarticles/data/remote/res/ArticleRes;", "loadArticlesFromNetwork", "start", "", "size", "rawQueryArticles", "Landroidx/paging/DataSource$Factory;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleItem;", "filter", "Lru/skillbranch/skillarticles/data/repositories/ArticleFilter;", "setupTestDao", "toggleBookmark", "articleId", "app_debug"})
public final class ArticlesRepository implements ru.skillbranch.skillarticles.data.repositories.IArticlesRepository {
    private static final ru.skillbranch.skillarticles.data.NetworkDataHolder network = null;
    private static ru.skillbranch.skillarticles.data.local.dao.ArticlesDao articlesDao;
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
    ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao articlePersonalDao) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ru.skillbranch.skillarticles.data.remote.res.ArticleRes> loadArticlesFromNetwork(int start, int size) {
        return null;
    }
    
    @java.lang.Override()
    public void insertArticlesToDb(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.skillarticles.data.remote.res.ArticleRes> articles) {
    }
    
    @java.lang.Override()
    public void toggleBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
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
    
    @java.lang.Override()
    public void incrementTagUseCount(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    private ArticlesRepository() {
        super();
    }
}