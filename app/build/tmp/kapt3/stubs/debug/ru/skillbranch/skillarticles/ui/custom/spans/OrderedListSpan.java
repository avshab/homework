package ru.skillbranch.skillarticles.ui.custom.spans;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJl\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0019H\u0017J\u001b\u0010\u001e\u001a\u00020\n*\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0082\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/spans/OrderedListSpan;", "Landroid/text/style/LeadingMarginSpan;", "gapWidth", "", "order", "", "orderColor", "", "(FLjava/lang/String;I)V", "drawLeadingMargin", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "currentMarginLocation", "paragraphDirection", "lineTop", "lineBaseline", "lineBottom", "text", "", "lineStart", "lineEnd", "isFirstLine", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "first", "withCustomColor", "block", "Lkotlin/Function0;", "app_debug"})
public final class OrderedListSpan implements android.text.style.LeadingMarginSpan {
    private final float gapWidth = 0.0F;
    private final java.lang.String order = null;
    private final int orderColor = 0;
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Override()
    public int getLeadingMargin(boolean first) {
        return 0;
    }
    
    @java.lang.Override()
    public void drawLeadingMargin(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.graphics.Paint paint, int currentMarginLocation, int paragraphDirection, int lineTop, int lineBaseline, int lineBottom, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, int lineStart, int lineEnd, boolean isFirstLine, @org.jetbrains.annotations.Nullable()
    android.text.Layout layout) {
    }
    
    private final void withCustomColor(@org.jetbrains.annotations.NotNull()
    android.graphics.Paint $this$withCustomColor, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public OrderedListSpan(@androidx.annotation.Px()
    float gapWidth, @org.jetbrains.annotations.NotNull()
    java.lang.String order, @androidx.annotation.ColorInt()
    int orderColor) {
        super();
    }
}