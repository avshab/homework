package ru.skillbranch.skillarticles.viewmodels.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0015H\u0005J1\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001e0&J1\u0010)\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u001e0&J1\u0010,\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u001e0&J\u0006\u0010/\u001a\u00020\u001eJ\b\u00100\u001a\u00020\u001eH\u0016JV\u00101\u001a\u00020\u001e\"\u0004\b\u0001\u001022\f\u00103\u001a\b\u0012\u0004\u0012\u0002H20428\u0010-\u001a4\u0012\u0013\u0012\u0011H2\u00a2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u000005H\u0004J,\u00107\u001a\u00020\u001e2!\u00108\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00000&H\u0087\bR\u001a\u0010\b\u001a\u00028\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\u0013R\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00069"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "T", "Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "Landroidx/lifecycle/ViewModel;", "handleState", "Landroidx/lifecycle/SavedStateHandle;", "initState", "(Landroidx/lifecycle/SavedStateHandle;Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;)V", "currentState", "currentState$annotations", "()V", "getCurrentState", "()Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "navigation", "Landroidx/lifecycle/MutableLiveData;", "Lru/skillbranch/skillarticles/viewmodels/base/Event;", "Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand;", "navigation$annotations", "getNavigation", "()Landroidx/lifecycle/MutableLiveData;", "notifications", "Lru/skillbranch/skillarticles/viewmodels/base/Notify;", "notifications$annotations", "getNotifications", "state", "Landroidx/lifecycle/MediatorLiveData;", "state$annotations", "getState", "()Landroidx/lifecycle/MediatorLiveData;", "navigate", "", "command", "notify", "content", "observeNavigation", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onNavigate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "observeNotifications", "onNotify", "notification", "observeState", "onChanged", "newState", "restoreState", "saveState", "subscribeOnDataSource", "S", "source", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function2;", "newValue", "updateState", "update", "app_debug"})
public abstract class BaseViewModel<T extends ru.skillbranch.skillarticles.viewmodels.base.IViewModelState> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.viewmodels.base.Event<ru.skillbranch.skillarticles.viewmodels.base.Notify>> notifications = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.viewmodels.base.Event<ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand>> navigation = null;
    
    /**
     * *
     * Инициализация начального состояния аргументом конструктоа, и объявления состояния как
     * MediatorLiveData - медиатор исспользуется для того чтобы учитывать изменяемые данные модели
     * и обновлять состояние ViewModel исходя из полученных данных
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<T> state = null;
    private final androidx.lifecycle.SavedStateHandle handleState = null;
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PROTECTED)
    @java.lang.Deprecated()
    public static void notifications$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.viewmodels.base.Event<ru.skillbranch.skillarticles.viewmodels.base.Notify>> getNotifications() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PROTECTED)
    @java.lang.Deprecated()
    public static void navigation$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.viewmodels.base.Event<ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand>> getNavigation() {
        return null;
    }
    
    /**
     * *
     * Инициализация начального состояния аргументом конструктоа, и объявления состояния как
     * MediatorLiveData - медиатор исспользуется для того чтобы учитывать изменяемые данные модели
     * и обновлять состояние ViewModel исходя из полученных данных
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PROTECTED)
    @java.lang.Deprecated()
    public static void state$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<T> getState() {
        return null;
    }
    
    /**
     * *
     * getter для получения not null значения текущего состояния ViewModel
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PROTECTED)
    @java.lang.Deprecated()
    public static void currentState$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getCurrentState() {
        return null;
    }
    
    /**
     * *
     * лямбда выражение принимает в качестве аргумента текущее состояние и возвращает
     * модифицированное состояние, которое присваивается текущему состоянию
     */
    @androidx.annotation.UiThread()
    public final void updateState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends T> update) {
    }
    
    /**
     * *
     * функция для создания уведомления пользователя о событии (событие обрабатывается только один раз)
     * соответсвенно при изменении конфигурации и пересоздании Activity уведомление не будет вызвано
     * повторно
     */
    @androidx.annotation.UiThread()
    protected final void notify(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.Notify content) {
    }
    
    public void navigate(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand command) {
    }
    
    /**
     * *
     * более компактная форма записи observe() метода LiveData принимает последним аргумент лямбда
     * выражение обрабатывающее изменение текущего стостояния
     */
    public final void observeState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onChanged) {
    }
    
    /**
     * *
     * более компактная форма записи observe() метода LiveData вызывает лямбда выражение обработчик
     * только в том случае если уведомление не было уже обработанно ранее,
     * реализует данное поведение с помощью EventObserver
     */
    public final void observeNotifications(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.skillbranch.skillarticles.viewmodels.base.Notify, kotlin.Unit> onNotify) {
    }
    
    public final void observeNavigation(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand, kotlin.Unit> onNavigate) {
    }
    
    /**
     * *
     * функция принимает источник данных и лямбда выражение обрабатывающее поступающие данные источника
     * лямбда принимает новые данные и текущее состояние ViewModel в качестве аргументов,
     * изменяет его и возвращает модифицированное состояние, которое устанавливается как текущее
     */
    protected final <S extends java.lang.Object>void subscribeOnDataSource(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<S> source, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super S, ? super T, ? extends T> onChanged) {
    }
    
    public void saveState() {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final void restoreState() {
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handleState, @org.jetbrains.annotations.NotNull()
    T initState) {
        super();
    }
}