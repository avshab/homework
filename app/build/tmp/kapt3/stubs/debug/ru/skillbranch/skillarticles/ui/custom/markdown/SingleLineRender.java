package ru.skillbranch.skillarticles.ui.custom.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JH\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/markdown/SingleLineRender;", "Lru/skillbranch/skillarticles/ui/custom/markdown/SearchBgRender;", "padding", "", "drawable", "Landroid/graphics/drawable/Drawable;", "(ILandroid/graphics/drawable/Drawable;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "lineBottom", "lineTop", "draw", "", "canvas", "Landroid/graphics/Canvas;", "layout", "Landroid/text/Layout;", "startLine", "endLine", "startOffset", "endOffset", "topExtraPadding", "bottomExtraPadding", "app_debug"})
public final class SingleLineRender extends ru.skillbranch.skillarticles.ui.custom.markdown.SearchBgRender {
    private int lineTop = 0;
    private int lineBottom = 0;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.drawable.Drawable drawable = null;
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.text.Layout layout, int startLine, int endLine, int startOffset, int endOffset, int topExtraPadding, int bottomExtraPadding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getDrawable() {
        return null;
    }
    
    public SingleLineRender(int padding, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable) {
        super(0);
    }
}