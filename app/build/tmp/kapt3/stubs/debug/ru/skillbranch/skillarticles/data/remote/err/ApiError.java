package ru.skillbranch.skillarticles.data.remote.err;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lru/skillbranch/skillarticles/data/remote/err/ApiError;", "Ljava/io/IOException;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "BadRequest", "Forbidden", "InternalServerError", "NotFound", "Unauthorized", "UnknownError", "Lru/skillbranch/skillarticles/data/remote/err/ApiError$BadRequest;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError$Unauthorized;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError$Forbidden;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError$NotFound;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError$InternalServerError;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError$UnknownError;", "app_debug"})
public abstract class ApiError extends java.io.IOException {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getMessage() {
        return null;
    }
    
    private ApiError(java.lang.String message) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lru/skillbranch/skillarticles/data/remote/err/ApiError$BadRequest;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class BadRequest extends ru.skillbranch.skillarticles.data.remote.err.ApiError {
        
        public BadRequest(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lru/skillbranch/skillarticles/data/remote/err/ApiError$Unauthorized;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Unauthorized extends ru.skillbranch.skillarticles.data.remote.err.ApiError {
        
        public Unauthorized(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lru/skillbranch/skillarticles/data/remote/err/ApiError$Forbidden;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Forbidden extends ru.skillbranch.skillarticles.data.remote.err.ApiError {
        
        public Forbidden(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lru/skillbranch/skillarticles/data/remote/err/ApiError$NotFound;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class NotFound extends ru.skillbranch.skillarticles.data.remote.err.ApiError {
        
        public NotFound(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lru/skillbranch/skillarticles/data/remote/err/ApiError$InternalServerError;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class InternalServerError extends ru.skillbranch.skillarticles.data.remote.err.ApiError {
        
        public InternalServerError(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lru/skillbranch/skillarticles/data/remote/err/ApiError$UnknownError;", "Lru/skillbranch/skillarticles/data/remote/err/ApiError;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class UnknownError extends ru.skillbranch.skillarticles.data.remote.err.ApiError {
        
        public UnknownError(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(null);
        }
    }
}