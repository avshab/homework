package ru.skillbranch.skillarticles.ui.custom.spans;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJP\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-H\u0016J4\u0010.\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001b\u00101\u001a\u00020!*\u00020-2\f\u00102\u001a\b\u0012\u0004\u0012\u00020!03H\u0082\bJ\u001b\u00104\u001a\u00020!*\u00020-2\f\u00102\u001a\b\u0012\u0004\u0012\u00020!03H\u0082\bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00065"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/spans/IconLinkSpan;", "Landroid/text/style/ReplacementSpan;", "linkDrawable", "Landroid/graphics/drawable/Drawable;", "padding", "", "textColor", "", "dotWidth", "(Landroid/graphics/drawable/Drawable;FIF)V", "dashs", "Landroid/graphics/DashPathEffect;", "iconSize", "iconSize$annotations", "()V", "getIconSize", "()I", "setIconSize", "(I)V", "path", "Landroid/graphics/Path;", "path$annotations", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "textWidth", "textWidth$annotations", "getTextWidth", "()F", "setTextWidth", "(F)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "forLine", "block", "Lkotlin/Function0;", "forText", "app_debug"})
public final class IconLinkSpan extends android.text.style.ReplacementSpan {
    private int iconSize = 0;
    private float textWidth = 0.0F;
    private final android.graphics.DashPathEffect dashs = null;
    @org.jetbrains.annotations.NotNull()
    private android.graphics.Path path;
    private final android.graphics.drawable.Drawable linkDrawable = null;
    private final float padding = 0.0F;
    private final int textColor = 0;
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void iconSize$annotations() {
    }
    
    public final int getIconSize() {
        return 0;
    }
    
    public final void setIconSize(int p0) {
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void textWidth$annotations() {
    }
    
    public final float getTextWidth() {
        return 0.0F;
    }
    
    public final void setTextWidth(float p0) {
    }
    
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
    
    private final void forText(@org.jetbrains.annotations.NotNull()
    android.graphics.Paint $this$forText, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public IconLinkSpan(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable linkDrawable, @androidx.annotation.Px()
    float padding, @androidx.annotation.ColorInt()
    int textColor, float dotWidth) {
        super();
    }
}