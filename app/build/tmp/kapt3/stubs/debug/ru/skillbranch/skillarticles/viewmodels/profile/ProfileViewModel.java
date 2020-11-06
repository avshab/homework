package ru.skillbranch.skillarticles.viewmodels.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0010J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0010J&\u0010\u0019\u001a\u00020\u00102\u001e\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bJ\u0010\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 J1\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020\u00100$J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\tH\u0007R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/profile/ProfileViewModel;", "Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "Lru/skillbranch/skillarticles/viewmodels/profile/ProfileState;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "activityResults", "Landroidx/lifecycle/MutableLiveData;", "Lru/skillbranch/skillarticles/viewmodels/base/Event;", "Lru/skillbranch/skillarticles/viewmodels/profile/PendingAction;", "repository", "Lru/skillbranch/skillarticles/data/repositories/ProfileRepository;", "storagePermissions", "", "", "executeOpenSettings", "", "executePendingAction", "handleCameraAction", "destination", "Landroid/net/Uri;", "handleDeleteAction", "handleEditAction", "source", "handleGalleryAction", "handlePermission", "permissionsResult", "", "Lkotlin/Pair;", "", "handleUploadPhoto", "inputStream", "Ljava/io/InputStream;", "observeActivityResults", "owner", "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "action", "startForResult", "app_debug"})
public final class ProfileViewModel extends ru.skillbranch.skillarticles.viewmodels.base.BaseViewModel<ru.skillbranch.skillarticles.viewmodels.profile.ProfileState> {
    private final ru.skillbranch.skillarticles.data.repositories.ProfileRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.viewmodels.base.Event<ru.skillbranch.skillarticles.viewmodels.profile.PendingAction>> activityResults = null;
    private final java.util.List<java.lang.String> storagePermissions = null;
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public final void startForResult(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.profile.PendingAction action) {
    }
    
    public final void handlePermission(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, kotlin.Pair<java.lang.Boolean, java.lang.Boolean>> permissionsResult) {
    }
    
    public final void executeOpenSettings() {
    }
    
    public final void executePendingAction() {
    }
    
    public final void handleUploadPhoto(@org.jetbrains.annotations.Nullable()
    java.io.InputStream inputStream) {
    }
    
    public final void observeActivityResults(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.skillbranch.skillarticles.viewmodels.profile.PendingAction, kotlin.Unit> handle) {
    }
    
    public final void handleEditAction(@org.jetbrains.annotations.NotNull()
    android.net.Uri source, @org.jetbrains.annotations.NotNull()
    android.net.Uri destination) {
    }
    
    public final void handleDeleteAction() {
    }
    
    public final void handleGalleryAction() {
    }
    
    public final void handleCameraAction(@org.jetbrains.annotations.NotNull()
    android.net.Uri destination) {
    }
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handle) {
        super(null, null);
    }
}