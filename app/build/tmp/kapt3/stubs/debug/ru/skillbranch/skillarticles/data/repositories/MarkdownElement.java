package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\n\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/MarkdownElement;", "", "()V", "bounds", "Lkotlin/Pair;", "", "getBounds", "()Lkotlin/Pair;", "bounds$delegate", "Lkotlin/Lazy;", "offset", "getOffset", "()I", "Image", "Scroll", "Text", "Lru/skillbranch/skillarticles/data/repositories/MarkdownElement$Text;", "Lru/skillbranch/skillarticles/data/repositories/MarkdownElement$Image;", "Lru/skillbranch/skillarticles/data/repositories/MarkdownElement$Scroll;", "app_debug"})
public abstract class MarkdownElement {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy bounds$delegate = null;
    
    public abstract int getOffset();
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getBounds() {
        return null;
    }
    
    private MarkdownElement() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/MarkdownElement$Text;", "Lru/skillbranch/skillarticles/data/repositories/MarkdownElement;", "elements", "", "Lru/skillbranch/skillarticles/data/repositories/Element;", "offset", "", "(Ljava/util/List;I)V", "getElements", "()Ljava/util/List;", "getOffset", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class Text extends ru.skillbranch.skillarticles.data.repositories.MarkdownElement {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements = null;
        private final int offset = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> getElements() {
            return null;
        }
        
        @java.lang.Override()
        public int getOffset() {
            return 0;
        }
        
        public Text(@org.jetbrains.annotations.NotNull()
        java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements, int offset) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.MarkdownElement.Text copy(@org.jetbrains.annotations.NotNull()
        java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> elements, int offset) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/MarkdownElement$Image;", "Lru/skillbranch/skillarticles/data/repositories/MarkdownElement;", "image", "Lru/skillbranch/skillarticles/data/repositories/Element$Image;", "offset", "", "(Lru/skillbranch/skillarticles/data/repositories/Element$Image;I)V", "getImage", "()Lru/skillbranch/skillarticles/data/repositories/Element$Image;", "getOffset", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class Image extends ru.skillbranch.skillarticles.data.repositories.MarkdownElement {
        @org.jetbrains.annotations.NotNull()
        private final ru.skillbranch.skillarticles.data.repositories.Element.Image image = null;
        private final int offset = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Image getImage() {
            return null;
        }
        
        @java.lang.Override()
        public int getOffset() {
            return 0;
        }
        
        public Image(@org.jetbrains.annotations.NotNull()
        ru.skillbranch.skillarticles.data.repositories.Element.Image image, int offset) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.Image component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.MarkdownElement.Image copy(@org.jetbrains.annotations.NotNull()
        ru.skillbranch.skillarticles.data.repositories.Element.Image image, int offset) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/MarkdownElement$Scroll;", "Lru/skillbranch/skillarticles/data/repositories/MarkdownElement;", "blockCode", "Lru/skillbranch/skillarticles/data/repositories/Element$BlockCode;", "offset", "", "(Lru/skillbranch/skillarticles/data/repositories/Element$BlockCode;I)V", "getBlockCode", "()Lru/skillbranch/skillarticles/data/repositories/Element$BlockCode;", "getOffset", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class Scroll extends ru.skillbranch.skillarticles.data.repositories.MarkdownElement {
        @org.jetbrains.annotations.NotNull()
        private final ru.skillbranch.skillarticles.data.repositories.Element.BlockCode blockCode = null;
        private final int offset = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.BlockCode getBlockCode() {
            return null;
        }
        
        @java.lang.Override()
        public int getOffset() {
            return 0;
        }
        
        public Scroll(@org.jetbrains.annotations.NotNull()
        ru.skillbranch.skillarticles.data.repositories.Element.BlockCode blockCode, int offset) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.Element.BlockCode component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.data.repositories.MarkdownElement.Scroll copy(@org.jetbrains.annotations.NotNull()
        ru.skillbranch.skillarticles.data.repositories.Element.BlockCode blockCode, int offset) {
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