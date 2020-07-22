package ru.skillbranch.skillarticles.ui.articles

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import java.util.Date
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import ru.skillbranch.skillarticles.MobileNavigationDirections
import ru.skillbranch.skillarticles.R
import ru.skillbranch.skillarticles.data.local.entities.CategoryData

class ArticlesFragmentDirections private constructor() {
  private data class ActionToPageArticle(
    val articleId: String = "-1",
    val author: String,
    val authorAvatar: String,
    val category: String,
    val categoryIcon: String,
    val poster: String,
    val title: String,
    val date: Date
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_to_page_article

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("article_id", this.articleId)
      result.putString("author", this.author)
      result.putString("author_avatar", this.authorAvatar)
      result.putString("category", this.category)
      result.putString("category_icon", this.categoryIcon)
      result.putString("poster", this.poster)
      result.putString("title", this.title)
      if (Parcelable::class.java.isAssignableFrom(Date::class.java)) {
        result.putParcelable("date", this.date as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Date::class.java)) {
        result.putSerializable("date", this.date as Serializable)
      } else {
        throw UnsupportedOperationException(Date::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  private data class ChoseCategory(
    val selectedCategories: Array<String>,
    val categories: Array<CategoryData>
  ) : NavDirections {
    override fun getActionId(): Int = R.id.chose_category

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putStringArray("selected_categories", this.selectedCategories)
      result.putParcelableArray("categories", this.categories)
      return result
    }
  }

  companion object {
    fun actionToPageArticle(
      articleId: String = "-1",
      author: String,
      authorAvatar: String,
      category: String,
      categoryIcon: String,
      poster: String,
      title: String,
      date: Date
    ): NavDirections = ActionToPageArticle(articleId, author, authorAvatar, category, categoryIcon,
        poster, title, date)

    fun choseCategory(selectedCategories: Array<String>, categories: Array<CategoryData>):
        NavDirections = ChoseCategory(selectedCategories, categories)

    fun startLogin(): NavDirections = MobileNavigationDirections.startLogin()

    fun finishLogin(): NavDirections = MobileNavigationDirections.finishLogin()
  }
}
