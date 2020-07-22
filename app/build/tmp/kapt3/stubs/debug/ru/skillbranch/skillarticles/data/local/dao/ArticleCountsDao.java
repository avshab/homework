package ru.skillbranch.skillarticles.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\bH\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0017\u00a8\u0006\u0010"}, d2 = {"Lru/skillbranch/skillarticles/data/local/dao/ArticleCountsDao;", "Lru/skillbranch/skillarticles/data/local/dao/BaseDao;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleCounts;", "decrementLike", "", "articleId", "", "findArticleCounts", "Landroidx/lifecycle/LiveData;", "", "getCommentsCount", "incrementCommentsCount", "", "incrementLike", "upsert", "list", "app_debug"})
public abstract interface ArticleCountsDao extends ru.skillbranch.skillarticles.data.local.dao.BaseDao<ru.skillbranch.skillarticles.data.local.entities.ArticleCounts> {
    
    @androidx.room.Transaction()
    public abstract void upsert(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticleCounts> list);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM article_counts\n    ")
    public abstract androidx.lifecycle.LiveData<java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticleCounts>> findArticleCounts();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM article_counts\n        WHERE article_id = :articleId\n    ")
    public abstract androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.local.entities.ArticleCounts> findArticleCounts(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @androidx.room.Query(value = "\n        UPDATE article_counts SET likes = likes+1, updated_at = CURRENT_TIMESTAMP\n        WHERE article_id = :articleId\n    ")
    public abstract int incrementLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @androidx.room.Query(value = "\n        UPDATE article_counts SET likes = MAX(0, likes-1), updated_at = CURRENT_TIMESTAMP\n        WHERE article_id = :articleId\n    ")
    public abstract int decrementLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @androidx.room.Query(value = "\n        UPDATE article_counts SET comments = comments+1, updated_at = CURRENT_TIMESTAMP\n        WHERE article_id = :articleId\n    ")
    public abstract void incrementCommentsCount(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT comments FROM article_counts\n        WHERE article_id = :articleId\n    ")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getCommentsCount(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void upsert(ru.skillbranch.skillarticles.data.local.dao.ArticleCountsDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticleCounts> list) {
        }
    }
}