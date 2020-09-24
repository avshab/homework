package ru.skillbranch.skillarticles.viewmodels.articles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J(\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00120\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001aJ\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001aJ\u000e\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u001aJ\b\u0010\'\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0012H\u0002J7\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\'\u0010-\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020/0\u0019\u00a2\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00170.JA\u00103\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\b\b\u0002\u00104\u001a\u00020\u00072\'\u0010-\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00170.J7\u00105\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\'\u0010-\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00170.J\u0006\u00106\u001a\u00020\u0017J\b\u00107\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u0013*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/articles/ArticlesViewModel;", "Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "Lru/skillbranch/skillarticles/viewmodels/articles/ArticlesState;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "isLoadingAfter", "", "isLoadingInitial", "listConfig", "Landroidx/paging/PagedList$Config;", "getListConfig", "()Landroidx/paging/PagedList$Config;", "listConfig$delegate", "Lkotlin/Lazy;", "listData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleItem;", "kotlin.jvm.PlatformType", "repository", "Lru/skillbranch/skillarticles/data/repositories/ArticlesRepository;", "applyCategories", "", "selectedCategories", "", "", "buildPagedList", "dataFactory", "Landroidx/paging/DataSource$Factory;", "", "handleSearch", "query", "handleSearchMode", "isSearch", "handleSuggestion", "tag", "handleToggleBookmark", "articleId", "isEmptyFilter", "itemAtEndHandle", "lastLoadArticle", "observeCategories", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onChange", "Lkotlin/Function1;", "Lru/skillbranch/skillarticles/data/local/entities/CategoryData;", "Lkotlin/ParameterName;", "name", "list", "observeList", "isBookmark", "observeTags", "refresh", "zeroLoadingHandle", "app_debug"})
public final class ArticlesViewModel extends ru.skillbranch.skillarticles.viewmodels.base.BaseViewModel<ru.skillbranch.skillarticles.viewmodels.articles.ArticlesState> {
    private final ru.skillbranch.skillarticles.data.repositories.ArticlesRepository repository = null;
    private boolean isLoadingInitial = false;
    private boolean isLoadingAfter = false;
    private final kotlin.Lazy listConfig$delegate = null;
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<ru.skillbranch.skillarticles.data.local.entities.ArticleItem>> listData = null;
    
    private final androidx.paging.PagedList.Config getListConfig() {
        return null;
    }
    
    public final void observeList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, boolean isBookmark, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.paging.PagedList<ru.skillbranch.skillarticles.data.local.entities.ArticleItem>, kotlin.Unit> onChange) {
    }
    
    public final void observeTags(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> onChange) {
    }
    
    public final void observeCategories(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<ru.skillbranch.skillarticles.data.local.entities.CategoryData>, kotlin.Unit> onChange) {
    }
    
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<ru.skillbranch.skillarticles.data.local.entities.ArticleItem>> buildPagedList(androidx.paging.DataSource.Factory<java.lang.Integer, ru.skillbranch.skillarticles.data.local.entities.ArticleItem> dataFactory) {
        return null;
    }
    
    private final boolean isEmptyFilter() {
        return false;
    }
    
    private final void itemAtEndHandle(ru.skillbranch.skillarticles.data.local.entities.ArticleItem lastLoadArticle) {
    }
    
    private final void zeroLoadingHandle() {
    }
    
    public final void handleSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    public final void handleSearchMode(boolean isSearch) {
    }
    
    public final void handleToggleBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String articleId) {
    }
    
    public final void handleSuggestion(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public final void applyCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> selectedCategories) {
    }
    
    public final void refresh() {
    }
    
    public ArticlesViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handle) {
        super(null, null);
    }
}