package ru.skillbranch.skillarticles.data.local;

import java.lang.System;

@androidx.room.TypeConverters(value = {ru.skillbranch.skillarticles.data.local.DateConverter.class})
@androidx.room.Database(entities = {ru.skillbranch.skillarticles.data.local.entities.Article.class, ru.skillbranch.skillarticles.data.local.entities.ArticleCounts.class, ru.skillbranch.skillarticles.data.local.entities.Category.class, ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo.class, ru.skillbranch.skillarticles.data.local.entities.Tag.class, ru.skillbranch.skillarticles.data.local.entities.ArticleTagXRef.class, ru.skillbranch.skillarticles.data.local.entities.ArticleContent.class}, version = 1, exportSchema = true, views = {ru.skillbranch.skillarticles.data.local.entities.ArticleItem.class, ru.skillbranch.skillarticles.data.local.entities.ArticleFull.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lru/skillbranch/skillarticles/data/local/AppDb;", "Landroidx/room/RoomDatabase;", "()V", "articleContentsDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticleContentsDao;", "articleCountsDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticleCountsDao;", "articlePersonalInfosDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticlePersonalInfosDao;", "articlesDao", "Lru/skillbranch/skillarticles/data/local/dao/ArticlesDao;", "categoriesDao", "Lru/skillbranch/skillarticles/data/local/dao/CategoriesDao;", "tagsDao", "Lru/skillbranch/skillarticles/data/local/dao/TagsDao;", "Companion", "app_debug"})
public abstract class AppDb extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "ru.skillbranch.skillarticles.db";
    public static final int DATABASE_VERSION = 1;
    public static final ru.skillbranch.skillarticles.data.local.AppDb.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.skillbranch.skillarticles.data.local.dao.ArticlesDao articlesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.skillbranch.skillarticles.data.local.dao.ArticleCountsDao articleCountsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.skillbranch.skillarticles.data.local.dao.CategoriesDao categoriesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao articlePersonalInfosDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.skillbranch.skillarticles.data.local.dao.TagsDao tagsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.skillbranch.skillarticles.data.local.dao.ArticleContentsDao articleContentsDao();
    
    public AppDb() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lru/skillbranch/skillarticles/data/local/AppDb$Companion;", "", "()V", "DATABASE_NAME", "", "DATABASE_VERSION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}