package ru.skillbranch.skillarticles.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u00020\u0004:\u0003/01B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001eH\u0014J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0003H&R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00028\u0000X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00062"}, d2 = {"Lru/skillbranch/skillarticles/ui/base/BaseActivity;", "T", "Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "bottombarBuilder", "Lru/skillbranch/skillarticles/ui/base/BaseActivity$BottombarBuilder;", "getBottombarBuilder", "()Lru/skillbranch/skillarticles/ui/base/BaseActivity$BottombarBuilder;", "layout", "", "getLayout", "()I", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "toolbarBuilder", "Lru/skillbranch/skillarticles/ui/base/BaseActivity$ToolbarBuilder;", "getToolbarBuilder", "()Lru/skillbranch/skillarticles/ui/base/BaseActivity$ToolbarBuilder;", "viewModel", "getViewModel", "()Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRestoreInstanceState", "onSaveInstanceState", "outState", "onSupportNavigateUp", "", "renderLoading", "loadingState", "Lru/skillbranch/skillarticles/viewmodels/base/Loading;", "renderNotification", "notify", "Lru/skillbranch/skillarticles/viewmodels/base/Notify;", "subscribeOnNavigation", "command", "Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand;", "subscribeOnState", "state", "BottombarBuilder", "MenuItemHolder", "ToolbarBuilder", "app_debug"})
public abstract class BaseActivity<T extends ru.skillbranch.skillarticles.viewmodels.base.BaseViewModel<? extends ru.skillbranch.skillarticles.viewmodels.base.IViewModelState>> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull()
    private final ru.skillbranch.skillarticles.ui.base.BaseActivity.ToolbarBuilder toolbarBuilder = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.skillbranch.skillarticles.ui.base.BaseActivity.BottombarBuilder bottombarBuilder = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract T getViewModel();
    
    protected abstract int getLayout();
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.ui.base.BaseActivity.ToolbarBuilder getToolbarBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.ui.base.BaseActivity.BottombarBuilder getBottombarBuilder() {
        return null;
    }
    
    public abstract void subscribeOnState(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.IViewModelState state);
    
    public abstract void renderNotification(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.Notify notify);
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void subscribeOnNavigation(ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand command) {
    }
    
    public void renderLoading(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.Loading loadingState) {
    }
    
    public BaseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0000J!\u0010 \u001a\u00020\u00002\u0019\u0010!\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\"\u00a2\u0006\u0002\b#J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0014R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lru/skillbranch/skillarticles/ui/base/BaseActivity$ToolbarBuilder;", "", "()V", "items", "", "Lru/skillbranch/skillarticles/ui/base/BaseActivity$MenuItemHolder;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "logo", "", "getLogo", "()Ljava/lang/String;", "setLogo", "(Ljava/lang/String;)V", "subtitle", "getSubtitle", "setSubtitle", "visibility", "", "getVisibility", "()Z", "setVisibility", "(Z)V", "addMenuItem", "item", "build", "", "context", "Landroidx/fragment/app/FragmentActivity;", "invalidate", "prepare", "prepareFn", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "setSubTitle", "isVisible", "app_debug"})
    public static final class ToolbarBuilder {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String subtitle;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String logo;
        private boolean visibility = true;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<ru.skillbranch.skillarticles.ui.base.BaseActivity.MenuItemHolder> items;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSubtitle() {
            return null;
        }
        
        public final void setSubtitle(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLogo() {
            return null;
        }
        
        public final void setLogo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean getVisibility() {
            return false;
        }
        
        public final void setVisibility(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.ui.base.BaseActivity.MenuItemHolder> getItems() {
            return null;
        }
        
        public final void setItems(@org.jetbrains.annotations.NotNull()
        java.util.List<ru.skillbranch.skillarticles.ui.base.BaseActivity.MenuItemHolder> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.ToolbarBuilder setSubTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String subtitle) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.ToolbarBuilder setLogo(@org.jetbrains.annotations.NotNull()
        java.lang.String logo) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.ToolbarBuilder setVisibility(boolean isVisible) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.ToolbarBuilder addMenuItem(@org.jetbrains.annotations.NotNull()
        ru.skillbranch.skillarticles.ui.base.BaseActivity.MenuItemHolder item) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.ToolbarBuilder invalidate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.ToolbarBuilder prepare(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super ru.skillbranch.skillarticles.ui.base.BaseActivity.ToolbarBuilder, kotlin.Unit> prepareFn) {
            return null;
        }
        
        public final void build(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity context) {
        }
        
        public ToolbarBuilder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u00c6\u0003JP\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lru/skillbranch/skillarticles/ui/base/BaseActivity$MenuItemHolder;", "", "title", "", "menuId", "", "icon", "actionViewLayout", "clickListener", "Lkotlin/Function1;", "Landroid/view/MenuItem;", "", "(Ljava/lang/String;IILjava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "getActionViewLayout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "getIcon", "()I", "getMenuId", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;IILjava/lang/Integer;Lkotlin/jvm/functions/Function1;)Lru/skillbranch/skillarticles/ui/base/BaseActivity$MenuItemHolder;", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class MenuItemHolder {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        private final int menuId = 0;
        private final int icon = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer actionViewLayout = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlin.jvm.functions.Function1<android.view.MenuItem, kotlin.Unit> clickListener = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final int getMenuId() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getActionViewLayout() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<android.view.MenuItem, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public MenuItemHolder(@org.jetbrains.annotations.NotNull()
        java.lang.String title, int menuId, int icon, @org.jetbrains.annotations.Nullable()
        java.lang.Integer actionViewLayout, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.Unit> clickListener) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<android.view.MenuItem, kotlin.Unit> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.MenuItemHolder copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, int menuId, int icon, @org.jetbrains.annotations.Nullable()
        java.lang.Integer actionViewLayout, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.Unit> clickListener) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0000J!\u0010\u0010\u001a\u00020\u00002\u0019\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012\u00a2\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/ui/base/BaseActivity$BottombarBuilder;", "", "()V", "tempViews", "", "", "views", "visible", "", "addView", "layoutId", "build", "", "context", "Landroidx/fragment/app/FragmentActivity;", "invalidate", "prepare", "prepareFn", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "setVisibility", "isVisible", "app_debug"})
    public static final class BottombarBuilder {
        private boolean visible = true;
        private final java.util.List<java.lang.Integer> views = null;
        private final java.util.List<java.lang.Integer> tempViews = null;
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.BottombarBuilder addView(int layoutId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.BottombarBuilder setVisibility(boolean isVisible) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.BottombarBuilder prepare(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super ru.skillbranch.skillarticles.ui.base.BaseActivity.BottombarBuilder, kotlin.Unit> prepareFn) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.ui.base.BaseActivity.BottombarBuilder invalidate() {
            return null;
        }
        
        public final void build(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity context) {
        }
        
        public BottombarBuilder() {
            super();
        }
    }
}