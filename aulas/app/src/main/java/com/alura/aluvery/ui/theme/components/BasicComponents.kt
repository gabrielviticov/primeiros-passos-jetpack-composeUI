package com.alura.aluvery.ui.theme.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alura.aluvery.ui.theme.AluveryTheme

@Composable
fun MyFirstComposable() {
    Text(text = "My First Composable")
}

@Preview
@Composable
fun MyFirstComposablePreview() {
    MyFirstComposable()
}

@Preview(
    name = "columnPreviewer",
    heightDp = 778,
    widthDp = 393,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "columnPreviewerLight",
    heightDp = 778,
    widthDp = 393,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun ColumnPreviewer() {

    AluveryTheme {
        Surface {
            Column {
                MyFirstComposable()
                GetName(name = "Gabriel")
            }
        }
    }
}

@Composable
fun GetName(name: String) {
    Text(text = "Me chamo ${name.uppercase()}")
}

@Preview(name = "Layout Column", showSystemUi = true)
@Composable
fun AlignmentColumn() {
    Column {
        Text(text = "titulo....")
        Text(text = "descrição....")
    }
}

@Preview(name = "Layout Row", showSystemUi = true)
@Composable
fun AlignmentRow() {
    Row {
        Text(text = "titulo....")
        Text(text = "descrição....")
    }
}

@Preview(name = "Layout Box", showSystemUi = true)
@Composable
fun AlignmentBox() {
    Box {
        Text(text = "titulo....")
        Text(text = "descrição....")
    }
}

@Preview(name = "Custom Layout", showSystemUi = false)
@Composable
fun CustomLayout() {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .background(color = Color.Blue)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(
            Modifier
                .padding(10.dp)
                .fillMaxWidth()) {
            Text(text = "Texto 1")
            Text(text = "Texto 2")
        }
        Row(
            Modifier
                .padding(vertical = 4.dp, horizontal = 12.dp)
                .background(Color.White)
                .border(width = 2.dp, color = Color.Green)
        ) {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box(
            Modifier
                .padding(all = 12.dp)
                .background(Color.Magenta)
                .border(width = 1.dp, color = Color.Green)
        ) {
            Row {
                Text(text = "Texto 5")
                Text(text = "Texto 6")
            }

            Column {
                Text(text = "Texto 7")
                Text(text = "Texto 8")
            }
        }
    }
}

@Preview(name = "columnModifier", showSystemUi = true)
@Composable
fun ColumnModifier() {
    AluveryTheme {
        Surface {
            Box{
                Column(
                    Modifier.fillMaxWidth()
                    .background(Color.Yellow)) {
                    Text(text = "Titulo....")
                    Text(text = "Subtitulo....")
                }
            }
        }
    }
}