package com.example.learntogetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogetherapp.ui.theme.LearnTogetherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Article(header: String, intro:String, content: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(painter = image, contentDescription =null )
        Text(text = header, fontSize = 24.sp, modifier = Modifier.padding(16.dp))
        Text(text = intro, textAlign = TextAlign.Justify, modifier = Modifier.padding(16.dp))
        Text(text = content, textAlign = TextAlign.Justify, modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearnTogetherAppTheme {
        Article(stringResource(R.string.header_text),
            stringResource(R.string.article_intro), stringResource(R.string.article_content)
        )
    }
}