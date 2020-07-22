package ru.skillbranch.skillarticles.ui.custom.spans;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007Jj\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001b\u0010\u001d\u001a\u00020\t*\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0082\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/spans/UnorderedListSpan;", "Landroid/text/style/LeadingMarginSpan;", "gapWidth", "", "bulletRadius", "bulletColor", "", "(FFI)V", "drawLeadingMargin", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "currentMarginLocation", "paragraphDirection", "lineTop", "lineBaseline", "lineBottom", "text", "", "lineStart", "lineEnd", "isFirstLine", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "first", "withCustomColor", "block", "Lkotlin/Function0;", "app_debug"})
public final class UnorderedListSpan implements android.text.style.LeadingMarginSpan {
    private final float gapWidth = 0.0F;
    private final float bulletRadius = 0.0F;
    private final int bulletColor = 0;
    
    @java.lang.Override()
    public int getLeadingMargin(boolean first) {
        return 0;
    }
    
    @java.lang.Override()
    public void drawLeadingMargin(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.graphics.Paint paint, int currentMarginLocation, int paragraphDirection, int lineTop, int lineBaseline, int lineBottom, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, int lineStart, int lineEnd, boolean isFirstLine, @org.jetbrains.annotations.NotNull()
    android.text.Layout layout) {
    }
    
    private final void withCustomColor(@org.jetbrains.annotations.NotNull()
    android.graphics.Paint $this$withCustomColor, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public UnorderedListSpan(@androidx.annotation.Px()
    float gapWidth, @androidx.annotation.Px()
    float bulletRadius, @androidx.annotation.ColorInt()
    int bulletColor) {
        super();
    }
}