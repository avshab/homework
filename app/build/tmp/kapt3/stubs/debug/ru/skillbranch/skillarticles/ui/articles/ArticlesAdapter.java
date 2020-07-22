package ru.skillbranch.skillarticles.ui.articles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/skillbranch/skillarticles/ui/articles/ArticlesAdapter;", "Landroidx/paging/PagedListAdapter;", "Lru/skillbranch/skillarticles/data/local/entities/ArticleItem;", "Lru/skillbranch/skillarticles/ui/articles/ArticleVH;", "listener", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class ArticlesAdapter extends androidx.paging.PagedListAdapter<ru.skillbranch.skillarticles.data.local.entities.ArticleItem, ru.skillbranch.skillarticles.ui.articles.ArticleVH> {
    private final kotlin.jvm.functions.Function2<ru.skillbranch.skillarticles.data.local.entities.ArticleItem, java.lang.Boolean, kotlin.Unit> listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.skillarticles.ui.articles.ArticleVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.ui.articles.ArticleVH holder, int position) {
    }
    
    public ArticlesAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super ru.skillbranch.skillarticles.data.local.entities.ArticleItem, ? super java.lang.Boolean, kotlin.Unit> listener) {
        super(null);
    }
}