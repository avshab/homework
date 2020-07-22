package ru.skillbranch.skillarticles.viewmodels.article;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00c9\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\u0002\u0010$J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u001b\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u00c6\u0003J\t\u0010?\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fH\u00c6\u0003J\t\u0010I\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\u00cd\u0002\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010 \u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u00c6\u0001J\u0013\u0010X\u001a\u00020\u00032\b\u0010Y\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010Z\u001a\u00020\u0011H\u00d6\u0001J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020]H\u0016J\u0010\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020]H\u0016J\t\u0010a\u001a\u00020\rH\u00d6\u0001R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010&R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010!\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0011\u0010\u001d\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u00103R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u00103R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u00103R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u00103R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u00103R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u00103R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u00103R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u00103R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u00103R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010&R#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0013\u0010\"\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010&\u00a8\u0006b"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/article/ArticleState;", "Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "isAuth", "", "isLoadingContent", "isLoadingReviews", "isLike", "isBookmark", "isShowMenu", "isBigText", "isDarkMode", "isSearch", "searchQuery", "", "searchResults", "", "Lkotlin/Pair;", "", "searchPosition", "shareLink", "title", "category", "categoryIcon", "", "date", "author", "poster", "content", "Lru/skillbranch/skillarticles/data/repositories/MarkdownElement;", "commentsCount", "answerTo", "answerToSlug", "showBottomBar", "commentText", "source", "hashtags", "(ZZZZZZZZZLjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAnswerTo", "()Ljava/lang/String;", "getAnswerToSlug", "getAuthor", "()Ljava/lang/Object;", "getCategory", "getCategoryIcon", "getCommentText", "getCommentsCount", "()I", "getContent", "()Ljava/util/List;", "getDate", "getHashtags", "()Z", "getPoster", "getSearchPosition", "getSearchQuery", "getSearchResults", "getShareLink", "getShowBottomBar", "getSource", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "restore", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "save", "", "outState", "toString", "app_debug"})
public final class ArticleState implements ru.skillbranch.skillarticles.viewmodels.base.IViewModelState {
    private final boolean isAuth = false;
    private final boolean isLoadingContent = false;
    private final boolean isLoadingReviews = false;
    private final boolean isLike = false;
    private final boolean isBookmark = false;
    private final boolean isShowMenu = false;
    private final boolean isBigText = false;
    private final boolean isDarkMode = false;
    private final boolean isSearch = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> searchResults = null;
    private final int searchPosition = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String shareLink = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String category = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object categoryIcon = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object author = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String poster = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ru.skillbranch.skillarticles.data.repositories.MarkdownElement> content = null;
    private final int commentsCount = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String answerTo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String answerToSlug = null;
    private final boolean showBottomBar = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String commentText = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String source = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> hashtags = null;
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle outState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.skillarticles.viewmodels.article.ArticleState restore(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState) {
        return null;
    }
    
    public final boolean isAuth() {
        return false;
    }
    
    public final boolean isLoadingContent() {
        return false;
    }
    
    public final boolean isLoadingReviews() {
        return false;
    }
    
    public final boolean isLike() {
        return false;
    }
    
    public final boolean isBookmark() {
        return false;
    }
    
    public final boolean isShowMenu() {
        return false;
    }
    
    public final boolean isBigText() {
        return false;
    }
    
    public final boolean isDarkMode() {
        return false;
    }
    
    public final boolean isSearch() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> getSearchResults() {
        return null;
    }
    
    public final int getSearchPosition() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShareLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCategoryIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.skillbranch.skillarticles.data.repositories.MarkdownElement> getContent() {
        return null;
    }
    
    public final int getCommentsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAnswerTo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAnswerToSlug() {
        return null;
    }
    
    public final boolean getShowBottomBar() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCommentText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getHashtags() {
        return null;
    }
    
    public ArticleState(boolean isAuth, boolean isLoadingContent, boolean isLoadingReviews, boolean isLike, boolean isBookmark, boolean isShowMenu, boolean isBigText, boolean isDarkMode, boolean isSearch, @org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> searchResults, int searchPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String shareLink, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String category, @org.jetbrains.annotations.Nullable()
    java.lang.Object categoryIcon, @org.jetbrains.annotations.Nullable()
    java.lang.String date, @org.jetbrains.annotations.Nullable()
    java.lang.Object author, @org.jetbrains.annotations.Nullable()
    java.lang.String poster, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.MarkdownElement> content, int commentsCount, @org.jetbrains.annotations.Nullable()
    java.lang.String answerTo, @org.jetbrains.annotations.Nullable()
    java.lang.String answerToSlug, boolean showBottomBar, @org.jetbrains.annotations.Nullable()
    java.lang.String commentText, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> hashtags) {
        super();
    }
    
    public ArticleState() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.skillbranch.skillarticles.data.repositories.MarkdownElement> component20() {
        return null;
    }
    
    public final int component21() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    public final boolean component24() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.viewmodels.article.ArticleState copy(boolean isAuth, boolean isLoadingContent, boolean isLoadingReviews, boolean isLike, boolean isBookmark, boolean isShowMenu, boolean isBigText, boolean isDarkMode, boolean isSearch, @org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> searchResults, int searchPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String shareLink, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String category, @org.jetbrains.annotations.Nullable()
    java.lang.Object categoryIcon, @org.jetbrains.annotations.Nullable()
    java.lang.String date, @org.jetbrains.annotations.Nullable()
    java.lang.Object author, @org.jetbrains.annotations.Nullable()
    java.lang.String poster, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.MarkdownElement> content, int commentsCount, @org.jetbrains.annotations.Nullable()
    java.lang.String answerTo, @org.jetbrains.annotations.Nullable()
    java.lang.String answerToSlug, boolean showBottomBar, @org.jetbrains.annotations.Nullable()
    java.lang.String commentText, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> hashtags) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}