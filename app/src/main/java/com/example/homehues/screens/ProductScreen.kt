package com.example.homehues.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homehues.R
import com.example.homehues.model.Product
import com.example.homehues.screens.components.ProductItem


@Composable
@Preview
fun ProductScreen() {
    var products = remember {
        getProductList()
    }

    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.padding(8.dp)) {
        items(products){
            ProductItem(product = it)
        }
    }
}

fun getProductList() : List<Product>{
    return listOf(
        Product(
            id = "1",
            name = "sample1",
            color = Color.Magenta,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        ),
        Product(
            id = "2",
            name = "sample1",
            color = Color.Blue,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        ),
        Product(
            id = "3",
            name = "sample1",
            color = Color.Green,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        ),
        Product(
            id = "4",
            name = "sample1",
            color = Color.Yellow,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        ),
        Product(
            id = "5",
            name = "sample1",
            color = Color.Red,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        ),
        Product(
            id = "6",
            name = "sample1",
            color = Color.Magenta,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        ),
        Product(
            id = "7",
            name = "sample1",
            color = Color.Blue,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        ),
        Product(
            id = "8",
            name = "sample1",
            color = Color.Yellow,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        ),
        Product(
            id = "9",
            name = "sample1",
            color = Color.Green,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        ),
        Product(
            id = "10",
            name = "sample1",
            color = Color.Magenta,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        ),
        Product(
            id = "11",
            name = "sample1",
            color = Color.Blue,
            price = 1200f,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.sample1
        )
    )
}