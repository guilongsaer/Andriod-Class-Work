package com.example.lh2207020533no2
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

data class Person(val name: String, val message: String, val time: String, val avatar: Int)

val people = listOf(
    Person("佐助", "小樱，记得带身份证", "                                                            10分钟前", R.drawable.avatar1),
    Person("鸣人", "大跌柏油", "                                                               2分钟前", R.drawable.avatar2),
    Person("小樱", "佐助，找我。", "                                                             30秒前", R.drawable.avatar3),
    Person("佩恩", "感受我的痛苦吧，扣男", "                                                             现在", R.drawable.avatar4),
    Person("自来也", "我乃自来也大人", "                                                           1分钟前", R.drawable.avatar5),
    Person("小南", "早啊，长门!", "                                                              5分钟前", R.drawable.avatar6)
)

@Composable
fun ChatMessage(person: Person) {
    Row(modifier = Modifier.padding(8.dp)) {
        // Display avatar
        Image(
            painter = painterResource(id = person.avatar),
            contentDescription = "Avatar",
            modifier = Modifier.size(50.dp)
        )
        Spacer(modifier = Modifier.width(8.dp)) // Add space between avatar and text
        // Display name, message, and time
        Column {
            Text(text = person.name, style = MaterialTheme.typography.headlineLarge)
            Text(text = person.message, style = MaterialTheme.typography.bodyLarge)
            Text(text = person.time, style = MaterialTheme.typography.labelSmall, color = Color.Gray)
        }
    }
}

@Composable
fun ChatScreen(people: List<Person>) {
    LazyColumn {
        items(people) { person ->
            ChatMessage(person = person)
        }
    }
}

@Composable
fun InstantMessagingApp() {
    ChatScreen(people = people)
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // Use Surface to apply Material Design background color and theme
                Surface {
                    InstantMessagingApp()
                }
            }
        }
    }
}