package ru.skillbranch.skillarticles.ui.custom.markdown;

import java.lang.System;

@androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
@android.annotation.SuppressLint(value = {"ViewConstructor"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u00020\t8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001f"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/markdown/MarkdownTextView;", "Landroid/widget/TextView;", "Lru/skillbranch/skillarticles/ui/custom/markdown/IMarkdownView;", "context", "Landroid/content/Context;", "fontSize", "", "(Landroid/content/Context;F)V", "mockHelper", "Lru/skillbranch/skillarticles/ui/custom/markdown/SearchBgHelper;", "(Landroid/content/Context;FLru/skillbranch/skillarticles/ui/custom/markdown/SearchBgHelper;)V", "color", "", "getColor", "()I", "focusRect", "Landroid/graphics/Rect;", "value", "getFontSize", "()F", "setFontSize", "(F)V", "searchBgHelper", "spannableContent", "Landroid/text/Spannable;", "getSpannableContent", "()Landroid/text/Spannable;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public final class MarkdownTextView extends android.widget.TextView implements ru.skillbranch.skillarticles.ui.custom.markdown.IMarkdownView {
    private float fontSize;
    private final int color = 0;
    private final android.graphics.Rect focusRect = null;
    @android.annotation.SuppressLint(value = {"VisibleForTests"})
    private final ru.skillbranch.skillarticles.ui.custom.markdown.SearchBgHelper searchBgHelper = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public float getFontSize() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public void setFontSize(float value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.text.Spannable getSpannableContent() {
        return null;
    }
    
    public final int getColor() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public MarkdownTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, float fontSize, @org.jetbrains.annotations.Nullable()
    ru.skillbranch.skillarticles.ui.custom.markdown.SearchBgHelper mockHelper) {
        super(null);
    }
    
    public MarkdownTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, float fontSize) {
        super(null);
    }
    
    public void renderSearchResult(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> results, int offset) {
    }
    
    public void renderSearchPosition(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.Integer, java.lang.Integer> searchPosition, int offset) {
    }
    
    public void clearSearchResult() {
    }
}