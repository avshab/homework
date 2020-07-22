package ru.skillbranch.skillarticles.viewmodels.articles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J(\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0017J\b\u0010%\u001a\u00020 H\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u000fH\u0002J7\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*2\'\u0010+\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020-0\u0016\u00a2\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00140,JA\u00101\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*2\b\b\u0002\u00102\u001a\u00020 2\'\u0010+\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00140,J7\u00103\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*2\'\u0010+\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00140,J\b\u00104\u001a\u00020\u0014H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR(\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0010*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/articles/ArticlesViewModel;", "Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "Lru/skillbranch/skillarticles/viewmodels/articles/ArticlesState;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "listConfig", "Landroidx/paging/PagedList$Config;", "getListConfig", "()Landroidx/paging/PagedList$Config;", "listConfig$delegate", "Lkotlin/Lazy;", "listData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleItem;", "kotlin.jvm.PlatformType", "repository", "Lru/skillbranch/skillarticles/data/repositories/ArticlesRepository;", "applyCategories", "", "selectedCategories", "", "", "buildPagedList", "dataFactory", "Landroidx/paging/DataSource$Factory;", "", "handleSearch", "query", "handleSearchMode", "isSearch", "", "handleSuggestion", "tag", "handleToggleBookmark", "articleId", "isEmptyFilter", "itemAtEndHandle", "lastLoadArticle", "observeCategories", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onChange", "Lkotlin/Function1;", "Lru/skillbranch/skillarticles/data/local/entities/CategoryData;", "Lkotlin/ParameterName;", "name", "list", "observeList", "isBookmark", "observeTags", "zeroLoadingHandle", "app_debug"})
public final class ArticlesViewModel extends ru.skillbranch.skillarticles.viewmodels.base.BaseViewModel<ru.skillbranch.skillarticles.viewmodels.articles.ArticlesState> {
    private final ru.skillbranch.skillarticles.data.repositories.ArticlesRepository repository = null;
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
    
    public ArticlesViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handle) {
        super(null, null);
    }
}