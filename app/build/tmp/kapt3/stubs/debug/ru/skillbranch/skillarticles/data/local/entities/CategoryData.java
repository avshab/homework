package ru.skillbranch.skillarticles.data.local.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\nH\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00d6\u0001J\u0010\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0019J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\nH\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006%"}, d2 = {"Lru/skillbranch/skillarticles/data/local/entities/CategoryData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "categoryId", "", "icon", "title", "articlesCount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getArticlesCount", "()I", "getCategoryId", "()Ljava/lang/String;", "getIcon", "getTitle", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toCategoryDataItem", "Lru/skillbranch/skillarticles/ui/dialogs/CategoryDataItem;", "checked", "toString", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class CategoryData implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "category_id")
    private final java.lang.String categoryId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String icon = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @androidx.room.ColumnInfo(name = "articles_count")
    private final int articlesCount = 0;
    public static final ru.skillbranch.skillarticles.data.local.entities.CategoryData.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.ui.dialogs.CategoryDataItem toCategoryDataItem(boolean checked) {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategoryId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getArticlesCount() {
        return 0;
    }
    
    public CategoryData(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int articlesCount) {
        super();
    }
    
    public CategoryData(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.local.entities.CategoryData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int articlesCount) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lru/skillbranch/skillarticles/data/local/entities/CategoryData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lru/skillbranch/skillarticles/data/local/entities/CategoryData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lru/skillbranch/skillarticles/data/local/entities/CategoryData;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<ru.skillbranch.skillarticles.data.local.entities.CategoryData> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ru.skillbranch.skillarticles.data.local.entities.CategoryData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ru.skillbranch.skillarticles.data.local.entities.CategoryData[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}