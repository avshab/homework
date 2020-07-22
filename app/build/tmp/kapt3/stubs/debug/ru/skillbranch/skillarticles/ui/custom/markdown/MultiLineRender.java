package ru.skillbranch.skillarticles.ui.custom.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJH\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J0\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0002J0\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/markdown/MultiLineRender;", "Lru/skillbranch/skillarticles/ui/custom/markdown/SearchBgRender;", "padding", "", "drawableLeft", "Landroid/graphics/drawable/Drawable;", "drawableMiddle", "drawableRight", "(ILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "lineBottom", "lineEndOffset", "lineStartOffset", "lineTop", "draw", "", "canvas", "Landroid/graphics/Canvas;", "layout", "Landroid/text/Layout;", "startLine", "endLine", "startOffset", "endOffset", "topExtraPadding", "bottomExtraPadding", "drawEnd", "start", "top", "end", "bottom", "drawStart", "app_debug"})
public final class MultiLineRender extends ru.skillbranch.skillarticles.ui.custom.markdown.SearchBgRender {
    private int lineTop = 0;
    private int lineBottom = 0;
    private int lineEndOffset = 0;
    private int lineStartOffset = 0;
    private final android.graphics.drawable.Drawable drawableLeft = null;
    private final android.graphics.drawable.Drawable drawableMiddle = null;
    private final android.graphics.drawable.Drawable drawableRight = null;
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.text.Layout layout, int startLine, int endLine, int startOffset, int endOffset, int topExtraPadding, int bottomExtraPadding) {
    }
    
    private final void drawStart(android.graphics.Canvas canvas, int start, int top, int end, int bottom) {
    }
    
    private final void drawEnd(android.graphics.Canvas canvas, int start, int top, int end, int bottom) {
    }
    
    public MultiLineRender(int padding, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableLeft, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableMiddle, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableRight) {
        super(0);
    }
}