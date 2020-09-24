package ru.skillbranch.skillarticles.data.local.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
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
import ru.skillbranch.skillarticles.data.local.DateConverter;
import ru.skillbranch.skillarticles.data.local.entities.ArticleContent;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ArticleContentsDao_Impl implements ArticleContentsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ArticleContent> __insertionAdapterOfArticleContent;

  private final DateConverter __dateConverter = new DateConverter();

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public ArticleContentsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArticleContent = new EntityInsertionAdapter<ArticleContent>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `article_contents` (`article_id`,`content`,`source`,`share_link`,`updated_at`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticleContent value) {
        if (value.getArticleId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getArticleId());
        }
        if (value.getContent() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContent());
        }
        if (value.getSource() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSource());
        }
        if (value.getShareLink() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getShareLink());
        }
        final long _tmp;
        _tmp = __dateConverter.dateToTimestamp(value.getUpdatedAt());
        stmt.bindLong(5, _tmp);
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        DELETE FROM `article_contents` WHERE article_id = ?\n"
                + "    ";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final ArticleContent obj, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfArticleContent.insertAndReturnId(obj);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final String articleId, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
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
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object findArticlesContentsTest(final Continuation<? super List<ArticleContent>> p0) {
    final String _sql = "\n"
            + "        SELECT * FROM article_contents\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<ArticleContent>>() {
      @Override
      public List<ArticleContent> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArticleId = CursorUtil.getColumnIndexOrThrow(_cursor, "article_id");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfShareLink = CursorUtil.getColumnIndexOrThrow(_cursor, "share_link");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<ArticleContent> _result = new ArrayList<ArticleContent>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ArticleContent _item;
            final String _tmpArticleId;
            _tmpArticleId = _cursor.getString(_cursorIndexOfArticleId);
            final String _tmpContent;
            _tmpContent = _cursor.getString(_cursorIndexOfContent);
            final String _tmpSource;
            _tmpSource = _cursor.getString(_cursorIndexOfSource);
            final String _tmpShareLink;
            _tmpShareLink = _cursor.getString(_cursorIndexOfShareLink);
            final Date _tmpUpdatedAt;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _tmpUpdatedAt = __dateConverter.timestampToDate(_tmp);
            _item = new ArticleContent(_tmpArticleId,_tmpContent,_tmpSource,_tmpShareLink,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
