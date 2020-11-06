package ru.skillbranch.skillarticles.ui.article

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import java.util.Date
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class ArticleFragmentArgs(
  val articleId: String,
  val author: String,
  val authorAvatar: String,
  val date: Date,
  val category: String,
  val categoryIcon: String,
  val poster: String,
  val title: String
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("article_id", this.articleId)
    result.putString("author", this.author)
    result.putString("author_avatar", this.authorAvatar)
    if (Parcelable::class.java.isAssignableFrom(Date::class.java)) {
      result.putParcelable("date", this.date as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Date::class.java)) {
      result.putSerializable("date", this.date as Serializable)
    } else {
      throw UnsupportedOperationException(Date::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putString("category", this.category)
    result.putString("category_icon", this.categoryIcon)
    result.putString("poster", this.poster)
    result.putString("title", this.title)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ArticleFragmentArgs {
      bundle.setClassLoader(ArticleFragmentArgs::class.java.classLoader)
      val __articleId : String?
      if (bundle.containsKey("article_id")) {
        __articleId = bundle.getString("article_id")
        if (__articleId == null) {
          throw IllegalArgumentException("Argument \"article_id\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"article_id\" is missing and does not have an android:defaultValue")
      }
      val __author : String?
      if (bundle.containsKey("author")) {
        __author = bundle.getString("author")
        if (__author == null) {
          throw IllegalArgumentException("Argument \"author\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"author\" is missing and does not have an android:defaultValue")
      }
      val __authorAvatar : String?
      if (bundle.containsKey("author_avatar")) {
        __authorAvatar = bundle.getString("author_avatar")
        if (__authorAvatar == null) {
          throw IllegalArgumentException("Argument \"author_avatar\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"author_avatar\" is missing and does not have an android:defaultValue")
      }
      val __date : Date?
      if (bundle.containsKey("date")) {
        if (Parcelable::class.java.isAssignableFrom(Date::class.java) ||
            Serializable::class.java.isAssignableFrom(Date::class.java)) {
          __date = bundle.get("date") as Date?
        } else {
          throw UnsupportedOperationException(Date::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__date == null) {
          throw IllegalArgumentException("Argument \"date\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"date\" is missing and does not have an android:defaultValue")
      }
      val __category : String?
      if (bundle.containsKey("category")) {
        __category = bundle.getString("category")
        if (__category == null) {
          throw IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue")
      }
      val __categoryIcon : String?
      if (bundle.containsKey("category_icon")) {
        __categoryIcon = bundle.getString("category_icon")
        if (__categoryIcon == null) {
          throw IllegalArgumentException("Argument \"category_icon\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"category_icon\" is missing and does not have an android:defaultValue")
      }
      val __poster : String?
      if (bundle.containsKey("poster")) {
        __poster = bundle.getString("poster")
        if (__poster == null) {
          throw IllegalArgumentException("Argument \"poster\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"poster\" is missing and does not have an android:defaultValue")
      }
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      return ArticleFragmentArgs(__articleId, __author, __authorAvatar, __date, __category,
          __categoryIcon, __poster, __title)
    }
  }
}
