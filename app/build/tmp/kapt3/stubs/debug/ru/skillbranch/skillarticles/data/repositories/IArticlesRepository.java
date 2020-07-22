package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H&J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H&J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H&\u00a8\u0006\u0019"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/IArticlesRepository;", "", "findCategoriesData", "Landroidx/lifecycle/LiveData;", "", "Lru/skillbranch/skillarticles/data/local/entities/CategoryData;", "findTags", "", "incrementTagUseCount", "", "tag", "insertArticlesToDb", "articles", "Lru/skillbranch/skillarticles/data/remote/res/ArticleRes;", "loadArticlesFromNetwork", "start", "", "size", "rawQueryArticles", "Landroidx/paging/DataSource$Factory;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleItem;", "filter", "Lru/skillbranch/skillarticles/data/repositories/ArticleFilter;", "toggleBookmark", "articleId", "app_debug"})
public abstract interface IArticlesRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ru.skillbranch.skillarticles.data.remote.res.ArticleRes> loadArticlesFromNetwork(int start, int size);
    
    public abstract void insertArticlesToDb(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.skillarticles.data.remote.res.ArticleRes> articles);
    
    public abstract void toggleBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<java.lang.String>> findTags();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<ru.skillbranch.skillarticles.data.local.entities.CategoryData>> findCategoriesData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, ru.skillbranch.skillarticles.data.local.entities.ArticleItem> rawQueryArticles(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.repositories.ArticleFilter filter);
    
    public abstract void incrementTagUseCount(@org.jetbrains.annotations.NotNull()
    java.lang.String tag);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}