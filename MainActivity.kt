package com.example.lh2207020533no1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lh2207020533no1.ui.theme.LH2207020533No1Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LH2207020533No1Theme {
                MainActivityContent()
            }
        }
    }
}


@Composable
fun GreetingText(message: String, from: String) {
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = message, fontSize = 40.sp, fontWeight = FontWeight.Bold)
        Text(text = from, fontSize = 40.sp, fontWeight = FontWeight.Normal)
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.androidparty),
        contentDescription = null,
        modifier = modifier
    )
    GreetingText(message = message, from = from)
}

@Composable
fun MainActivityContent() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        GreetingImage("Happy Birthday Sams", " from,LH", Modifier.padding(0.dp))
    }
}

