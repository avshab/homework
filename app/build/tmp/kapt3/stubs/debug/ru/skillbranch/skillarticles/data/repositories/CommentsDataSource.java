package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J$\u0010\u0010\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J$\u0010\u0015\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J$\u0010\u0016\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/CommentsDataSource;", "Landroidx/paging/ItemKeyedDataSource;", "", "Lru/skillbranch/skillarticles/data/remote/res/CommentRes;", "itemProvider", "Lru/skillbranch/skillarticles/data/remote/RestService;", "articleId", "totalCount", "", "errHandler", "Lkotlin/Function1;", "", "", "(Lru/skillbranch/skillarticles/data/remote/RestService;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getKey", "item", "loadAfter", "params", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "app_debug"})
public final class CommentsDataSource extends androidx.paging.ItemKeyedDataSource<java.lang.String, ru.skillbranch.skillarticles.data.remote.res.CommentRes> {
    private final ru.skillbranch.skillarticles.data.remote.RestService itemProvider = null;
    private final java.lang.String articleId = null;
    private final int totalCount = 0;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> errHandler = null;
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadInitialParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadInitialCallback<ru.skillbranch.skillarticles.data.remote.res.CommentRes> callback) {
    }
    
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadCallback<ru.skillbranch.skillarticles.data.remote.res.CommentRes> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadCallback<ru.skillbranch.skillarticles.data.remote.res.CommentRes> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getKey(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.remote.res.CommentRes item) {
        return null;
    }
    
    public CommentsDataSource(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.remote.RestService itemProvider, @org.jetbrains.annotations.NotNull()
    java.lang.String articleId, int totalCount, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errHandler) {
        super();
    }
}