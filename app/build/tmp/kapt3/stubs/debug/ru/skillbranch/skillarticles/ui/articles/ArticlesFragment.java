package ru.skillbranch.skillarticles.ui.articles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u00060\rR\u00020\u00008VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u00a2\u0006\u0002\b\u001aX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020\u00028TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b \u0010!\u00a8\u00063"}, d2 = {"Lru/skillbranch/skillarticles/ui/articles/ArticlesFragment;", "Lru/skillbranch/skillarticles/ui/base/BaseFragment;", "Lru/skillbranch/skillarticles/viewmodels/articles/ArticlesViewModel;", "()V", "args", "Lru/skillbranch/skillarticles/ui/articles/ArticlesFragmentArgs;", "getArgs", "()Lru/skillbranch/skillarticles/ui/articles/ArticlesFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "articlesAdapter", "Lru/skillbranch/skillarticles/ui/articles/ArticlesAdapter;", "binding", "Lru/skillbranch/skillarticles/ui/articles/ArticlesFragment$ArticlesBinding;", "getBinding", "()Lru/skillbranch/skillarticles/ui/articles/ArticlesFragment$ArticlesBinding;", "binding$delegate", "Lkotlin/Lazy;", "layout", "", "getLayout", "()I", "prepareToolbar", "Lkotlin/Function1;", "Lru/skillbranch/skillarticles/ui/base/ToolbarBuilder;", "", "Lkotlin/ExtensionFunctionType;", "getPrepareToolbar", "()Lkotlin/jvm/functions/Function1;", "suggestionsAdapter", "Landroidx/cursoradapter/widget/SimpleCursorAdapter;", "viewModel", "getViewModel", "()Lru/skillbranch/skillarticles/viewmodels/articles/ArticlesViewModel;", "viewModel$delegate", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "populateAdapter", "Landroid/database/Cursor;", "constraint", "", "renderLoading", "loadingState", "Lru/skillbranch/skillarticles/viewmodels/base/Loading;", "setupViews", "ArticlesBinding", "app_debug"})
public final class ArticlesFragment extends ru.skillbranch.skillarticles.ui.base.BaseFragment<ru.skillbranch.skillarticles.viewmodels.articles.ArticlesViewModel> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final int layout = ru.skillbranch.skillarticles.R.layout.fragment_articles;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private androidx.cursoradapter.widget.SimpleCursorAdapter suggestionsAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<ru.skillbranch.skillarticles.ui.base.ToolbarBuilder, kotlin.Unit> prepareToolbar = null;
    private final ru.skillbranch.skillarticles.ui.articles.ArticlesAdapter articlesAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected ru.skillbranch.skillarticles.viewmodels.articles.ArticlesViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.skillarticles.ui.articles.ArticlesFragment.ArticlesBinding getBinding() {
        return null;
    }
    
    private final ru.skillbranch.skillarticles.ui.articles.ArticlesFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<ru.skillbranch.skillarticles.ui.base.ToolbarBuilder, kotlin.Unit> getPrepareToolbar() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void renderLoading(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.Loading loadingState) {
    }
    
    @java.lang.Override()
    public void setupViews() {
    }
    
    private final android.database.Cursor populateAdapter(java.lang.CharSequence constraint) {
        return null;
    }
    
    public ArticlesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0016R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R7\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR7\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b)\u0010\u0016\u001a\u0004\b\'\u0010\f\"\u0004\b(\u0010\u000e\u00a8\u0006-"}, d2 = {"Lru/skillbranch/skillarticles/ui/articles/ArticlesFragment$ArticlesBinding;", "Lru/skillbranch/skillarticles/ui/base/Binding;", "(Lru/skillbranch/skillarticles/ui/articles/ArticlesFragment;)V", "afterInflated", "Lkotlin/Function0;", "", "getAfterInflated", "()Lkotlin/jvm/functions/Function0;", "categories", "", "Lru/skillbranch/skillarticles/data/local/entities/CategoryData;", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "<set-?>", "", "isHashtagSearch", "()Z", "setHashtagSearch", "(Z)V", "isHashtagSearch$delegate", "Lkotlin/properties/ReadWriteProperty;", "isLoading", "setLoading", "isLoading$delegate", "isSearch", "setSearch", "searchQuery", "", "getSearchQuery", "()Ljava/lang/String;", "setSearchQuery", "(Ljava/lang/String;)V", "selectedCategories", "getSelectedCategories", "setSelectedCategories", "selectedCategories$delegate", "tags", "getTags", "setTags", "tags$delegate", "bind", "data", "Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "app_debug"})
    public final class ArticlesBinding extends ru.skillbranch.skillarticles.ui.base.Binding {
        @org.jetbrains.annotations.NotNull()
        private java.util.List<ru.skillbranch.skillarticles.data.local.entities.CategoryData> categories;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty selectedCategories$delegate = null;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String searchQuery;
        private boolean isSearch = false;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty isLoading$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty isHashtagSearch$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty tags$delegate = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> afterInflated = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.skillbranch.skillarticles.data.local.entities.CategoryData> getCategories() {
            return null;
        }
        
        public final void setCategories(@org.jetbrains.annotations.NotNull()
        java.util.List<ru.skillbranch.skillarticles.data.local.entities.CategoryData> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getSelectedCategories() {
            return null;
        }
        
        public final void setSelectedCategories(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSearchQuery() {
            return null;
        }
        
        public final void setSearchQuery(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean isSearch() {
            return false;
        }
        
        public final void setSearch(boolean p0) {
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        public final void setLoading(boolean p0) {
        }
        
        public final boolean isHashtagSearch() {
            return false;
        }
        
        public final void setHashtagSearch(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getTags() {
            return null;
        }
        
        public final void setTags(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @java.lang.Override()
        public void bind(@org.jetbrains.annotations.NotNull()
        ru.skillbranch.skillarticles.viewmodels.base.IViewModelState data) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getAfterInflated() {
            return null;
        }
        
        public ArticlesBinding() {
            super();
        }
    }
}