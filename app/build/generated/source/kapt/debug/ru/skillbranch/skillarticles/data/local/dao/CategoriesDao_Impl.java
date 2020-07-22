package ru.skillbranch.skillarticles.data.local.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ru.skillbranch.skillarticles.data.local.entities.Category;
import ru.skillbranch.skillarticles.data.local.entities.CategoryData;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CategoriesDao_Impl implements CategoriesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Category> __insertionAdapterOfCategory;

  private final EntityDeletionOrUpdateAdapter<Category> __deletionAdapterOfCategory;

  private final EntityDeletionOrUpdateAdapter<Category> __updateAdapterOfCategory;

  public CategoriesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCategory = new EntityInsertionAdapter<Category>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `article_categories` (`category_id`,`icon`,`title`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Category value) {
        if (value.getCategoryId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCategoryId());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIcon());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
      }
    };
    this.__deletionAdapterOfCategory = new EntityDeletionOrUpdateAdapter<Category>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `article_categories` WHERE `category_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Category value) {
        if (value.getCategoryId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCategoryId());
        }
      }
    };
    this.__updateAdapterOfCategory = new EntityDeletionOrUpdateAdapter<Category>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `article_categories` SET `category_id` = ?,`icon` = ?,`title` = ? WHERE `category_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Category value) {
        if (value.getCategoryId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCategoryId());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIcon());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getCategoryId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCategoryId());
        }
      }
    };
  }

  @Override
  public List<Long> insert(final List<? extends Category> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfCategory.insertAndReturnIdsList(list);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(final Category obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCategory.insertAndReturnId(obj);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Category obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCategory.handle(obj);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final List<? extends Category> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCategory.handleMultiple(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Category obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCategory.handle(obj);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<CategoryData>> findAllCategoriesData() {
    final String _sql = "\n"
            + "        SELECT category.title AS title, category.icon, category.category_id AS category_id, COUNT(article.category_id) AS articles_count\n"
            + "        FROM article_categories AS category\n"
            + "        INNER JOIN articles AS article ON category.category_id = article.category_id\n"
            + "        GROUP BY category.category_id\n"
            + "        ORDER BY articles_count DESC\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"article_categories","articles"}, false, new Callable<List<CategoryData>>() {
      @Override
      public List<CategoryData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final int _cursorIndexOfArticlesCount = CursorUtil.getColumnIndexOrThrow(_cursor, "articles_count");
          final List<CategoryData> _result = new ArrayList<CategoryData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CategoryData _item;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpIcon;
            _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            final String _tmpCategoryId;
            _tmpCategoryId = _cursor.getString(_cursorIndexOfCategoryId);
            final int _tmpArticlesCount;
            _tmpArticlesCount = _cursor.getInt(_cursorIndexOfArticlesCount);
            _item = new CategoryData(_tmpCategoryId,_tmpIcon,_tmpTitle,_tmpArticlesCount);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
