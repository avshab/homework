package ru.skillbranch.skillarticles.viewmodels.articles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/articles/ArticlesBoundaryCallback;", "Landroidx/paging/PagedList$BoundaryCallback;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleItem;", "zeroLoadingHandle", "Lkotlin/Function0;", "", "itemAtEndHandle", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "onItemAtEndLoaded", "itemAtEnd", "onZeroItemsLoaded", "app_debug"})
public final class ArticlesBoundaryCallback extends androidx.paging.PagedList.BoundaryCallback<ru.skillbranch.skillarticles.data.local.entities.ArticleItem> {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> zeroLoadingHandle = null;
    private final kotlin.jvm.functions.Function1<ru.skillbranch.skillarticles.data.local.entities.ArticleItem, kotlin.Unit> itemAtEndHandle = null;
    
    @java.lang.Override()
    public void onZeroItemsLoaded() {
    }
    
    @java.lang.Override()
    public void onItemAtEndLoaded(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.entities.ArticleItem itemAtEnd) {
    }
    
    public ArticlesBoundaryCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> zeroLoadingHandle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.skillbranch.skillarticles.data.local.entities.ArticleItem, kotlin.Unit> itemAtEndHandle) {
        super();
    }
}