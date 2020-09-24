package ru.skillbranch.skillarticles.data.local.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.skillbranch.skillarticles.data.local.DateConverter;
import ru.skillbranch.skillarticles.data.local.entities.ArticlePersonalInfo;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ArticlePersonalInfosDao_Impl implements ArticlePersonalInfosDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ArticlePersonalInfo> __insertionAdapterOfArticlePersonalInfo;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityDeletionOrUpdateAdapter<ArticlePersonalInfo> __deletionAdapterOfArticlePersonalInfo;

  private final EntityDeletionOrUpdateAdapter<ArticlePersonalInfo> __updateAdapterOfArticlePersonalInfo;

  private final SharedSQLiteStatement __preparedStmtOfToggleLike;

  private final SharedSQLiteStatement __preparedStmtOfToggleBookmark;

  public ArticlePersonalInfosDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArticlePersonalInfo = new EntityInsertionAdapter<ArticlePersonalInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `article_personal_infos` (`article_id`,`is_like`,`is_bookmark`,`updated_at`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticlePersonalInfo value) {
        if (value.getArticleId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getArticleId());
        }
        final int _tmp;
        _tmp = value.isLike() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isBookmark() ? 1 : 0;
        stmt.bindLong(3, _tmp_1);
        final long _tmp_2;
        _tmp_2 = __dateConverter.dateToTimestamp(value.getUpdatedAt());
        stmt.bindLong(4, _tmp_2);
      }
    };
    this.__deletionAdapterOfArticlePersonalInfo = new EntityDeletionOrUpdateAdapter<ArticlePersonalInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `article_personal_infos` WHERE `article_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticlePersonalInfo value) {
        if (value.getArticleId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getArticleId());
        }
      }
    };
    this.__updateAdapterOfArticlePersonalInfo = new EntityDeletionOrUpdateAdapter<ArticlePersonalInfo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `article_personal_infos` SET `article_id` = ?,`is_like` = ?,`is_bookmark` = ?,`updated_at` = ? WHERE `article_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticlePersonalInfo value) {
        if (value.getArticleId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getArticleId());
        }
        final int _tmp;
        _tmp = value.isLike() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isBookmark() ? 1 : 0;
        stmt.bindLong(3, _tmp_1);
        final long _tmp_2;
        _tmp_2 = __dateConverter.dateToTimestamp(value.getUpdatedAt());
        stmt.bindLong(4, _tmp_2);
        if (value.getArticleId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getArticleId());
        }
      }
    };
    this.__preparedStmtOfToggleLike = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE article_personal_infos SET is_like = NOT is_like, updated_at = CURRENT_TIMESTAMP\n"
                + "        WHERE article_id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfToggleBookmark = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE article_personal_infos SET is_bookmark = NOT is_bookmark, updated_at = CURRENT_TIMESTAMP\n"
                + "        WHERE article_id = ?\n"
                + "    ";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final List<? extends ArticlePersonalInfo> list,
      final Continuation<? super List<Long>> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          List<Long> _result = __insertionAdapterOfArticlePersonalInfo.insertAndReturnIdsList(list);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final ArticlePersonalInfo obj, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfArticlePersonalInfo.insertAndReturnId(obj);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final ArticlePersonalInfo obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfArticlePersonalInfo.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final List<? extends ArticlePersonalInfo> list,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfArticlePersonalInfo.handleMultiple(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final ArticlePersonalInfo obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfArticlePersonalInfo.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object upsert(final List<ArticlePersonalInfo> list, final Continuation<? super Unit> p1) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Unit>, Object>() {
      @Override
      public Object invoke(Continuation<? super Unit> __cont) {
        return ArticlePersonalInfosDao.DefaultImpls.upsert(ArticlePersonalInfosDao_Impl.this, list, __cont);
      }
    }, p1);
  }

  @Override
  public Object toggleBookmarkOrInsert(final String articleId,
      final Continuation<? super Boolean> p1) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Boolean>, Object>() {
      @Override
      public Object invoke(Continuation<? super Boolean> __cont) {
        return ArticlePersonalInfosDao.DefaultImpls.toggleBookmarkOrInsert(ArticlePersonalInfosDao_Impl.this, articleId, __cont);
      }
    }, p1);
  }

  @Override
  public Object toggleLikeOrInsert(final String articleId, final Continuation<? super Boolean> p1) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Boolean>, Object>() {
      @Override
      public Object invoke(Continuation<? super Boolean> __cont) {
        return ArticlePersonalInfosDao.DefaultImpls.toggleLikeOrInsert(ArticlePersonalInfosDao_Impl.this, articleId, __cont);
      }
    }, p1);
  }

  @Override
  public Object toggleLike(final String articleId, final Continuation<? super Integer> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfToggleLike.acquire();
        int _argIndex = 1;
        if (articleId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, articleId);
        }
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfToggleLike.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object toggleBookmark(final String articleId, final Continuation<? super Integer> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfToggleBookmark.acquire();
        int _argIndex = 1;
        if (articleId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, articleId);
        }
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfToggleBookmark.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object isBookmarked(final String articleId, final Continuation<? super Boolean> p1) {
    final String _sql = "\n"
            + "        SELECT is_bookmark FROM article_personal_infos\n"
            + "        WHERE article_id = ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (articleId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, articleId);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object isLiked(final String articleId, final Continuation<? super Boolean> p1) {
    final String _sql = "\n"
            + "        SELECT is_like FROM article_personal_infos\n"
            + "        WHERE article_id = ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (articleId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, articleId);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<ArticlePersonalInfo>> findPersonalInfos() {
    final String _sql = "\n"
            + "        SELECT * FROM article_personal_infos\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"article_personal_infos"}, false, new Callable<List<ArticlePersonalInfo>>() {
      @Override
      public List<ArticlePersonalInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArticleId = CursorUtil.getColumnIndexOrThrow(_cursor, "article_id");
          final int _cursorIndexOfIsLike = CursorUtil.getColumnIndexOrThrow(_cursor, "is_like");
          final int _cursorIndexOfIsBookmark = CursorUtil.getColumnIndexOrThrow(_cursor, "is_bookmark");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<ArticlePersonalInfo> _result = new ArrayList<ArticlePersonalInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ArticlePersonalInfo _item;
            final String _tmpArticleId;
            _tmpArticleId = _cursor.getString(_cursorIndexOfArticleId);
            final boolean _tmpIsLike;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsLike);
            _tmpIsLike = _tmp != 0;
            final boolean _tmpIsBookmark;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsBookmark);
            _tmpIsBookmark = _tmp_1 != 0;
            final Date _tmpUpdatedAt;
            final long _tmp_2;
            _tmp_2 = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _tmpUpdatedAt = __dateConverter.timestampToDate(_tmp_2);
            _item = new ArticlePersonalInfo(_tmpArticleId,_tmpIsLike,_tmpIsBookmark,_tmpUpdatedAt);
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

  @Override
  public LiveData<ArticlePersonalInfo> findPersonalInfos(final String articleId) {
    final String _sql = "\n"
            + "        SELECT * FROM article_personal_infos\n"
            + "        WHERE article_id = ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (articleId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, articleId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"article_personal_infos"}, false, new Callable<ArticlePersonalInfo>() {
      @Override
      public ArticlePersonalInfo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArticleId = CursorUtil.getColumnIndexOrThrow(_cursor, "article_id");
          final int _cursorIndexOfIsLike = CursorUtil.getColumnIndexOrThrow(_cursor, "is_like");
          final int _cursorIndexOfIsBookmark = CursorUtil.getColumnIndexOrThrow(_cursor, "is_bookmark");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final ArticlePersonalInfo _result;
          if(_cursor.moveToFirst()) {
            final String _tmpArticleId;
            _tmpArticleId = _cursor.getString(_cursorIndexOfArticleId);
            final boolean _tmpIsLike;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsLike);
            _tmpIsLike = _tmp != 0;
            final boolean _tmpIsBookmark;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsBookmark);
            _tmpIsBookmark = _tmp_1 != 0;
            final Date _tmpUpdatedAt;
            final long _tmp_2;
            _tmp_2 = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _tmpUpdatedAt = __dateConverter.timestampToDate(_tmp_2);
            _result = new ArticlePersonalInfo(_tmpArticleId,_tmpIsLike,_tmpIsBookmark,_tmpUpdatedAt);
          } else {
            _result = null;
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

  @Override
  public Object findPersonalInfosTest(final String articleId,
      final Continuation<? super ArticlePersonalInfo> p1) {
    final String _sql = "\n"
            + "        SELECT * FROM article_personal_infos\n"
            + "        WHERE article_id = ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (articleId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, articleId);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<ArticlePersonalInfo>() {
      @Override
      public ArticlePersonalInfo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArticleId = CursorUtil.getColumnIndexOrThrow(_cursor, "article_id");
          final int _cursorIndexOfIsLike = CursorUtil.getColumnIndexOrThrow(_cursor, "is_like");
          final int _cursorIndexOfIsBookmark = CursorUtil.getColumnIndexOrThrow(_cursor, "is_bookmark");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final ArticlePersonalInfo _result;
          if(_cursor.moveToFirst()) {
            final String _tmpArticleId;
            _tmpArticleId = _cursor.getString(_cursorIndexOfArticleId);
            final boolean _tmpIsLike;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsLike);
            _tmpIsLike = _tmp != 0;
            final boolean _tmpIsBookmark;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsBookmark);
            _tmpIsBookmark = _tmp_1 != 0;
            final Date _tmpUpdatedAt;
            final long _tmp_2;
            _tmp_2 = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _tmpUpdatedAt = __dateConverter.timestampToDate(_tmp_2);
            _result = new ArticlePersonalInfo(_tmpArticleId,_tmpIsLike,_tmpIsBookmark,_tmpUpdatedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
