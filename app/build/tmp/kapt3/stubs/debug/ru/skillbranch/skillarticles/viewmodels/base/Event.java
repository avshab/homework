package ru.skillbranch.skillarticles.viewmodels.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\r\u0010\f\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\rR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/base/Event;", "E", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "hasBeenHandled", "", "getHasBeenHandled", "()Z", "setHasBeenHandled", "(Z)V", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "app_debug"})
public final class Event<E extends java.lang.Object> {
    private boolean hasBeenHandled = false;
    private final E content = null;
    
    public final boolean getHasBeenHandled() {
        return false;
    }
    
    public final void setHasBeenHandled(boolean p0) {
    }
    
    /**
     * *
     * возвращает контент который еще не был обработан иначе null
     */
    @org.jetbrains.annotations.Nullable()
    public final E getContentIfNotHandled() {
        return null;
    }
    
    public final E peekContent() {
        return null;
    }
    
    public Event(E content) {
        super();
    }
}