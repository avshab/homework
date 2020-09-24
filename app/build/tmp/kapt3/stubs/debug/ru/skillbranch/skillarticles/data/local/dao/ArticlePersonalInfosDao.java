package ru.skillbranch.skillarticles.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\'J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0019\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/local/dao/ArticlePersonalInfosDao;", "Lru/skillbranch/skillarticles/data/local/dao/BaseDao;", "Lru/skillbranch/skillarticles/data/local/entities/ArticlePersonalInfo;", "findPersonalInfos", "Landroidx/lifecycle/LiveData;", "", "articleId", "", "findPersonalInfosTest", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBookmarked", "", "isLiked", "toggleBookmark", "", "toggleBookmarkOrInsert", "toggleLike", "toggleLikeOrInsert", "upsert", "", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ArticlePersonalInfosDao extends ru.skillbranch.skillarticles.data.local.dao.BaseDao<ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo> {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public abstract java.lang.Object upsert(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        UPDATE article_personal_infos SET is_like = NOT is_like, updated_at = CURRENT_TIMESTAMP\n        WHERE article_id = :articleId\n    ")
    public abstract java.lang.Object toggleLike(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        UPDATE article_personal_infos SET is_bookmark = NOT is_bookmark, updated_at = CURRENT_TIMESTAMP\n        WHERE article_id = :articleId\n    ")
    public abstract java.lang.Object toggleBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public abstract java.lang.Object toggleBookmarkOrInsert(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT is_bookmark FROM article_personal_infos\n        WHERE article_id = :articleId\n    ")
    public abstract java.lang.Object isBookmarked(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public abstract java.lang.Object toggleLikeOrInsert(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT is_like FROM article_personal_infos\n        WHERE article_id = :articleId\n    ")
    public abstract java.lang.Object isLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM article_personal_infos\n    ")
    public abstract androidx.lifecycle.LiveData<java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo>> findPersonalInfos();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM article_personal_infos\n        WHERE article_id = :articleId\n    ")
    public abstract androidx.lifecycle.LiveData<ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo> findPersonalInfos(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT * FROM article_personal_infos\n        WHERE article_id = :articleId\n    ")
    public abstract java.lang.Object findPersonalInfosTest(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Transaction()
        public static java.lang.Object upsert(ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo> list, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Transaction()
        public static java.lang.Object toggleBookmarkOrInsert(ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String articleId, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.lang.Boolean> p2) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Transaction()
        public static java.lang.Object toggleLikeOrInsert(ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String articleId, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.lang.Boolean> p2) {
            return null;
        }
    }
}