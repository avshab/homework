package ru.skillbranch.skillarticles.data.local.entities;

import java.lang.System;

@androidx.room.TypeConverters(value = {ru.skillbranch.skillarticles.data.local.MarkdownConverter.class, ru.skillbranch.skillarticles.data.local.ListConverter.class})
@androidx.room.DatabaseView(value = "\n        SELECT id, article.title AS title, description, author_user_id, author_avatar, author_name, date, \n        category.category_id AS category_category_id, category.title AS category_title, category.icon AS category_icon,\n        content.share_link AS share_link, content.content AS content,\n        personal.is_bookmark AS is_bookmark, personal.is_like AS is_like, GROUP_CONCAT(refs.t_id) as tags, source\n        FROM articles AS article\n        LEFT JOIN article_personal_infos AS personal ON personal.article_id = id\n        LEFT JOIN article_contents AS content ON content.article_id =id\n        LEFT JOIN article_categories AS category ON category.category_id =article.category_id\n        LEFT JOIN article_tag_x_ref AS refs ON id = refs.a_id \n        GROUP BY id\n    ")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\u0002\u0010\u0015J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\fH\u00c6\u0003J\t\u00100\u001a\u00020\fH\u00c6\u0003J\t\u00101\u001a\u00020\u000fH\u00c6\u0003J\u0093\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0001J\u0013\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010!R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001f\u00a8\u00068"}, d2 = {"Lru/skillbranch/skillarticles/data/local/entities/ArticleFull;", "", "id", "", "title", "description", "author", "Lru/skillbranch/skillarticles/data/local/entities/Author;", "category", "Lru/skillbranch/skillarticles/data/local/entities/Category;", "shareLink", "isBookmark", "", "isLike", "date", "Ljava/util/Date;", "content", "", "Lru/skillbranch/skillarticles/data/repositories/MarkdownElement;", "source", "tags", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/skillbranch/skillarticles/data/local/entities/Author;Lru/skillbranch/skillarticles/data/local/entities/Category;Ljava/lang/String;ZZLjava/util/Date;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getAuthor", "()Lru/skillbranch/skillarticles/data/local/entities/Author;", "getCategory", "()Lru/skillbranch/skillarticles/data/local/entities/Category;", "getContent", "()Ljava/util/List;", "getDate", "()Ljava/util/Date;", "getDescription", "()Ljava/lang/String;", "getId", "()Z", "getShareLink", "getSource", "getTags", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class ArticleFull {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "author_")
    private final ru.skillbranch.skillarticles.data.local.entities.Author author = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "category_")
    private final ru.skillbranch.skillarticles.data.local.entities.Category category = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "share_link")
    private final java.lang.String shareLink = null;
    @androidx.room.ColumnInfo(name = "is_bookmark")
    private final boolean isBookmark = false;
    @androidx.room.ColumnInfo(name = "is_like")
    private final boolean isLike = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<ru.skillbranch.skillarticles.data.repositories.MarkdownElement> content = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String source = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> tags = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.local.entities.Author getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.local.entities.Category getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShareLink() {
        return null;
    }
    
    public final boolean isBookmark() {
        return false;
    }
    
    public final boolean isLike() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ru.skillbranch.skillarticles.data.repositories.MarkdownElement> getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    public ArticleFull(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.entities.Author author, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.entities.Category category, @org.jetbrains.annotations.Nullable()
    java.lang.String shareLink, boolean isBookmark, boolean isLike, @org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.MarkdownElement> content, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tags) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.local.entities.Author component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.local.entities.Category component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ru.skillbranch.skillarticles.data.repositories.MarkdownElement> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.skillarticles.data.local.entities.ArticleFull copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.entities.Author author, @org.jetbrains.annotations.NotNull()
    ru.skillbranch.skillarticles.data.local.entities.Category category, @org.jetbrains.annotations.Nullable()
    java.lang.String shareLink, boolean isBookmark, boolean isLike, @org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends ru.skillbranch.skillarticles.data.repositories.MarkdownElement> content, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tags) {
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