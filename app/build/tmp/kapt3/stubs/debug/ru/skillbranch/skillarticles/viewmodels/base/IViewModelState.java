package ru.skillbranch.skillarticles.viewmodels.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\b"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "", "restore", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "save", "", "outState", "app_debug"})
public abstract interface IViewModelState {
    
    /**
     * override this if need save state in bundle
     */
    public abstract void save(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle outState);
    
    /**
     * override this if need restore state from bundle
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ru.skillbranch.skillarticles.viewmodels.base.IViewModelState restore(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        /**
         * override this if need save state in bundle
         */
        public static void save(ru.skillbranch.skillarticles.viewmodels.base.IViewModelState $this, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle outState) {
        }
        
        /**
         * override this if need restore state from bundle
         */
        @org.jetbrains.annotations.NotNull()
        public static ru.skillbranch.skillarticles.viewmodels.base.IViewModelState restore(ru.skillbranch.skillarticles.viewmodels.base.IViewModelState $this, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle savedState) {
            return null;
        }
    }
}