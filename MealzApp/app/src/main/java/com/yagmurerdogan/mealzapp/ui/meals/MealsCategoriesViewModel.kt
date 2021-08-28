package com.yagmurerdogan.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.yagmurerdogan.mealzapp.model.MealsRepository
import com.yagmurerdogan.mealzapp.model.response.MealResponse
import com.yagmurerdogan.mealzapp.model.response.MealsCategoriesResponse

class MealsCategoriesViewModel(

    private val repository: MealsRepository = MealsRepository()

) : ViewModel() {

    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        repository.getMeals() { response ->
            successCallback(response)
        }
    }
}