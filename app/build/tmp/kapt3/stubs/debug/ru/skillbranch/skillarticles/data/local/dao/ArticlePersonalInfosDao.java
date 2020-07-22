package ru.skillbranch.skillarticles.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\'J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0017\u00a8\u0006\u0010"}, d2 = {"Lru/skillbranch/skillarticles/data/local/dao/ArticlePersonalInfosDao;", "Lru/skillbranch/skillarticles/data/local/dao/BaseDao;", "Lru/skillbranch/skillarticles/data/local/entities/ArticlePersonalInfo;", "findPersonalInfos", "Landroidx/lifecycle/LiveData;", "", "articleId", "", "toggleBookmark", "", "toggleBookmarkOrInsert", "", "toggleLike", "toggleLikeOrInsert", "upsert", "list", "app_debug"})
public abstract interface ArticlePersonalInfosDao extends ru.skillbranch.skillarticles.data.local.dao.BaseDao<ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo> {
    
    @androidx.room.Transaction()
    public abstract void upsert(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo> list);
    
    @androidx.room.Query(value = "\n        UPDATE article_personal_infos SET is_like = NOT is_like, updated_at = CURRENT_TIMESTAMP\n        WHERE article_id = :articleId\n    ")
    public abstract int toggleLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @androidx.room.Query(value = "\n        UPDATE article_personal_infos SET is_bookmark = NOT is_bookmark, updated_at = CURRENT_TIMESTAMP\n        WHERE article_id = :articleId\n    ")
    public abstract int toggleBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @androidx.room.Transaction()
    public abstract void toggleBookmarkOrInsert(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @androidx.room.Transaction()
    public abstract void toggleLikeOrInsert(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM article_personal_infos\n    ")
    public abstract androidx.lifecycle.LiveData<java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo>> findPersonalInfos();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM article_personal_infos\n        WHERE article_id = :articleId\n    ")
    public abstract androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo> findPersonalInfos(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void upsert(ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo> list) {
        }
        
        @androidx.room.Transaction()
        public static void toggleBookmarkOrInsert(ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String articleId) {
        }
        
        @androidx.room.Transaction()
        public static void toggleLikeOrInsert(ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String articleId) {
        }
    }
}