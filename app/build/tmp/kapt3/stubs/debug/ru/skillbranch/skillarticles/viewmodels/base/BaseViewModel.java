package ru.skillbranch.skillarticles.viewmodels.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007J\b\u0010$\u001a\u00020%H\u0004Jk\u0010&\u001a\u00020%2\u0016\b\u0002\u0010\'\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020%\u0018\u00010(2\u0018\b\u0002\u0010*\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020%\u0018\u00010(2\'\u0010+\u001a#\b\u0001\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0.\u0012\u0006\u0012\u0004\u0018\u00010/0,\u00a2\u0006\u0002\b0H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u0010\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020\u0012H\u0016J\u0010\u00104\u001a\u00020%2\u0006\u00105\u001a\u00020\u0017H\u0007J1\u00106\u001a\u00020%2\u0006\u00107\u001a\u0002082!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020%0(J1\u0010=\u001a\u00020%2\u0006\u00107\u001a\u0002082!\u0010>\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020%0(J1\u0010?\u001a\u00020%2\u0006\u00107\u001a\u0002082!\u0010@\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020%0(J1\u0010B\u001a\u00020%2\u0006\u00107\u001a\u0002082!\u00109\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020%0(J7\u0010C\u001a\u00020%2\u0006\u00107\u001a\u0002082\'\u0010D\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020%0(J\u0014\u0010F\u001a\u00020%2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0006\u0010H\u001a\u00020%J\b\u0010I\u001a\u00020%H\u0016J\u0012\u0010J\u001a\u00020%2\b\b\u0002\u0010K\u001a\u00020\u000fH\u0004JV\u0010L\u001a\u00020%\"\u0004\b\u0001\u0010M2\f\u0010N\u001a\b\u0012\u0004\u0012\u0002HM0O28\u00109\u001a4\u0012\u0013\u0012\u0011HM\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(P\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00000,H\u0004J,\u0010Q\u001a\u00020%2!\u0010R\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00000(H\u0087\bR\u001a\u0010\b\u001a\u00028\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00110\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u0015R.\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00110\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\u0015R\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006S"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/base/BaseViewModel;", "T", "Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "Landroidx/lifecycle/ViewModel;", "handleState", "Landroidx/lifecycle/SavedStateHandle;", "initState", "(Landroidx/lifecycle/SavedStateHandle;Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;)V", "currentState", "currentState$annotations", "()V", "getCurrentState", "()Lru/skillbranch/skillarticles/viewmodels/base/IViewModelState;", "loading", "Landroidx/lifecycle/MutableLiveData;", "Lru/skillbranch/skillarticles/viewmodels/base/Loading;", "navigation", "Lru/skillbranch/skillarticles/viewmodels/base/Event;", "Lru/skillbranch/skillarticles/viewmodels/base/NavigationCommand;", "navigation$annotations", "getNavigation", "()Landroidx/lifecycle/MutableLiveData;", "notifications", "Lru/skillbranch/skillarticles/viewmodels/base/Notify;", "notifications$annotations", "getNotifications", "permissions", "", "", "permissions$annotations", "getPermissions", "state", "Landroidx/lifecycle/MediatorLiveData;", "state$annotations", "getState", "()Landroidx/lifecycle/MediatorLiveData;", "hideLoading", "", "launchSafety", "errHandler", "Lkotlin/Function1;", "", "compHandler", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "navigate", "command", "notify", "content", "observeLoading", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onChanged", "Lkotlin/ParameterName;", "name", "newState", "observeNavigation", "onNavigate", "observeNotifications", "onNotify", "notification", "observeState", "observerPermissions", "handle", "permisions", "requestPermissions", "requestedPermissions", "restoreState", "saveState", "showLoading", "loadingType", "subscribeOnDataSource", "S", "source", "Landroidx/lifecycle/LiveData;", "newValue", "updateState", "update", "app_debug"})
public abstract class BaseViewModel<T extends ru.skillbranch.skillarticles.viewmodels.base.IViewModelState> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.viewmodels.base.Event<ru.skillbranch.skillarticles.viewmodels.base.Notify>> notifications = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.viewmodels.base.Event<ru.skillbranch.skillarticles.viewmodels.base.NavigationCommand>> navigation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.viewmodels.base.Event<java.util.List<java.lang.String>>> permissions = null;
    private final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.viewmodels.base.Loading> loading = null;
    
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
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PROTECTED)
    @java.lang.Deprecated()
    public static void permissions$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ru.skillbranch.skillarticles.viewmodels.base.Event<java.util.List<java.lang.String>>> getPermissions() {
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
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PROTECTED)
    public final void notify(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.Notify content) {
    }
    
    protected final void showLoading(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.viewmodels.base.Loading loadingType) {
    }
    
    protected final void hideLoading() {
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
    
    public final void observeLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.skillbranch.skillarticles.viewmodels.base.Loading, kotlin.Unit> onChanged) {
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
    
    protected final void launchSafety(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errHandler, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> compHandler, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
    }
    
    public final void requestPermissions(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> requestedPermissions) {
    }
    
    public final void observerPermissions(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> handle) {
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handleState, @org.jetbrains.annotations.NotNull()
    T initState) {
        super();
    }
}