package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0003R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/ArticleFilter;", "", "search", "", "isBookmark", "", "categories", "", "isHashtag", "(Ljava/lang/String;ZLjava/util/List;Z)V", "getCategories", "()Ljava/util/List;", "()Z", "getSearch", "()Ljava/lang/String;", "toQuery", "app_debug"})
public final class ArticleFilter {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String search = null;
    private final boolean isBookmark = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> categories = null;
    private final boolean isHashtag = false;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearch() {
        return null;
    }
    
    public final boolean isBookmark() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
    
    public final boolean isHashtag() {
        return false;
    }
    
    public ArticleFilter(@org.jetbrains.annotations.Nullable()
    java.lang.String search, boolean isBookmark, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> categories, boolean isHashtag) {
        super();
    }
    
    public ArticleFilter() {
        super();
    }
}