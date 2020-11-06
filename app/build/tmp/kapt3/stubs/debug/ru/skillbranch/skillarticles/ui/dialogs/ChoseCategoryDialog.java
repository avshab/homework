package ru.skillbranch.skillarticles.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lru/skillbranch/skillarticles/ui/dialogs/ChoseCategoryDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "args", "Lru/skillbranch/skillarticles/ui/dialogs/ChoseCategoryDialogArgs;", "getArgs", "()Lru/skillbranch/skillarticles/ui/dialogs/ChoseCategoryDialogArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "categoryAdapter", "Lru/skillbranch/skillarticles/ui/dialogs/CategoryAdapter;", "selected", "", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "", "outState", "Companion", "app_debug"})
public final class ChoseCategoryDialog extends androidx.fragment.app.DialogFragment {
    private final java.util.Set<java.lang.String> selected = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final ru.skillbranch.skillarticles.ui.dialogs.CategoryAdapter categoryAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHOOSE_CATEGORY_KEY = "CHOOSE_CATEGORY_KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECTED_CATEGORIES = "SELECTED_CATEGORIES";
    public static final ru.skillbranch.skillarticles.ui.dialogs.ChoseCategoryDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final ru.skillbranch.skillarticles.ui.dialogs.ChoseCategoryDialogArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public ChoseCategoryDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lru/skillbranch/skillarticles/ui/dialogs/ChoseCategoryDialog$Companion;", "", "()V", "CHOOSE_CATEGORY_KEY", "", "SELECTED_CATEGORIES", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}