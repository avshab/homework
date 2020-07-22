package ru.skillbranch.skillarticles.ui.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0014J0\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0014J\u0018\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/CommentItemView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "avatarSize", "", "baseColor", "defaultHSpace", "defaultVSpace", "dividerColor", "grayColor", "iconSize", "iv_answer_icon", "Landroid/widget/ImageView;", "iv_avatar", "linePaint", "Landroid/graphics/Paint;", "lineSize", "", "primaryColor", "shimmerDrawable", "Lru/skillbranch/skillarticles/ui/custom/ShimmerDrawable;", "getShimmerDrawable", "()Lru/skillbranch/skillarticles/ui/custom/ShimmerDrawable;", "shimmerDrawable$delegate", "Lkotlin/Lazy;", "tv_answer_to", "Landroid/widget/TextView;", "tv_author", "tv_body", "tv_date", "bind", "", "item", "Lru/skillbranch/skillarticles/data/models/CommentItemData;", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "app_debug"})
public final class CommentItemView extends android.view.ViewGroup {
    private final int defaultVSpace = 0;
    private final int defaultHSpace = 0;
    private final int avatarSize = 0;
    private final float lineSize = 0.0F;
    private final int iconSize = 0;
    private final android.widget.TextView tv_date = null;
    private final android.widget.ImageView iv_avatar = null;
    private final android.widget.TextView tv_author = null;
    private final android.widget.TextView tv_body = null;
    private final android.widget.ImageView iv_answer_icon = null;
    private final android.widget.TextView tv_answer_to = null;
    private final int grayColor = 0;
    private final int primaryColor = 0;
    private final int dividerColor = 0;
    private final int baseColor = 0;
    private final android.graphics.Paint linePaint = null;
    private final kotlin.Lazy shimmerDrawable$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final ru.skillbranch.skillarticles.ui.custom.ShimmerDrawable getShimmerDrawable() {
        return null;
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }
    
    @java.lang.Override()
    protected void dispatchDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public final void bind(@org.jetbrains.annotations.Nullable()
    ru.skillbranch.skillarticles.data.models.CommentItemData item) {
    }
    
    public CommentItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}