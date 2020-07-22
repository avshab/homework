package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\r\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$\u00a8\u0006%"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element;", "", "()V", "elements", "", "getElements", "()Ljava/util/List;", "text", "", "getText", "()Ljava/lang/CharSequence;", "BlockCode", "Bold", "Header", "Image", "InlineCode", "Italic", "Link", "OrderedListItem", "Quote", "Rule", "Strike", "Text", "UnorderedListItem", "Lru/skillbranch/skillarticles/data/repositories/Element$Text;", "Lru/skillbranch/skillarticles/data/repositories/Element$UnorderedListItem;", "Lru/skillbranch/skillarticles/data/repositories/Element$Header;", "Lru/skillbranch/skillarticles/data/repositories/Element$Quote;", "Lru/skillbranch/skillarticles/data/repositories/Element$Italic;", "Lru/skillbranch/skillarticles/data/repositories/Element$Bold;", "Lru/skillbranch/skillarticles/data/repositories/Element$Strike;", "Lru/skillbranch/skillarticles/data/repositories/Element$Rule;", "Lru/skillbranch/skillarticles/data/repositories/Element$InlineCode;", "Lru/skillbranch/skillarticles/data/repositories/Element$Link;", "Lru/skillbranch/skillarticles/data/repositories/Element$OrderedListItem;", "Lru/skillbranch/skillarticles/data/repositories/Element$BlockCode;", "Lru/skillbranch/skillarticles/data/repositories/Element$Image;", "app_debug"})
public abstract class Element {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.CharSequence getText();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements();
    
    private Element() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$Text;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "text", "", "elements", "", "(Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Text extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public Text(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Text copy(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$UnorderedListItem;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "text", "", "elements", "", "(Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class UnorderedListItem extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public UnorderedListItem(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.UnorderedListItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$Header;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "level", "", "text", "", "elements", "", "(ILjava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getLevel", "()I", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class Header extends ru.skillbranch.skillarticles.data.repositories.Element {
        private final int level = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        public final int getLevel() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public Header(int level, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Header copy(int level, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$Quote;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "text", "", "elements", "", "(Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Quote extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public Quote(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Quote copy(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$Italic;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "text", "", "elements", "", "(Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Italic extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public Italic(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Italic copy(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$Bold;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "text", "", "elements", "", "(Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Bold extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public Bold(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Bold copy(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$Strike;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "text", "", "elements", "", "(Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Strike extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public Strike(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Strike copy(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$Rule;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "text", "", "elements", "", "(Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Rule extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public Rule(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        public Rule() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Rule copy(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$InlineCode;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "text", "", "elements", "", "(Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class InlineCode extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public InlineCode(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.InlineCode copy(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$Link;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "link", "", "text", "", "elements", "", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getLink", "()Ljava/lang/String;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Link extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String link = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLink() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public Link(@org.jetbrains.annotations.NotNull()
        java.lang.String link, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Link copy(@org.jetbrains.annotations.NotNull()
        java.lang.String link, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$OrderedListItem;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "order", "", "text", "", "elements", "", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getOrder", "()Ljava/lang/String;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OrderedListItem extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String order = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrder() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public OrderedListItem(@org.jetbrains.annotations.NotNull()
        java.lang.String order, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.OrderedListItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.String order, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$BlockCode;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "text", "", "elements", "", "(Ljava/lang/CharSequence;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class BlockCode extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public BlockCode(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.BlockCode copy(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u00c6\u0003J9\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/Element$Image;", "Lru/skillbranch/skillarticles/data/repositories/Element;", "url", "", "alt", "text", "", "elements", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;)V", "getAlt", "()Ljava/lang/String;", "getElements", "()Ljava/util/List;", "getText", "()Ljava/lang/CharSequence;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Image extends ru.skillbranch.skillarticles.data.repositories.Element {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String alt = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAlt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        public Image(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String alt, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Image copy(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String alt, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.Element> elements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}