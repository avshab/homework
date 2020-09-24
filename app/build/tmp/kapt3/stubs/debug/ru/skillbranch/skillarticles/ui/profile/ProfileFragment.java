package ru.skillbranch.skillarticles.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001f\u0010\u0004\u001a\u00060\u0005R\u00020\u00008VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u00028TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lru/skillbranch/skillarticles/ui/profile/ProfileFragment;", "Lru/skillbranch/skillarticles/ui/base/BaseFragment;", "Lru/skillbranch/skillarticles/viewmodels/profile/ProfileViewModel;", "()V", "binding", "Lru/skillbranch/skillarticles/ui/profile/ProfileFragment$ProfileBinding;", "getBinding", "()Lru/skillbranch/skillarticles/ui/profile/ProfileFragment$ProfileBinding;", "binding$delegate", "Lkotlin/Lazy;", "layout", "", "getLayout", "()I", "viewModel", "getViewModel", "()Lru/skillbranch/skillarticles/viewmodels/profile/ProfileViewModel;", "viewModel$delegate", "setupViews", "", "updateAvatar", "avatarUrl", "", "ProfileBinding", "app_debug"})
public final class ProfileFragment extends ru.skillbranch.skillarticles.ui.base.BaseFragment<ru.skillbranch.skillarticles.viewmodels.profile.ProfileViewModel> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final int layout = ru.skillbranch.skillarticles.R.layout.fragment_profile;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected ru.skillbranch.skillarticles.viewmodels.profile.ProfileViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.skillarticles.ui.profile.ProfileFragment.ProfileBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void setupViews() {
    }
    
    private final void updateAvatar(java.lang.String avatarUrl) {
    }
    
    public ProfileFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019\u00a8\u0006#"}, d2 = {"Lru/skillbranch/skillarticles/ui/profile/ProfileFragment$ProfileBinding;", "Lru/skillbranch/skillarticles/ui/base/Binding;", "(Lru/skillbranch/skillarticles/ui/profile/ProfileFragment;)V", "<set-?>", "", "about", "getAbout", "()Ljava/lang/String;", "setAbout", "(Ljava/lang/String;)V", "about$delegate", "Lkotlin/properties/ReadWriteProperty;", "avatar", "getAvatar", "setAvatar", "avatar$delegate", "name", "getName", "setName", "name$delegate", "", "rating", "getRating", "()I", "setRating", "(I)V", "rating$delegate", "respect", "getRespect", "setRespect", "respect$delegate", "bind", "", "data", "Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "app_debug"})
    public final class ProfileBinding extends ru.skillbranch.skillarticles.ui.base.Binding {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty avatar$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty name$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty about$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty rating$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty respect$delegate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAvatar() {
            return null;
        }
        
        public final void setAvatar(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAbout() {
            return null;
        }
        
        public final void setAbout(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getRating() {
            return 0;
        }
        
        public final void setRating(int p0) {
        }
        
        public final int getRespect() {
            return 0;
        }
        
        public final void setRespect(int p0) {
        }
        
        @java.lang.Override()
        public void bind(@org.jetbrains.annotations.NotNull()
        ru.skillbranch.skillarticles.viewmodels.base.IViewModelState data) {
        }
        
        public ProfileBinding() {
            super();
        }
    }
}