package ru.skillbranch.skillarticles.viewmodels.article;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0016J\u0006\u0010#\u001a\u00020\u001eJ\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&J\b\u0010\'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u001eH\u0016J\u0016\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007J\u0012\u0010/\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020&H\u0016J\u0012\u00103\u001a\u00020\u001e2\b\u00104\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u00105\u001a\u00020\u001eH\u0016J\b\u00106\u001a\u00020\u001eH\u0016J\b\u00107\u001a\u00020\u001eH\u0016J\b\u00108\u001a\u00020\u001eH\u0016J7\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020;2\'\u0010<\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\f\b>\u0012\b\b.\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u001e0=J\u0006\u0010@\u001a\u00020\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/article/ArticleViewModel;", "Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "Lru/skillbranch/skillarticles/viewmodels/article/ArticleState;", "Lru/skillbranch/skillarticles/viewmodels/article/IArticleViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "articleId", "", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "clearContent", "listConfig", "Landroidx/paging/PagedList$Config;", "getListConfig", "()Landroidx/paging/PagedList$Config;", "listConfig$delegate", "Lkotlin/Lazy;", "listData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lru/skillbranch/skillarticles/data/remote/res/CommentRes;", "listData$annotations", "()V", "getListData", "()Landroidx/lifecycle/LiveData;", "repository", "Lru/skillbranch/skillarticles/data/repositories/ArticleRepository;", "buildPagedList", "dataFactory", "Lru/skillbranch/skillarticles/data/repositories/CommentsDataFactory;", "commentLoadErrorHandler", "", "throwable", "", "fetchContent", "handleBookmark", "handleClearComment", "handleCommentFocus", "hasFocus", "", "handleCopyCode", "handleDownResult", "handleDownText", "handleLike", "handleNightMode", "handleReplyTo", "messageId", "name", "handleSearch", "query", "handleSearchMode", "isSearch", "handleSendComment", "comment", "handleShare", "handleToggleMenu", "handleUpResult", "handleUpText", "observeList", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onChanged", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "list", "refresh", "app_debug"})
public final class ArticleViewModel extends ru.skillbranch.skillarticles.viewmodels.base.BaseViewModel<ru.skillbranch.skillarticles.viewmodels.article.ArticleState> implements ru.skillbranch.skillarticles.viewmodels.article.IArticleViewModel {
    private final ru.skillbranch.skillarticles.data.repositories.ArticleRepository repository = null;
    private java.lang.String clearContent;
    private final kotlin.Lazy listConfig$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<ru.skillbranch.skillarticles.data.remote.res.CommentRes>> listData = null;
    private final java.lang.String articleId = null;
    
    private final androidx.paging.PagedList.Config getListConfig() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void listData$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<ru.skillbranch.skillarticles.data.remote.res.CommentRes>> getListData() {
        return null;
    }
    
    public final void refresh() {
    }
    
    private final void commentLoadErrorHandler(java.lang.Throwable throwable) {
    }
    
    private final void fetchContent() {
    }
    
    @java.lang.Override()
    public void handleNightMode() {
    }
    
    @java.lang.Override()
    public void handleUpText() {
    }
    
    @java.lang.Override()
    public void handleDownText() {
    }
    
    @java.lang.Override()
    public void handleBookmark() {
    }
    
    @java.lang.Override()
    public void handleLike() {
    }
    
    @java.lang.Override()
    public void handleShare() {
    }
    
    @java.lang.Override()
    public void handleToggleMenu() {
    }
    
    @java.lang.Override()
    public void handleSearchMode(boolean isSearch) {
    }
    
    @java.lang.Override()
    public void handleSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void handleUpResult() {
    }
    
    @java.lang.Override()
    public void handleDownResult() {
    }
    
    @java.lang.Override()
    public void handleCopyCode() {
    }
    
    @java.lang.Override()
    public void handleSendComment(@org.jetbrains.annotations.Nullable()
    java.lang.String comment) {
    }
    
    public final void observeList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.paging.PagedList<ru.skillbranch.skillarticles.data.remote.res.CommentRes>, kotlin.Unit> onChanged) {
    }
    
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<ru.skillbranch.skillarticles.data.remote.res.CommentRes>> buildPagedList(ru.skillbranch.skillarticles.data.repositories.CommentsDataFactory dataFactory) {
        return null;
    }
    
    public final void handleCommentFocus(boolean hasFocus) {
    }
    
    public final void handleClearComment() {
    }
    
    public final void handleReplyTo(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public ArticleViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handle, @org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
        super(null, null);
    }
}