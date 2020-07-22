package ru.skillbranch.skillarticles.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\'\u00a8\u0006\u0007"}, d2 = {"Lru/skillbranch/skillarticles/data/local/dao/CategoriesDao;", "Lru/skillbranch/skillarticles/data/local/dao/BaseDao;", "Lru/skillbranch/skillarticles/data/local/entities/Category;", "findAllCategoriesData", "Landroidx/lifecycle/LiveData;", "", "Lru/skillbranch/skillarticles/data/local/entities/CategoryData;", "app_debug"})
public abstract interface CategoriesDao extends ru.skillbranch.skillarticles.data.local.dao.BaseDao<ru.skillbranch.skillarticles.data.local.entities.Category> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT category.title AS title, category.icon, category.category_id AS category_id, COUNT(article.category_id) AS articles_count\n        FROM article_categories AS category\n        INNER JOIN articles AS article ON category.category_id = article.category_id\n        GROUP BY category.category_id\n        ORDER BY articles_count DESC\n    ")
    public abstract androidx.lifecycle.LiveData<java.util.List<ru.skillbranch.skillarticles.data.local.entities.CategoryData>> findAllCategoriesData();
}