package com.example.homehues.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homehues.R
import com.example.homehues.model.Product

@Preview(showBackground = true)
@Composable
fun ProductItem(
    product: Product = Product(
        id = "1",
        name = "sample1",
        color = Color.Magenta,
        price = 1200f,
        discountPrice = 1000f,
        rating = 4.7f,
        imageRes = R.drawable.sample1
    )
) {

    var color by remember {
        mutableStateOf(product.color)
    }
    var isFavorite by remember {
        mutableStateOf(false)
    }


    Box(
        modifier = Modifier
            .padding(20.dp)
            .size(168.dp, 210.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .alpha(.2f)
                .background(color = color, shape = RoundedCornerShape(22.dp))
        )

        IconButton(
            onClick = {
                isFavorite = !isFavorite
            },
            modifier = Modifier.align(Alignment.TopStart)
        ) {
            Icon(
                imageVector =
                if (isFavorite)
                    Icons.Rounded.Favorite
                else
                    Icons.Rounded.FavoriteBorder,
                contentDescription = null
            )
        }

        Image(
            painter = painterResource(id = product.imageRes), contentDescription = null,

            modifier = Modifier
                .fillMaxSize(0.8f)
                .align(Alignment.Center)
        )

        Column(
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            Text(
                text = "Rs. ${product.discountPrice}",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(
                text = "Rs. ${product.price}",
                fontSize = 12.sp,
                modifier = Modifier.padding(end = 8.dp)
            )
        }


    }
}