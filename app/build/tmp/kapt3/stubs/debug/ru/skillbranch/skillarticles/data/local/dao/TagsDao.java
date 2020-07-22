package ru.skillbranch.skillarticles.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\'J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lru/skillbranch/skillarticles/data/local/dao/TagsDao;", "Lru/skillbranch/skillarticles/data/local/dao/BaseDao;", "Lru/skillbranch/skillarticles/data/local/entities/Tag;", "findTags", "Landroidx/lifecycle/LiveData;", "", "", "incrementTagUseCount", "", "tag", "insertRefs", "", "refs", "Lru/skillbranch/skillarticles/data/local/entities/ArticleTagXRef;", "app_debug"})
public abstract interface TagsDao extends ru.skillbranch.skillarticles.data.local.dao.BaseDao<ru.skillbranch.skillarticles.data.local.entities.Tag> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT tag FROM article_tags\n        ORDER BY use_count DESC\n    ")
    public abstract androidx.lifecycle.LiveData<java.util.List<java.lang.String>> findTags();
    
    @androidx.room.Query(value = "\n        UPDATE article_tags SET use_count = use_count+1\n        WHERE tag = :tag\n    ")
    public abstract void incrementTagUseCount(@org.jetbrains.annotations.NotNull()
    java.lang.String tag);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.util.List<java.lang.Long> insertRefs(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.skillarticles.data.local.entities.ArticleTagXRef> refs);
}