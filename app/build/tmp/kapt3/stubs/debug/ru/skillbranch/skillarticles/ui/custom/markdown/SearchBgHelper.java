package ru.skillbranch.skillarticles.ui.custom.markdown;

import java.lang.System;

@androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u001e\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011R\u001b\u0010\u001a\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001b\u0010\u0011R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010*\u001a\u00020$8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002000 X\u0082.\u00a2\u0006\u0004\n\u0002\u00101R\u000e\u00102\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/markdown/SearchBgHelper;", "", "context", "Landroid/content/Context;", "focusListener", "Lkotlin/Function2;", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "mockDrawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;Landroid/graphics/drawable/Drawable;)V", "alphaColor", "borderWidth", "bottomExtraPadding", "drawable", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "drawable$delegate", "Lkotlin/Lazy;", "drawableLeft", "getDrawableLeft", "drawableLeft$delegate", "drawableMiddle", "getDrawableMiddle", "drawableMiddle$delegate", "drawableRight", "getDrawableRight", "drawableRight$delegate", "endLine", "endOffset", "headerSpans", "", "Lru/skillbranch/skillarticles/ui/custom/spans/HeaderSpan;", "[Lru/skillbranch/skillarticles/ui/custom/spans/HeaderSpan;", "multiLineRender", "Lru/skillbranch/skillarticles/ui/custom/markdown/SearchBgRender;", "padding", "radius", "", "render", "secondaryColor", "singleLineRender", "singleLineRender$annotations", "()V", "spanEnd", "spanStart", "spans", "Lru/skillbranch/skillarticles/ui/custom/spans/SearchSpan;", "[Lru/skillbranch/skillarticles/ui/custom/spans/SearchSpan;", "startLine", "startOffset", "topExtraPadding", "draw", "canvas", "Landroid/graphics/Canvas;", "text", "Landroid/text/Spanned;", "layout", "Landroid/text/Layout;", "app_debug"})
public final class SearchBgHelper {
    private final int padding = 0;
    private final int borderWidth = 0;
    private final float radius = 0.0F;
    private final int secondaryColor = 0;
    private final int alphaColor = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy drawable$delegate = null;
    private final kotlin.Lazy drawableLeft$delegate = null;
    private final kotlin.Lazy drawableMiddle$delegate = null;
    private final kotlin.Lazy drawableRight$delegate = null;
    private ru.skillbranch.skillarticles.ui.custom.markdown.SearchBgRender render;
    private final ru.skillbranch.skillarticles.ui.custom.markdown.SearchBgRender singleLineRender = null;
    private final ru.skillbranch.skillarticles.ui.custom.markdown.SearchBgRender multiLineRender = null;
    private ru.skillbranch.skillarticles.ui.custom.spans.SearchSpan[] spans;
    private ru.skillbranch.skillarticles.ui.custom.spans.HeaderSpan[] headerSpans;
    private int spanStart = 0;
    private int spanEnd = 0;
    private int startLine = 0;
    private int endLine = 0;
    private int startOffset = 0;
    private int endOffset = 0;
    private int topExtraPadding = 0;
    private int bottomExtraPadding = 0;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit> focusListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getDrawable() {
        return null;
    }
    
    private final android.graphics.drawable.Drawable getDrawableLeft() {
        return null;
    }
    
    private final android.graphics.drawable.Drawable getDrawableMiddle() {
        return null;
    }
    
    private final android.graphics.drawable.Drawable getDrawableRight() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    private static void singleLineRender$annotations() {
    }
    
    public final void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.text.Spanned text, @org.jetbrains.annotations.NotNull()
    android.text.Layout layout) {
    }
    
    public SearchBgHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> focusListener, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable mockDrawable) {
        super();
    }
    
    public SearchBgHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> focusListener) {
        super();
    }
}