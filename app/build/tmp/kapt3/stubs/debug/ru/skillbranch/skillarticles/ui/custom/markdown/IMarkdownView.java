package ru.skillbranch.skillarticles.ui.custom.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH\u0016J$\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J*\u0010\u0013\u001a\u00020\r2\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/markdown/IMarkdownView;", "", "fontSize", "", "getFontSize", "()F", "setFontSize", "(F)V", "spannableContent", "Landroid/text/Spannable;", "getSpannableContent", "()Landroid/text/Spannable;", "clearSearchResult", "", "renderSearchPosition", "searchPosition", "Lkotlin/Pair;", "", "offset", "renderSearchResult", "results", "", "app_debug"})
public abstract interface IMarkdownView {
    
    public abstract float getFontSize();
    
    public abstract void setFontSize(float p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.text.Spannable getSpannableContent();
    
    public abstract void renderSearchResult(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> results, int offset);
    
    public abstract void renderSearchPosition(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.Integer, java.lang.Integer> searchPosition, int offset);
    
    public abstract void clearSearchResult();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static void renderSearchResult(ru.skillbranch.skillarticles.ui.custom.markdown.IMarkdownView $this, @org.jetbrains.annotations.NotNull()
        java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> results, int offset) {
        }
        
        public static void renderSearchPosition(ru.skillbranch.skillarticles.ui.custom.markdown.IMarkdownView $this, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<java.lang.Integer, java.lang.Integer> searchPosition, int offset) {
        }
        
        public static void clearSearchResult(ru.skillbranch.skillarticles.ui.custom.markdown.IMarkdownView $this) {
        }
    }
}