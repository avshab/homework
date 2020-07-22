package ru.skillbranch.skillarticles.viewmodels.article;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&\u00a8\u0006\u0015"}, d2 = {"Lru/skillbranch/skillarticles/viewmodels/article/IArticleViewModel;", "", "handleBookmark", "", "handleCopyCode", "handleDownResult", "handleDownText", "handleLike", "handleNightMode", "handleSearch", "query", "", "handleSearchMode", "isSearch", "", "handleSendComment", "comment", "handleShare", "handleToggleMenu", "handleUpResult", "handleUpText", "app_debug"})
public abstract interface IArticleViewModel {
    
    /**
     * Получение настроек приложения
     */
    public abstract void handleNightMode();
    
    /**
     * Обработка нажатия на btn_text_up (увеличение шрифта текста)
     * необходимо увеличить шрифт до значения 18
     */
    public abstract void handleUpText();
    
    /**
     * Обработка нажатия на btn_text_down (стандартный размер шрифта)
     * необходимо установить размер шрифта по умолчанию 14
     */
    public abstract void handleDownText();
    
    /**
     * добавление/удалние статьи в закладки, обрабока нажатия на кнопку btn_bookmark
     * необходимо отобразить сообщение пользователю "Add to bookmarks" или "Remove from bookmarks"
     * в соответствии с текущим состоянием
     */
    public abstract void handleBookmark();
    
    /**
     * добавление/удалние статьи в понравившееся, обрабока нажатия на кнопку btn_like
     * необходимо отобразить сообщение пользователю (Notify.ActionMessage) "Mark is liked" или
     * "Don`t like it anymore"  в соответствии с текущим состоянием.
     * если пользователь убрал Like необходимо добавить  actionLabel в снекбар
     * "No, still like it" при нажатиии на который состояние вернется к isLike = true
     */
    public abstract void handleLike();
    
    /**
     * поделиться статьей, обрабока нажатия на кнопку btn_share
     * необходимо отобразить сообщение с ошибкой пользователю (Notify.ErrorMessage) "Share is not implemented"
     * и текстом errLabel "OK"
     */
    public abstract void handleShare();
    
    /**
     * обрабока нажатия на кнопку btn_settings
     * необходимо отобразить или скрыть меню в соответствии с текущим состоянием
     */
    public abstract void handleToggleMenu();
    
    /**
     * обрабока перехода в режим поиска searchView
     * при нажатии на пункту меню тулбара необходимо отобразить searchView и сохранить состояние при
     * изменении конфигурации (пересоздании активити)
     */
    public abstract void handleSearchMode(boolean isSearch);
    
    /**
     * обрабока поискового запроса, необходимо сохранить поисковый запрос и отображать его в
     * searchView при изменении конфигурации (пересоздании активити)
     */
    public abstract void handleSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String query);
    
    /**
     * обрабока нажатия на btn_result_up ,необходимо перенести фокус на предидущее поисковое вхождение
     */
    public abstract void handleUpResult();
    
    /**
     * обрабока нажатия на btn_result_down ,необходимо перенести фокус на следующее поисковое вхождение
     */
    public abstract void handleDownResult();
    
    /**
     * обрабока нажатия на iv_copy в MarkdownCodeView, необходимо скопировать код из MarkdownCodeView в буфер обмена
     */
    public abstract void handleCopyCode();
    
    /**
     * обрабока отправки комментария, если пользователь не авторизован отобразить экран авторизации
     */
    public abstract void handleSendComment(@org.jetbrains.annotations.Nullable()
    java.lang.String comment);
}