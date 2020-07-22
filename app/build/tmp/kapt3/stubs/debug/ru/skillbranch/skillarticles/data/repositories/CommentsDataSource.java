package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B=\u0012&\u0010\u0004\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016J$\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J$\u0010\u0013\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J$\u0010\u0014\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0016R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\u0004\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/CommentsDataSource;", "Landroidx/paging/ItemKeyedDataSource;", "", "Lru/skillbranch/skillarticles/data/models/CommentItemData;", "itemProvider", "Lkotlin/Function3;", "", "", "articleId", "totalCount", "(Lkotlin/jvm/functions/Function3;Ljava/lang/String;I)V", "getKey", "item", "loadAfter", "", "params", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "app_debug"})
public final class CommentsDataSource extends androidx.paging.ItemKeyedDataSource<java.lang.String, ru.skillbranch.skillarticles.data.models.CommentItemData> {
    private final kotlin.jvm.functions.Function3<java.lang.String, java.lang.Integer, java.lang.String, java.util.List<ru.skillbranch.skillarticles.data.models.CommentItemData>> itemProvider = null;
    private final java.lang.String articleId = null;
    private final int totalCount = 0;
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadInitialParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadInitialCallback<ru.skillbranch.skillarticles.data.models.CommentItemData> callback) {
    }
    
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadCallback<ru.skillbranch.skillarticles.data.models.CommentItemData> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadCallback<ru.skillbranch.skillarticles.data.models.CommentItemData> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getKey(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.models.CommentItemData item) {
        return null;
    }
    
    public CommentsDataSource(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? extends java.util.List<ru.skillbranch.skillarticles.data.models.CommentItemData>> itemProvider, @org.jetbrains.annotations.NotNull()
    java.lang.String articleId, int totalCount) {
        super();
    }
}