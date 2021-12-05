package com.devinidn.recipeapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipes(
    var name: String?,
    var category: String?,
    var description: String?,
    var ingredients: String?,
    var instruction: String?,
    var photo: String?,
    var price: String?,
    var calories: String?,
    var carbo: String?,
    var protein: String?

): Parcelable
