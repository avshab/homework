package ru.skillbranch.skillarticles.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004H\'J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0004H\'J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00042\u0006\u0010\u0013\u001a\u00020\u0006H\'J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\'J\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0017\u00a8\u0006\u001a"}, d2 = {"Lru/skillbranch/skillarticles/data/local/dao/ArticlesDao;", "Lru/skillbranch/skillarticles/data/local/dao/BaseDao;", "Lru/skillbranch/skillarticles/data/local/entities/Article;", "findArticleById", "Landroidx/lifecycle/LiveData;", "id", "", "findArticleItems", "", "Lru/skillbranch/skillarticles/data/local/entities/ArticleItem;", "findArticleItemsByCategoryIds", "categoryIds", "findArticles", "findArticlesByRaw", "Landroidx/paging/DataSource$Factory;", "", "simpleSQLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "findArticlesByTagId", "tag", "findFullArticle", "Lru/skillbranch/skillarticles/data/local/entities/ArticleFull;", "articleId", "upsert", "", "list", "app_debug"})
public abstract interface ArticlesDao extends ru.skillbranch.skillarticles.data.local.dao.BaseDao<ru.skillbranch.skillarticles.data.local.entities.Article> {
    
    @androidx.room.Transaction()
    public abstract void upsert(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.skillarticles.data.local.entities.Article> list);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM articles\n    ")
    public abstract androidx.lifecycle.LiveData<java.util.List<ru.skillbranch.skillarticles.data.local.entities.Article>> findArticles();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM articles\n        WHERE id = :id\n    ")
    public abstract androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.local.entities.Article> findArticleById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM ArticleItem\n    ")
    public abstract androidx.lifecycle.LiveData<java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticleItem>> findArticleItems();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM ArticleItem\n        WHERE category_id IN (:categoryIds)\n    ")
    public abstract androidx.lifecycle.LiveData<java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticleItem>> findArticleItemsByCategoryIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> categoryIds);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM ArticleItem\n        INNER JOIN article_tag_x_ref AS refs ON refs.a_id = id\n        WHERE refs.t_id = :tag\n    ")
    public abstract androidx.lifecycle.LiveData<java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticleItem>> findArticlesByTagId(@org.jetbrains.annotations.NotNull()
    java.lang.String tag);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {ru.skillbranch.skillarticles.data.local.entities.ArticleItem.class})
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, ru.skillbranch.skillarticles.data.local.entities.ArticleItem> findArticlesByRaw(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery simpleSQLiteQuery);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM ArticleFull\n        WHERE id = :articleId\n    ")
    public abstract androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.local.entities.ArticleFull> findFullArticle(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void upsert(ru.skillbranch.skillarticles.data.local.dao.ArticlesDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<ru.skillbranch.skillarticles.data.local.entities.Article> list) {
        }
    }
}