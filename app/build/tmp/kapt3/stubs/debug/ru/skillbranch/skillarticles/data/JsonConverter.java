package ru.skillbranch.skillarticles.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lru/skillbranch/skillarticles/data/JsonConverter;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "DateAdapter", "app_debug"})
public final class JsonConverter {
    private static final com.squareup.moshi.Moshi moshi = null;
    public static final ru.skillbranch.skillarticles.data.JsonConverter INSTANCE = null;
    
    public final com.squareup.moshi.Moshi getMoshi() {
        return null;
    }
    
    private JsonConverter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lru/skillbranch/skillarticles/data/JsonConverter$DateAdapter;", "", "()V", "fromJson", "Ljava/util/Date;", "timestamp", "", "toJson", "date", "app_debug"})
    public static final class DateAdapter {
        
        @org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.FromJson()
        public final java.util.Date fromJson(long timestamp) {
            return null;
        }
        
        @com.squareup.moshi.ToJson()
        public final long toJson(@org.jetbrains.annotations.NotNull()
        java.util.Date date) {
            return 0L;
        }
        
        public DateAdapter() {
            super();
        }
    }
}