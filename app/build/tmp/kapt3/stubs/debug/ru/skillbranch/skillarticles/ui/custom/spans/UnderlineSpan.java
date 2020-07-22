package ru.skillbranch.skillarticles.ui.custom.spans;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JP\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001b\u0010#\u001a\u00020\u0013*\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130%H\u0082\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/spans/UnderlineSpan;", "Landroid/text/style/ReplacementSpan;", "underlineColor", "", "dotWidth", "", "(IF)V", "dashs", "Landroid/graphics/DashPathEffect;", "path", "Landroid/graphics/Path;", "path$annotations", "()V", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "textWidth", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "forLine", "block", "Lkotlin/Function0;", "app_debug"})
public final class UnderlineSpan extends android.text.style.ReplacementSpan {
    private int textWidth = 0;
    private final android.graphics.DashPathEffect dashs = null;
    @org.jetbrains.annotations.NotNull()
    private android.graphics.Path path;
    private final int underlineColor = 0;
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void path$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Path getPath() {
        return null;
    }
    
    public final void setPath(@org.jetbrains.annotations.NotNull()
    android.graphics.Path p0) {
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int start, int end, float x, int top, int y, int bottom, @org.jetbrains.annotations.NotNull()
    android.graphics.Paint paint) {
    }
    
    @java.lang.Override()
    public int getSize(@org.jetbrains.annotations.NotNull()
    android.graphics.Paint paint, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, int start, int end, @org.jetbrains.annotations.Nullable()
    android.graphics.Paint.FontMetricsInt fm) {
        return 0;
    }
    
    private final void forLine(@org.jetbrains.annotations.NotNull()
    android.graphics.Paint $this$forLine, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public UnderlineSpan(int underlineColor, float dotWidth) {
        super();
    }
}