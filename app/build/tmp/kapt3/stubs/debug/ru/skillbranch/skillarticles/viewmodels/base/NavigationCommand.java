package ru.skillbranch.skillarticles.viewmodels.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand;", "", "()V", "FinishLogin", "StartLogin", "To", "Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand$To;", "Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand$StartLogin;", "Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand$FinishLogin;", "app_debug"})
public abstract class NavigationCommand {
    
    private NavigationCommand() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand$To;", "Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand;", "destination", "", "args", "Landroid/os/Bundle;", "options", "Landroidx/navigation/NavOptions;", "extras", "Landroidx/navigation/Navigator$Extras;", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "getArgs", "()Landroid/os/Bundle;", "getDestination", "()I", "getExtras", "()Landroidx/navigation/Navigator$Extras;", "getOptions", "()Landroidx/navigation/NavOptions;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class To extends ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand {
        private final int destination = 0;
        @org.jetbrains.annotations.Nullable()
        private final android.os.Bundle args = null;
        @org.jetbrains.annotations.Nullable()
        private final androidx.navigation.NavOptions options = null;
        @org.jetbrains.annotations.Nullable()
        private final androidx.navigation.Navigator.Extras extras = null;
        
        public final int getDestination() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.os.Bundle getArgs() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.navigation.NavOptions getOptions() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.navigation.Navigator.Extras getExtras() {
            return null;
        }
        
        public To(int destination, @org.jetbrains.annotations.Nullable()
        android.os.Bundle args, @org.jetbrains.annotations.Nullable()
        androidx.navigation.NavOptions options, @org.jetbrains.annotations.Nullable()
        androidx.navigation.Navigator.Extras extras) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.os.Bundle component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.navigation.NavOptions component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.navigation.Navigator.Extras component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand.To copy(int destination, @org.jetbrains.annotations.Nullable()
        android.os.Bundle args, @org.jetbrains.annotations.Nullable()
        androidx.navigation.NavOptions options, @org.jetbrains.annotations.Nullable()
        androidx.navigation.Navigator.Extras extras) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand$StartLogin;", "Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand;", "privateDestination", "", "(Ljava/lang/Integer;)V", "getPrivateDestination", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand$StartLogin;", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class StartLogin extends ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer privateDestination = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPrivateDestination() {
            return null;
        }
        
        public StartLogin(@org.jetbrains.annotations.Nullable()
        java.lang.Integer privateDestination) {
            super();
        }
        
        public StartLogin() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand.StartLogin copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer privateDestination) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand$FinishLogin;", "Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand;", "privateDestination", "", "(Ljava/lang/Integer;)V", "getPrivateDestination", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand$FinishLogin;", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class FinishLogin extends ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer privateDestination = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPrivateDestination() {
            return null;
        }
        
        public FinishLogin(@org.jetbrains.annotations.Nullable()
        java.lang.Integer privateDestination) {
            super();
        }
        
        public FinishLogin() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand.FinishLogin copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer privateDestination) {
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