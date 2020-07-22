package ru.skillbranch.skillarticles.ui.articles

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Boolean
import kotlin.jvm.JvmStatic

data class ArticlesFragmentArgs(
  val isBookmarks: Boolean = true
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("isBookmarks", this.isBookmarks)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ArticlesFragmentArgs {
      bundle.setClassLoader(ArticlesFragmentArgs::class.java.classLoader)
      val __isBookmarks : Boolean
      if (bundle.containsKey("isBookmarks")) {
        __isBookmarks = bundle.getBoolean("isBookmarks")
      } else {
        __isBookmarks = true
      }
      return ArticlesFragmentArgs(__isBookmarks)
    }
  }
}
