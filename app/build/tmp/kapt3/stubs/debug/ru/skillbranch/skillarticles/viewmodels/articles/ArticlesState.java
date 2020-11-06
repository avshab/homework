package ru.skillbranch.skillarticles.viewmodels.articles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003JM\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/articles/ArticlesState;", "Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "isSearch", "", "searchQuery", "", "isLoading", "isBookmark", "selectedCategories", "", "isHashtagSearch", "(ZLjava/lang/String;ZZLjava/util/List;Z)V", "()Z", "getSearchQuery", "()Ljava/lang/String;", "getSelectedCategories", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
public final class ArticlesState implements ru.skillbranch.skillarticles.viewmodels.base.IViewModelState {
    private final boolean isSearch = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String searchQuery = null;
    private final boolean isLoading = false;
    private final boolean isBookmark = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> selectedCategories = null;
    private final boolean isHashtagSearch = false;
    
    public final boolean isSearch() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isBookmark() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSelectedCategories() {
        return null;
    }
    
    public final boolean isHashtagSearch() {
        return false;
    }
    
    public ArticlesState(boolean isSearch, @org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery, boolean isLoading, boolean isBookmark, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> selectedCategories, boolean isHashtagSearch) {
        super();
    }
    
    public ArticlesState() {
        super();
    }
    
    /**
     * override this if need save state in bundle
     */
    public void save(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle outState) {
    }
    
    /**
     * override this if need restore state from bundle
     */
    @org.jetbrains.annotations.NotNull()
    public ru.skillbranch.skillarticles.viewmodels.base.IViewModelState restore(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState) {
        return null;
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.viewmodels.articles.ArticlesState copy(boolean isSearch, @org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery, boolean isLoading, boolean isBookmark, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> selectedCategories, boolean isHashtagSearch) {
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