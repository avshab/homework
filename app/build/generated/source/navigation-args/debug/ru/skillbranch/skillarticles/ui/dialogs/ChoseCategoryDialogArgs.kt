package ru.skillbranch.skillarticles.ui.dialogs

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import ru.skillbranch.skillarticles.data.local.entities.CategoryData

data class ChoseCategoryDialogArgs(
  val selectedCategories: Array<String>,
  val categories: Array<CategoryData>
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putStringArray("selected_categories", this.selectedCategories)
    result.putParcelableArray("categories", this.categories)
    return result
  }

  companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    fun fromBundle(bundle: Bundle): ChoseCategoryDialogArgs {
      bundle.setClassLoader(ChoseCategoryDialogArgs::class.java.classLoader)
      val __selectedCategories : Array<String>?
      if (bundle.containsKey("selected_categories")) {
        __selectedCategories = bundle.getStringArray("selected_categories")
        if (__selectedCategories == null) {
          throw IllegalArgumentException("Argument \"selected_categories\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"selected_categories\" is missing and does not have an android:defaultValue")
      }
      val __categories : Array<CategoryData>?
      if (bundle.containsKey("categories")) {
        __categories = bundle.getParcelableArray("categories")?.map { it as CategoryData
            }?.toTypedArray()
        if (__categories == null) {
          throw IllegalArgumentException("Argument \"categories\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"categories\" is missing and does not have an android:defaultValue")
      }
      return ChoseCategoryDialogArgs(__selectedCategories, __categories)
    }
  }
}
