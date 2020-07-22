package ru.skillbranch.skillarticles.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.room.util.ViewInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import ru.skillbranch.skillarticles.data.local.dao.ArticleContentsDao;
import ru.skillbranch.skillarticles.data.local.dao.ArticleContentsDao_Impl;
import ru.skillbranch.skillarticles.data.local.dao.ArticleCountsDao;
import ru.skillbranch.skillarticles.data.local.dao.ArticleCountsDao_Impl;
import ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao;
import ru.skillbranch.skillarticles.data.local.dao.ArticlePersonalInfosDao_Impl;
import ru.skillbranch.skillarticles.data.local.dao.ArticlesDao;
import ru.skillbranch.skillarticles.data.local.dao.ArticlesDao_Impl;
import ru.skillbranch.skillarticles.data.local.dao.CategoriesDao;
import ru.skillbranch.skillarticles.data.local.dao.CategoriesDao_Impl;
import ru.skillbranch.skillarticles.data.local.dao.TagsDao;
import ru.skillbranch.skillarticles.data.local.dao.TagsDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDb_Impl extends AppDb {
  private volatile ArticlesDao _articlesDao;

  private volatile ArticleCountsDao _articleCountsDao;

  private volatile CategoriesDao _categoriesDao;

  private volatile ArticlePersonalInfosDao _articlePersonalInfosDao;

  private volatile TagsDao _tagsDao;

  private volatile ArticleContentsDao _articleContentsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `articles` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `category_id` TEXT NOT NULL, `poster` TEXT NOT NULL, `date` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `author_user_id` TEXT NOT NULL, `author_avatar` TEXT, `author_name` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `article_counts` (`article_id` TEXT NOT NULL, `likes` INTEGER NOT NULL, `comments` INTEGER NOT NULL, `read_duration` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`article_id`), FOREIGN KEY(`article_id`) REFERENCES `articles`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `article_categories` (`category_id` TEXT NOT NULL, `icon` TEXT NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`category_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `article_personal_infos` (`article_id` TEXT NOT NULL, `is_like` INTEGER NOT NULL, `is_bookmark` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`article_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `article_tags` (`tag` TEXT NOT NULL, `use_count` INTEGER NOT NULL, PRIMARY KEY(`tag`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `article_tag_x_ref` (`a_id` TEXT NOT NULL, `t_id` TEXT NOT NULL, PRIMARY KEY(`t_id`, `a_id`), FOREIGN KEY(`a_id`) REFERENCES `articles`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `article_contents` (`article_id` TEXT NOT NULL, `content` TEXT NOT NULL, `source` TEXT, `share_link` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`article_id`), FOREIGN KEY(`article_id`) REFERENCES `articles`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE VIEW `ArticleItem` AS SELECT id, date, author_name AS author, author_avatar, article.title AS title, description, poster, article.category_id AS category_id,\n"
                + "        counts.likes AS like_count, counts.comments AS comment_count, counts.read_duration AS read_duration,\n"
                + "        category.title AS category, category.icon AS category_icon,\n"
                + "        personal.is_bookmark AS is_bookmark\n"
                + "        FROM articles AS article\n"
                + "        INNER JOIN article_counts AS counts ON counts.article_id = id\n"
                + "        INNER JOIN article_categories AS category ON category.category_id = article.category_id\n"
                + "        LEFT JOIN article_personal_infos AS personal ON personal.article_id = id");
        _db.execSQL("CREATE VIEW `ArticleFull` AS SELECT id, article.title AS title, description, author_user_id, author_avatar, author_name, date, \n"
                + "        category.category_id AS category_category_id, category.title AS category_title, category.icon AS category_icon,\n"
                + "        content.share_link AS share_link, content.content AS content,\n"
                + "        personal.is_bookmark AS is_bookmark, personal.is_like AS is_like, GROUP_CONCAT(refs.t_id) as tags, source\n"
                + "        FROM articles AS article\n"
                + "        LEFT JOIN article_personal_infos AS personal ON personal.article_id = id\n"
                + "        LEFT JOIN article_contents AS content ON content.article_id =id\n"
                + "        LEFT JOIN article_categories AS category ON category.category_id =article.category_id\n"
                + "        LEFT JOIN article_tag_x_ref AS refs ON id = refs.a_id \n"
                + "        GROUP BY id");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c3529f5bcbebbc57cfd394fcd8340324')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `articles`");
        _db.execSQL("DROP TABLE IF EXISTS `article_counts`");
        _db.execSQL("DROP TABLE IF EXISTS `article_categories`");
        _db.execSQL("DROP TABLE IF EXISTS `article_personal_infos`");
        _db.execSQL("DROP TABLE IF EXISTS `article_tags`");
        _db.execSQL("DROP TABLE IF EXISTS `article_tag_x_ref`");
        _db.execSQL("DROP TABLE IF EXISTS `article_contents`");
        _db.execSQL("DROP VIEW IF EXISTS `ArticleItem`");
        _db.execSQL("DROP VIEW IF EXISTS `ArticleFull`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsArticles = new HashMap<String, TableInfo.Column>(10);
        _columnsArticles.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticles.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticles.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticles.put("category_id", new TableInfo.Column("category_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticles.put("poster", new TableInfo.Column("poster", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticles.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticles.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticles.put("author_user_id", new TableInfo.Column("author_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticles.put("author_avatar", new TableInfo.Column("author_avatar", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticles.put("author_name", new TableInfo.Column("author_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArticles = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesArticles = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArticles = new TableInfo("articles", _columnsArticles, _foreignKeysArticles, _indicesArticles);
        final TableInfo _existingArticles = TableInfo.read(_db, "articles");
        if (! _infoArticles.equals(_existingArticles)) {
          return new RoomOpenHelper.ValidationResult(false, "articles(ru.skillbranch.skillarticles.data.local.entities.Article).\n"
                  + " Expected:\n" + _infoArticles + "\n"
                  + " Found:\n" + _existingArticles);
        }
        final HashMap<String, TableInfo.Column> _columnsArticleCounts = new HashMap<String, TableInfo.Column>(5);
        _columnsArticleCounts.put("article_id", new TableInfo.Column("article_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleCounts.put("likes", new TableInfo.Column("likes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleCounts.put("comments", new TableInfo.Column("comments", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleCounts.put("read_duration", new TableInfo.Column("read_duration", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleCounts.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArticleCounts = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysArticleCounts.add(new TableInfo.ForeignKey("articles", "CASCADE", "NO ACTION",Arrays.asList("article_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesArticleCounts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArticleCounts = new TableInfo("article_counts", _columnsArticleCounts, _foreignKeysArticleCounts, _indicesArticleCounts);
        final TableInfo _existingArticleCounts = TableInfo.read(_db, "article_counts");
        if (! _infoArticleCounts.equals(_existingArticleCounts)) {
          return new RoomOpenHelper.ValidationResult(false, "article_counts(ru.skillbranch.skillarticles.data.local.entities.ArticleCounts).\n"
                  + " Expected:\n" + _infoArticleCounts + "\n"
                  + " Found:\n" + _existingArticleCounts);
        }
        final HashMap<String, TableInfo.Column> _columnsArticleCategories = new HashMap<String, TableInfo.Column>(3);
        _columnsArticleCategories.put("category_id", new TableInfo.Column("category_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleCategories.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleCategories.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArticleCategories = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesArticleCategories = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArticleCategories = new TableInfo("article_categories", _columnsArticleCategories, _foreignKeysArticleCategories, _indicesArticleCategories);
        final TableInfo _existingArticleCategories = TableInfo.read(_db, "article_categories");
        if (! _infoArticleCategories.equals(_existingArticleCategories)) {
          return new RoomOpenHelper.ValidationResult(false, "article_categories(ru.skillbranch.skillarticles.data.local.entities.Category).\n"
                  + " Expected:\n" + _infoArticleCategories + "\n"
                  + " Found:\n" + _existingArticleCategories);
        }
        final HashMap<String, TableInfo.Column> _columnsArticlePersonalInfos = new HashMap<String, TableInfo.Column>(4);
        _columnsArticlePersonalInfos.put("article_id", new TableInfo.Column("article_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticlePersonalInfos.put("is_like", new TableInfo.Column("is_like", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticlePersonalInfos.put("is_bookmark", new TableInfo.Column("is_bookmark", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticlePersonalInfos.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArticlePersonalInfos = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesArticlePersonalInfos = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArticlePersonalInfos = new TableInfo("article_personal_infos", _columnsArticlePersonalInfos, _foreignKeysArticlePersonalInfos, _indicesArticlePersonalInfos);
        final TableInfo _existingArticlePersonalInfos = TableInfo.read(_db, "article_personal_infos");
        if (! _infoArticlePersonalInfos.equals(_existingArticlePersonalInfos)) {
          return new RoomOpenHelper.ValidationResult(false, "article_personal_infos(ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo).\n"
                  + " Expected:\n" + _infoArticlePersonalInfos + "\n"
                  + " Found:\n" + _existingArticlePersonalInfos);
        }
        final HashMap<String, TableInfo.Column> _columnsArticleTags = new HashMap<String, TableInfo.Column>(2);
        _columnsArticleTags.put("tag", new TableInfo.Column("tag", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleTags.put("use_count", new TableInfo.Column("use_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArticleTags = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesArticleTags = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArticleTags = new TableInfo("article_tags", _columnsArticleTags, _foreignKeysArticleTags, _indicesArticleTags);
        final TableInfo _existingArticleTags = TableInfo.read(_db, "article_tags");
        if (! _infoArticleTags.equals(_existingArticleTags)) {
          return new RoomOpenHelper.ValidationResult(false, "article_tags(ru.skillbranch.skillarticles.data.local.entities.Tag).\n"
                  + " Expected:\n" + _infoArticleTags + "\n"
                  + " Found:\n" + _existingArticleTags);
        }
        final HashMap<String, TableInfo.Column> _columnsArticleTagXRef = new HashMap<String, TableInfo.Column>(2);
        _columnsArticleTagXRef.put("a_id", new TableInfo.Column("a_id", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleTagXRef.put("t_id", new TableInfo.Column("t_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArticleTagXRef = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysArticleTagXRef.add(new TableInfo.ForeignKey("articles", "CASCADE", "NO ACTION",Arrays.asList("a_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesArticleTagXRef = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArticleTagXRef = new TableInfo("article_tag_x_ref", _columnsArticleTagXRef, _foreignKeysArticleTagXRef, _indicesArticleTagXRef);
        final TableInfo _existingArticleTagXRef = TableInfo.read(_db, "article_tag_x_ref");
        if (! _infoArticleTagXRef.equals(_existingArticleTagXRef)) {
          return new RoomOpenHelper.ValidationResult(false, "article_tag_x_ref(ru.skillbranch.skillarticles.data.local.entities.ArticleTagXRef).\n"
                  + " Expected:\n" + _infoArticleTagXRef + "\n"
                  + " Found:\n" + _existingArticleTagXRef);
        }
        final HashMap<String, TableInfo.Column> _columnsArticleContents = new HashMap<String, TableInfo.Column>(5);
        _columnsArticleContents.put("article_id", new TableInfo.Column("article_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleContents.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleContents.put("source", new TableInfo.Column("source", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleContents.put("share_link", new TableInfo.Column("share_link", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticleContents.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArticleContents = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysArticleContents.add(new TableInfo.ForeignKey("articles", "CASCADE", "NO ACTION",Arrays.asList("article_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesArticleContents = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArticleContents = new TableInfo("article_contents", _columnsArticleContents, _foreignKeysArticleContents, _indicesArticleContents);
        final TableInfo _existingArticleContents = TableInfo.read(_db, "article_contents");
        if (! _infoArticleContents.equals(_existingArticleContents)) {
          return new RoomOpenHelper.ValidationResult(false, "article_contents(ru.skillbranch.skillarticles.data.local.entities.ArticleContent).\n"
                  + " Expected:\n" + _infoArticleContents + "\n"
                  + " Found:\n" + _existingArticleContents);
        }
        final ViewInfo _infoArticleItem = new ViewInfo("ArticleItem", "CREATE VIEW `ArticleItem` AS SELECT id, date, author_name AS author, author_avatar, article.title AS title, description, poster, article.category_id AS category_id,\n"
                + "        counts.likes AS like_count, counts.comments AS comment_count, counts.read_duration AS read_duration,\n"
                + "        category.title AS category, category.icon AS category_icon,\n"
                + "        personal.is_bookmark AS is_bookmark\n"
                + "        FROM articles AS article\n"
                + "        INNER JOIN article_counts AS counts ON counts.article_id = id\n"
                + "        INNER JOIN article_categories AS category ON category.category_id = article.category_id\n"
                + "        LEFT JOIN article_personal_infos AS personal ON personal.article_id = id");
        final ViewInfo _existingArticleItem = ViewInfo.read(_db, "ArticleItem");
        if (! _infoArticleItem.equals(_existingArticleItem)) {
          return new RoomOpenHelper.ValidationResult(false, "ArticleItem(ru.skillbranch.skillarticles.data.local.entities.ArticleItem).\n"
                  + " Expected:\n" + _infoArticleItem + "\n"
                  + " Found:\n" + _existingArticleItem);
        }
        final ViewInfo _infoArticleFull = new ViewInfo("ArticleFull", "CREATE VIEW `ArticleFull` AS SELECT id, article.title AS title, description, author_user_id, author_avatar, author_name, date, \n"
                + "        category.category_id AS category_category_id, category.title AS category_title, category.icon AS category_icon,\n"
                + "        content.share_link AS share_link, content.content AS content,\n"
                + "        personal.is_bookmark AS is_bookmark, personal.is_like AS is_like, GROUP_CONCAT(refs.t_id) as tags, source\n"
                + "        FROM articles AS article\n"
                + "        LEFT JOIN article_personal_infos AS personal ON personal.article_id = id\n"
                + "        LEFT JOIN article_contents AS content ON content.article_id =id\n"
                + "        LEFT JOIN article_categories AS category ON category.category_id =article.category_id\n"
                + "        LEFT JOIN article_tag_x_ref AS refs ON id = refs.a_id \n"
                + "        GROUP BY id");
        final ViewInfo _existingArticleFull = ViewInfo.read(_db, "ArticleFull");
        if (! _infoArticleFull.equals(_existingArticleFull)) {
          return new RoomOpenHelper.ValidationResult(false, "ArticleFull(ru.skillbranch.skillarticles.data.local.entities.ArticleFull).\n"
                  + " Expected:\n" + _infoArticleFull + "\n"
                  + " Found:\n" + _existingArticleFull);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c3529f5bcbebbc57cfd394fcd8340324", "06ee3ec5223928b6cf06c2ec89ef7d05");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(2);
    HashSet<String> _tables = new HashSet<String>(4);
    _tables.add("articles");
    _tables.add("article_counts");
    _tables.add("article_categories");
    _tables.add("article_personal_infos");
    _viewTables.put("articleitem", _tables);
    HashSet<String> _tables_1 = new HashSet<String>(5);
    _tables_1.add("articles");
    _tables_1.add("article_personal_infos");
    _tables_1.add("article_contents");
    _tables_1.add("article_categories");
    _tables_1.add("article_tag_x_ref");
    _viewTables.put("articlefull", _tables_1);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "articles","article_counts","article_categories","article_personal_infos","article_tags","article_tag_x_ref","article_contents");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `articles`");
      _db.execSQL("DELETE FROM `article_counts`");
      _db.execSQL("DELETE FROM `article_categories`");
      _db.execSQL("DELETE FROM `article_personal_infos`");
      _db.execSQL("DELETE FROM `article_tags`");
      _db.execSQL("DELETE FROM `article_tag_x_ref`");
      _db.execSQL("DELETE FROM `article_contents`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ArticlesDao articlesDao() {
    if (_articlesDao != null) {
      return _articlesDao;
    } else {
      synchronized(this) {
        if(_articlesDao == null) {
          _articlesDao = new ArticlesDao_Impl(this);
        }
        return _articlesDao;
      }
    }
  }

  @Override
  public ArticleCountsDao articleCountsDao() {
    if (_articleCountsDao != null) {
      return _articleCountsDao;
    } else {
      synchronized(this) {
        if(_articleCountsDao == null) {
          _articleCountsDao = new ArticleCountsDao_Impl(this);
        }
        return _articleCountsDao;
      }
    }
  }

  @Override
  public CategoriesDao categoriesDao() {
    if (_categoriesDao != null) {
      return _categoriesDao;
    } else {
      synchronized(this) {
        if(_categoriesDao == null) {
          _categoriesDao = new CategoriesDao_Impl(this);
        }
        return _categoriesDao;
      }
    }
  }

  @Override
  public ArticlePersonalInfosDao articlePersonalInfosDao() {
    if (_articlePersonalInfosDao != null) {
      return _articlePersonalInfosDao;
    } else {
      synchronized(this) {
        if(_articlePersonalInfosDao == null) {
          _articlePersonalInfosDao = new ArticlePersonalInfosDao_Impl(this);
        }
        return _articlePersonalInfosDao;
      }
    }
  }

  @Override
  public TagsDao tagsDao() {
    if (_tagsDao != null) {
      return _tagsDao;
    } else {
      synchronized(this) {
        if(_tagsDao == null) {
          _tagsDao = new TagsDao_Impl(this);
        }
        return _tagsDao;
      }
    }
  }

  @Override
  public ArticleContentsDao articleContentsDao() {
    if (_articleContentsDao != null) {
      return _articleContentsDao;
    } else {
      synchronized(this) {
        if(_articleContentsDao == null) {
          _articleContentsDao = new ArticleContentsDao_Impl(this);
        }
        return _articleContentsDao;
      }
    }
  }
}
