package ru.skillbranch.skillarticles.data.local.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
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
import ru.skillbranch.skillarticles.data.local.entities.ArticleTagXRef;
import ru.skillbranch.skillarticles.data.local.entities.Tag;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TagsDao_Impl implements TagsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Tag> __insertionAdapterOfTag;

  private final EntityInsertionAdapter<ArticleTagXRef> __insertionAdapterOfArticleTagXRef;

  private final EntityDeletionOrUpdateAdapter<Tag> __deletionAdapterOfTag;

  private final EntityDeletionOrUpdateAdapter<Tag> __updateAdapterOfTag;

  private final SharedSQLiteStatement __preparedStmtOfIncrementTagUseCount;

  public TagsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTag = new EntityInsertionAdapter<Tag>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `article_tags` (`tag`,`use_count`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Tag value) {
        if (value.getTag() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTag());
        }
        stmt.bindLong(2, value.getUseCount());
      }
    };
    this.__insertionAdapterOfArticleTagXRef = new EntityInsertionAdapter<ArticleTagXRef>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `article_tag_x_ref` (`a_id`,`t_id`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticleTagXRef value) {
        if (value.getArticleId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getArticleId());
        }
        if (value.getTagId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTagId());
        }
      }
    };
    this.__deletionAdapterOfTag = new EntityDeletionOrUpdateAdapter<Tag>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `article_tags` WHERE `tag` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Tag value) {
        if (value.getTag() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTag());
        }
      }
    };
    this.__updateAdapterOfTag = new EntityDeletionOrUpdateAdapter<Tag>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `article_tags` SET `tag` = ?,`use_count` = ? WHERE `tag` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Tag value) {
        if (value.getTag() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTag());
        }
        stmt.bindLong(2, value.getUseCount());
        if (value.getTag() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTag());
        }
      }
    };
    this.__preparedStmtOfIncrementTagUseCount = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE article_tags SET use_count = use_count+1\n"
                + "        WHERE tag = ?\n"
                + "    ";
        return _query;
      }
    };
  }

  @Override
  public List<Long> insert(final List<? extends Tag> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfTag.insertAndReturnIdsList(list);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(final Tag obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTag.insertAndReturnId(obj);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertRefs(final List<ArticleTagXRef> refs) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfArticleTagXRef.insertAndReturnIdsList(refs);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Tag obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTag.handle(obj);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final List<? extends Tag> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTag.handleMultiple(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Tag obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTag.handle(obj);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void incrementTagUseCount(final String tag) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfIncrementTagUseCount.acquire();
    int _argIndex = 1;
    if (tag == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, tag);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfIncrementTagUseCount.release(_stmt);
    }
  }

  @Override
  public LiveData<List<String>> findTags() {
    final String _sql = "\n"
            + "        SELECT tag FROM article_tags\n"
            + "        ORDER BY use_count DESC\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"article_tags"}, false, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
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
