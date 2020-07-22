package ru.skillbranch.skillarticles.ui.custom.spans;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JR\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J4\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001b\u0010\u001c\u001a\u00020\f*\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001eH\u0082\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/spans/HorizontalRuleSpan;", "Landroid/text/style/ReplacementSpan;", "ruleWidth", "", "ruleColor", "", "(FI)V", "getRuleColor", "()I", "getRuleWidth", "()F", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "forLine", "block", "Lkotlin/Function0;", "app_debug"})
public final class HorizontalRuleSpan extends android.text.style.ReplacementSpan {
    private final float ruleWidth = 0.0F;
    private final int ruleColor = 0;
    
    @java.lang.Override()
    public int getSize(@org.jetbrains.annotations.NotNull()
    android.graphics.Paint paint, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, int start, int end, @org.jetbrains.annotations.Nullable()
    android.graphics.Paint.FontMetricsInt fm) {
        return 0;
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, int start, int end, float x, int top, int y, int bottom, @org.jetbrains.annotations.NotNull()
    android.graphics.Paint paint) {
    }
    
    private final void forLine(@org.jetbrains.annotations.NotNull()
    android.graphics.Paint $this$forLine, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final float getRuleWidth() {
        return 0.0F;
    }
    
    public final int getRuleColor() {
        return 0;
    }
    
    public HorizontalRuleSpan(@androidx.annotation.Px()
    float ruleWidth, @androidx.annotation.ColorInt()
    int ruleColor) {
        super();
    }
}