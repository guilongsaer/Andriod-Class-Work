package com.example.middleexam1.ui.theme


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Apage(teachers: List<Teacher>, navController: NavController) {
    Column {
        Text(text = "教师信息")
        for (teacher in teachers){
            Text("工号：${teacher.tid}, 姓名：${teacher.tname}, 年龄：${teacher.tage}, 邮件：${teacher.temail}, 班级：${teacher.tclass}")
        }
        Button(onClick = { navController.navigate("Home") }) {
            Text(text = "回到主页")
        }
    }
}
