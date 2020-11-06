package ru.skillbranch.skillarticles.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ4\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\t0\u001e2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\f\u001a\u00020\rH\'J\u001b\u0010 \u001a\u00020!2\b\b\u0001\u0010\"\u001a\u00020#H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u001e2\b\b\u0001\u0010\"\u001a\u00020#H\'J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u001e2\b\b\u0001\u0010(\u001a\u00020)H\'J%\u0010*\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010+\u001a\u00020,2\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ/\u0010-\u001a\u00020.2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010/\u001a\u0002002\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\'\u00102\u001a\u00020,2\n\b\u0001\u00103\u001a\u0004\u0018\u0001042\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00066"}, d2 = {"Lru/skillbranch/skillarticles/data/remote/RestService;", "", "addBookmark", "Lru/skillbranch/skillarticles/data/remote/res/BookmarkRes;", "articleId", "", "token", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "articles", "", "Lru/skillbranch/skillarticles/data/remote/res/ArticleRes;", "last", "limit", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decrementLike", "Lru/skillbranch/skillarticles/data/remote/res/LikeRes;", "editProfile", "Lru/skillbranch/skillarticles/data/models/User;", "editProfileReq", "Lru/skillbranch/skillarticles/data/remote/req/EditProfileReq;", "auth", "(Lru/skillbranch/skillarticles/data/remote/req/EditProfileReq;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementLike", "loadArticleContent", "Lru/skillbranch/skillarticles/data/remote/res/ArticleContentRes;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadArticleCounts", "Lru/skillbranch/skillarticles/data/remote/res/ArticleCountsRes;", "loadComments", "Lretrofit2/Call;", "Lru/skillbranch/skillarticles/data/remote/res/CommentRes;", "login", "Lru/skillbranch/skillarticles/data/remote/res/AuthRes;", "loginReq", "Lru/skillbranch/skillarticles/data/remote/req/LoginReq;", "(Lru/skillbranch/skillarticles/data/remote/req/LoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginCall", "refreshAccessToken", "Lru/skillbranch/skillarticles/data/remote/res/RefreshRes;", "refresh", "Lru/skillbranch/skillarticles/data/remote/req/RefreshReq;", "removeBookmark", "removeProfileAvatar", "Lru/skillbranch/skillarticles/data/remote/res/UploadRes;", "sendMessage", "Lru/skillbranch/skillarticles/data/remote/res/MessageRes;", "message", "Lru/skillbranch/skillarticles/data/remote/req/MessageReq;", "(Ljava/lang/String;Lru/skillbranch/skillarticles/data/remote/req/MessageReq;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upload", "file", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RestService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "articles")
    public abstract java.lang.Object articles(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "last")
    java.lang.String last, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.skillbranch.skillarticles.data.remote.res.ArticleRes>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "articles/{article}/content")
    public abstract java.lang.Object loadArticleContent(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "article")
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.remote.res.ArticleContentRes> p1);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "articles/{article}/messages")
    public abstract retrofit2.Call<java.util.List<ru.skillbranch.skillarticles.data.remote.res.CommentRes>> loadComments(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "article")
    java.lang.String articleId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "last")
    java.lang.String last, @retrofit2.http.Query(value = "limit")
    int limit);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "articles/{article}/messages")
    public abstract java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "article")
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.skillbranch.skillarticles.data.remote.req.MessageReq message, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.remote.res.MessageRes> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "articles/{article}/counts")
    public abstract java.lang.Object loadArticleCounts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "article")
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.remote.res.ArticleCountsRes> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "auth/login")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.skillbranch.skillarticles.data.remote.req.LoginReq loginReq, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.remote.res.AuthRes> p1);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "auth/login")
    public abstract retrofit2.Call<ru.skillbranch.skillarticles.data.remote.res.AuthRes> loginCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.skillbranch.skillarticles.data.remote.req.LoginReq loginReq);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "articles/{article}/decrementLikes")
    public abstract java.lang.Object decrementLike(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "article")
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.remote.res.LikeRes> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "articles/{article}/incrementLikes")
    public abstract java.lang.Object incrementLike(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "article")
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.remote.res.LikeRes> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "articles/{article}/addBookmark")
    public abstract java.lang.Object addBookmark(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "article")
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.remote.res.BookmarkRes> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "articles/{article}/removeBookmark")
    public abstract java.lang.Object removeBookmark(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "article")
    java.lang.String articleId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.remote.res.BookmarkRes> p2);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "auth/refresh")
    public abstract retrofit2.Call<ru.skillbranch.skillarticles.data.remote.res.RefreshRes> refreshAccessToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.skillbranch.skillarticles.data.remote.req.RefreshReq refresh);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "profile/avatar/upload")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object upload(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.remote.res.UploadRes> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "profile/avatar/remove")
    public abstract java.lang.Object removeProfileAvatar(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.remote.res.UploadRes> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "profile")
    public abstract java.lang.Object editProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.skillbranch.skillarticles.data.remote.req.EditProfileReq editProfileReq, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.skillarticles.data.models.User> p2);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}