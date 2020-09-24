package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/CommentsDataFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lru/skillbranch/skillarticles/data/remote/res/CommentRes;", "itemProvider", "Lru/skillbranch/skillarticles/data/remote/RestService;", "articleId", "totalCount", "", "errHandler", "Lkotlin/Function1;", "", "", "(Lru/skillbranch/skillarticles/data/remote/RestService;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "create", "Landroidx/paging/DataSource;", "app_debug"})
public final class CommentsDataFactory extends androidx.paging.DataSource.Factory<java.lang.String, ru.skillbranch.skillarticles.data.remote.res.CommentRes> {
    private final ru.skillbranch.skillarticles.data.remote.RestService itemProvider = null;
    private final java.lang.String articleId = null;
    private final int totalCount = 0;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> errHandler = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.String, ru.skillbranch.skillarticles.data.remote.res.CommentRes> create() {
        return null;
    }
    
    public CommentsDataFactory(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.remote.RestService itemProvider, @org.jetbrains.annotations.NotNull()
    java.lang.String articleId, int totalCount, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errHandler) {
        super();
    }
}