package com.example.homehues.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Product(
    var id : String,
    var name : String,
    var color: Color,
    var price : Float,
    var discountPrice : Float,
    var rating : Float,
    @DrawableRes val imageRes : Int
)
