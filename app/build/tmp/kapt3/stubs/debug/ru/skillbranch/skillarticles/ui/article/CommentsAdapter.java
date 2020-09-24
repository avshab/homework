package ru.skillbranch.skillarticles.ui.article;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lru/skillbranch/skillarticles/ui/article/CommentsAdapter;", "Landroidx/paging/PagedListAdapter;", "Lru/skillbranch/skillarticles/data/remote/res/CommentRes;", "Lru/skillbranch/skillarticles/ui/article/CommentVH;", "listener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class CommentsAdapter extends androidx.paging.PagedListAdapter<ru.skillbranch.skillarticles.data.remote.res.CommentRes, ru.skillbranch.skillarticles.ui.article.CommentVH> {
    private final kotlin.jvm.functions.Function1<ru.skillbranch.skillarticles.data.remote.res.CommentRes, kotlin.Unit> listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.skillarticles.ui.article.CommentVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.ui.article.CommentVH holder, int position) {
    }
    
    public CommentsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.skillbranch.skillarticles.data.remote.res.CommentRes, kotlin.Unit> listener) {
        super(null);
    }
}