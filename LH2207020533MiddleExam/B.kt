package com.example.middleexam1.ui.theme


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Bpage(students: List<Student>, navController: NavController) {
    Column {
        Text(text = "学生信息")
        for (student in students){
            Text("学号：${student.sid}, 姓名：${student.sname}, 年龄：${student.sage}, 邮件：${student.semail}, 班级：${student.sclass}")
        }
        Button(onClick = { navController.navigate("Home") }) {
            Text(text = "回到主页")
        }
    }
}
