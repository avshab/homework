package ru.skillbranch.skillarticles.ui.custom.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JL\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003H&J\u0016\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0003J\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/markdown/SearchBgRender;", "", "padding", "", "(I)V", "getPadding", "()I", "draw", "", "canvas", "Landroid/graphics/Canvas;", "layout", "Landroid/text/Layout;", "startLine", "endLine", "startOffset", "endOffset", "topExtraPadding", "bottomExtraPadding", "getLineBottom", "line", "getLineTop", "app_debug"})
public abstract class SearchBgRender {
    private final int padding = 0;
    
    public abstract void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.text.Layout layout, int startLine, int endLine, int startOffset, int endOffset, int topExtraPadding, int bottomExtraPadding);
    
    public final int getLineTop(@org.jetbrains.annotations.NotNull()
    android.text.Layout layout, int line) {
        return 0;
    }
    
    public final int getLineBottom(@org.jetbrains.annotations.NotNull()
    android.text.Layout layout, int line) {
        return 0;
    }
    
    public final int getPadding() {
        return 0;
    }
    
    public SearchBgRender(int padding) {
        super();
    }
}