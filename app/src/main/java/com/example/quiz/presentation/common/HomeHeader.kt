package com.example.quiz.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.quiz.R
import com.example.quiz.utils.Dimens

@Preview()
@Composable
fun HomeHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(Dimens.HomeTopBoxHeight)
            .background(
                color = colorResource(R.color.dark_slate_blue),
                shape = RoundedCornerShape(
                    bottomStart = Dimens.ExtraLargeCornerRadius,
                    bottomEnd = Dimens.ExtraLargeCornerRadius,
                ),
            )
    ) {
        // Row (or Column) to make a child
        // composable take up available space proportionally
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = Dimens.LargePadding),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painterResource(id = R.drawable.ic_menu),
                contentDescription = null,
                modifier = Modifier
                    .weight(1f)
                    .size(Dimens.MediumIconSize),
                tint = colorResource(id = R.color.blue_gray)
            )

            Text(
                text = "Quiz App",
                color = colorResource(R.color.blue_gray),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.weight(3.5f),
                textAlign = TextAlign.Center,
                fontSize = Dimens.LargeTextSize,
            )

            Icon(
                painterResource(id = R.drawable.ic_account),
                contentDescription = null,
                modifier = Modifier
                    .weight(1f)
                    .size(Dimens.MediumIconSize),
                tint = colorResource(id = R.color.blue_gray)
            )

        }
    }
}