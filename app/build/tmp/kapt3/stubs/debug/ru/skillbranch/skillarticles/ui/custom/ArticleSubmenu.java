package ru.skillbranch.skillarticles.ui.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014J\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/ArticleSubmenu;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$AttachedBehavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "centerX", "", "centerY", "isOpen", "", "()Z", "setOpen", "(Z)V", "animatedHide", "", "animatedShow", "close", "getBehavior", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "open", "SavedState", "app_debug"})
public final class ArticleSubmenu extends androidx.constraintlayout.widget.ConstraintLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private boolean isOpen = false;
    private float centerX;
    private float centerY;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<ru.skillbranch.skillarticles.ui.custom.ArticleSubmenu> getBehavior() {
        return null;
    }
    
    public final boolean isOpen() {
        return false;
    }
    
    public final void setOpen(boolean p0) {
    }
    
    public final void open() {
    }
    
    public final void close() {
    }
    
    private final void animatedShow() {
    }
    
    private final void animatedHide() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable state) {
    }
    
    public ArticleSubmenu(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public ArticleSubmenu(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ArticleSubmenu(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/ArticleSubmenu$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "(Landroid/os/Parcelable;)V", "src", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "ssIsOpen", "", "getSsIsOpen", "()Z", "setSsIsOpen", "(Z)V", "describeContents", "", "writeToParcel", "", "dst", "flags", "CREATOR", "app_debug"})
    static final class SavedState extends android.view.View.BaseSavedState implements android.os.Parcelable {
        private boolean ssIsOpen = false;
        public static final ru.skillbranch.skillarticles.ui.custom.ArticleSubmenu.SavedState.CREATOR CREATOR = null;
        
        public final boolean getSsIsOpen() {
            return false;
        }
        
        public final void setSsIsOpen(boolean p0) {
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel dst, int flags) {
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        public SavedState(@org.jetbrains.annotations.Nullable()
        android.os.Parcelable superState) {
            super(null);
        }
        
        public SavedState(@org.jetbrains.annotations.NotNull()
        android.os.Parcel src) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lru/skillbranch/skillarticles/ui/custom/ArticleSubmenu$SavedState$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lru/skillbranch/skillarticles/ui/custom/ArticleSubmenu$SavedState;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lru/skillbranch/skillarticles/ui/custom/ArticleSubmenu$SavedState;", "app_debug"})
        public static final class CREATOR implements android.os.Parcelable.Creator<ru.skillbranch.skillarticles.ui.custom.ArticleSubmenu.SavedState> {
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public ru.skillbranch.skillarticles.ui.custom.ArticleSubmenu.SavedState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public ru.skillbranch.skillarticles.ui.custom.ArticleSubmenu.SavedState[] newArray(int size) {
                return null;
            }
            
            private CREATOR() {
                super();
            }
        }
    }
}