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
import ru.skillbranch.skillarticles.data.local.entities.ArticleCounts;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ArticleCountsDao_Impl implements ArticleCountsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ArticleCounts> __insertionAdapterOfArticleCounts;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityDeletionOrUpdateAdapter<ArticleCounts> __deletionAdapterOfArticleCounts;

  private final EntityDeletionOrUpdateAdapter<ArticleCounts> __updateAdapterOfArticleCounts;

  private final SharedSQLiteStatement __preparedStmtOfIncrementLike;

  private final SharedSQLiteStatement __preparedStmtOfDecrementLike;

  private final SharedSQLiteStatement __preparedStmtOfIncrementCommentsCount;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCommentsCount;

  private final SharedSQLiteStatement __preparedStmtOfUpdateLike;

  public ArticleCountsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArticleCounts = new EntityInsertionAdapter<ArticleCounts>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `article_counts` (`article_id`,`likes`,`comments`,`read_duration`,`updated_at`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticleCounts value) {
        if (value.getArticleId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getArticleId());
        }
        stmt.bindLong(2, value.getLikes());
        stmt.bindLong(3, value.getComments());
        stmt.bindLong(4, value.getReadDuration());
        final long _tmp;
        _tmp = __dateConverter.dateToTimestamp(value.getUpdatedAt());
        stmt.bindLong(5, _tmp);
      }
    };
    this.__deletionAdapterOfArticleCounts = new EntityDeletionOrUpdateAdapter<ArticleCounts>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `article_counts` WHERE `article_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticleCounts value) {
        if (value.getArticleId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getArticleId());
        }
      }
    };
    this.__updateAdapterOfArticleCounts = new EntityDeletionOrUpdateAdapter<ArticleCounts>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `article_counts` SET `article_id` = ?,`likes` = ?,`comments` = ?,`read_duration` = ?,`updated_at` = ? WHERE `article_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticleCounts value) {
        if (value.getArticleId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getArticleId());
        }
        stmt.bindLong(2, value.getLikes());
        stmt.bindLong(3, value.getComments());
        stmt.bindLong(4, value.getReadDuration());
        final long _tmp;
        _tmp = __dateConverter.dateToTimestamp(value.getUpdatedAt());
        stmt.bindLong(5, _tmp);
        if (value.getArticleId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getArticleId());
        }
      }
    };
    this.__preparedStmtOfIncrementLike = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE article_counts SET likes = likes+1, updated_at = CURRENT_TIMESTAMP\n"
                + "        WHERE article_id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfDecrementLike = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE article_counts SET likes = MAX(0, likes-1), updated_at = CURRENT_TIMESTAMP\n"
                + "        WHERE article_id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfIncrementCommentsCount = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE article_counts SET comments = comments+1, updated_at = CURRENT_TIMESTAMP\n"
                + "        WHERE article_id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCommentsCount = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE article_counts SET comments = ?\n"
                + "        WHERE article_id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateLike = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE article_counts SET likes = ?\n"
                + "        WHERE article_id = ?\n"
                + "    ";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final List<? extends ArticleCounts> list,
      final Continuation<? super List<Long>> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          List<Long> _result = __insertionAdapterOfArticleCounts.insertAndReturnIdsList(list);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final ArticleCounts obj, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfArticleCounts.insertAndReturnId(obj);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final ArticleCounts obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfArticleCounts.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final List<? extends ArticleCounts> list,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfArticleCounts.handleMultiple(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final ArticleCounts obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfArticleCounts.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object upsert(final List<ArticleCounts> list, final Continuation<? super Unit> p1) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Unit>, Object>() {
      @Override
      public Object invoke(Continuation<? super Unit> __cont) {
        return ArticleCountsDao.DefaultImpls.upsert(ArticleCountsDao_Impl.this, list, __cont);
      }
    }, p1);
  }

  @Override
  public Object incrementLike(final String articleId, final Continuation<? super Integer> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfIncrementLike.acquire();
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
          __preparedStmtOfIncrementLike.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object decrementLike(final String articleId, final Continuation<? super Integer> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDecrementLike.acquire();
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
          __preparedStmtOfDecrementLike.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object incrementCommentsCount(final String articleId,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfIncrementCommentsCount.acquire();
        int _argIndex = 1;
        if (articleId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, articleId);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfIncrementCommentsCount.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object updateCommentsCount(final String articleId, final int comments,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCommentsCount.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, comments);
        _argIndex = 2;
        if (articleId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, articleId);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateCommentsCount.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public Object updateLike(final String articleId, final int likes,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateLike.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, likes);
        _argIndex = 2;
        if (articleId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, articleId);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateLike.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public LiveData<List<ArticleCounts>> findArticleCounts() {
    final String _sql = "\n"
            + "        SELECT * FROM article_counts\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"article_counts"}, false, new Callable<List<ArticleCounts>>() {
      @Override
      public List<ArticleCounts> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArticleId = CursorUtil.getColumnIndexOrThrow(_cursor, "article_id");
          final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "likes");
          final int _cursorIndexOfComments = CursorUtil.getColumnIndexOrThrow(_cursor, "comments");
          final int _cursorIndexOfReadDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "read_duration");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<ArticleCounts> _result = new ArrayList<ArticleCounts>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ArticleCounts _item;
            final String _tmpArticleId;
            _tmpArticleId = _cursor.getString(_cursorIndexOfArticleId);
            final int _tmpLikes;
            _tmpLikes = _cursor.getInt(_cursorIndexOfLikes);
            final int _tmpComments;
            _tmpComments = _cursor.getInt(_cursorIndexOfComments);
            final int _tmpReadDuration;
            _tmpReadDuration = _cursor.getInt(_cursorIndexOfReadDuration);
            final Date _tmpUpdatedAt;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _tmpUpdatedAt = __dateConverter.timestampToDate(_tmp);
            _item = new ArticleCounts(_tmpArticleId,_tmpLikes,_tmpComments,_tmpReadDuration,_tmpUpdatedAt);
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
  public LiveData<ArticleCounts> findArticleCounts(final String articleId) {
    final String _sql = "\n"
            + "        SELECT * FROM article_counts\n"
            + "        WHERE article_id = ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (articleId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, articleId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"article_counts"}, false, new Callable<ArticleCounts>() {
      @Override
      public ArticleCounts call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArticleId = CursorUtil.getColumnIndexOrThrow(_cursor, "article_id");
          final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "likes");
          final int _cursorIndexOfComments = CursorUtil.getColumnIndexOrThrow(_cursor, "comments");
          final int _cursorIndexOfReadDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "read_duration");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final ArticleCounts _result;
          if(_cursor.moveToFirst()) {
            final String _tmpArticleId;
            _tmpArticleId = _cursor.getString(_cursorIndexOfArticleId);
            final int _tmpLikes;
            _tmpLikes = _cursor.getInt(_cursorIndexOfLikes);
            final int _tmpComments;
            _tmpComments = _cursor.getInt(_cursorIndexOfComments);
            final int _tmpReadDuration;
            _tmpReadDuration = _cursor.getInt(_cursorIndexOfReadDuration);
            final Date _tmpUpdatedAt;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _tmpUpdatedAt = __dateConverter.timestampToDate(_tmp);
            _result = new ArticleCounts(_tmpArticleId,_tmpLikes,_tmpComments,_tmpReadDuration,_tmpUpdatedAt);
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
  public Object findArticlesCountsTest(final String articleId,
      final Continuation<? super ArticleCounts> p1) {
    final String _sql = "\n"
            + "        SELECT * FROM article_counts\n"
            + "        WHERE article_id = ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (articleId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, articleId);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<ArticleCounts>() {
      @Override
      public ArticleCounts call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArticleId = CursorUtil.getColumnIndexOrThrow(_cursor, "article_id");
          final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "likes");
          final int _cursorIndexOfComments = CursorUtil.getColumnIndexOrThrow(_cursor, "comments");
          final int _cursorIndexOfReadDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "read_duration");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final ArticleCounts _result;
          if(_cursor.moveToFirst()) {
            final String _tmpArticleId;
            _tmpArticleId = _cursor.getString(_cursorIndexOfArticleId);
            final int _tmpLikes;
            _tmpLikes = _cursor.getInt(_cursorIndexOfLikes);
            final int _tmpComments;
            _tmpComments = _cursor.getInt(_cursorIndexOfComments);
            final int _tmpReadDuration;
            _tmpReadDuration = _cursor.getInt(_cursorIndexOfReadDuration);
            final Date _tmpUpdatedAt;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _tmpUpdatedAt = __dateConverter.timestampToDate(_tmp);
            _result = new ArticleCounts(_tmpArticleId,_tmpLikes,_tmpComments,_tmpReadDuration,_tmpUpdatedAt);
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
  public LiveData<Integer> getCommentsCount(final String articleId) {
    final String _sql = "\n"
            + "        SELECT comments FROM article_counts\n"
            + "        WHERE article_id = ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (articleId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, articleId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"article_counts"}, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getInt(0);
            }
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
}
