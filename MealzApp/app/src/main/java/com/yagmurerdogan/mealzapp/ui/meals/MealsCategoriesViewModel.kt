package com.yagmurerdogan.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.yagmurerdogan.mealzapp.model.MealsRepository

class MealsCategoriesViewModel(

    private val repository: MealsRepository = MealsRepository()

) : ViewModel() {
}