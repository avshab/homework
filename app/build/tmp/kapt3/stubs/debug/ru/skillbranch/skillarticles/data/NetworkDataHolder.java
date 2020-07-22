package ru.skillbranch.skillarticles.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0005J(\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001dR-\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lru/skillbranch/skillarticles/data/NetworkDataHolder;", "", "()V", "commentsData", "", "", "", "Lru/skillbranch/skillarticles/data/models/CommentItemData;", "getCommentsData", "()Ljava/util/Map;", "commentsData$delegate", "Lkotlin/Lazy;", "networkArticleItems", "", "Lru/skillbranch/skillarticles/data/remote/res/ArticleRes;", "findArticlesItem", "start", "", "size", "loadArticleContent", "Lru/skillbranch/skillarticles/data/remote/res/ArticleContentRes;", "articleId", "loadComments", "slug", "sendMessage", "", "text", "answerToSlug", "user", "Lru/skillbranch/skillarticles/data/models/User;", "app_debug"})
public final class NetworkDataHolder {
    private static final java.util.List<ru.skillbranch.skillarticles.data.remote.res.ArticleRes> networkArticleItems = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy commentsData$delegate = null;
    public static final ru.skillbranch.skillarticles.data.NetworkDataHolder INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<ru.skillbranch.skillarticles.data.models.CommentItemData>> getCommentsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.skillbranch.skillarticles.data.remote.res.ArticleRes> findArticlesItem(int start, int size) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.remote.res.ArticleContentRes loadArticleContent(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
        return null;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String answerToSlug, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.models.User user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.skillbranch.skillarticles.data.models.CommentItemData> loadComments(@org.jetbrains.annotations.Nullable()
    java.lang.String slug, int size, @org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
        return null;
    }
    
    private NetworkDataHolder() {
        super();
    }
}