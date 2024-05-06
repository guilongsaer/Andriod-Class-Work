package com.example.middleexam1.ui.theme


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
@Composable
fun IndexScreen(teachers: List<Teacher>, students: List<Student>, navController: NavController) {
    Column {
        Text("教师人数: ${teachers.size}")
        Text("学生人数: ${students.size}")
        Button(onClick = { navController.navigate("A") }) {
            Text("A")
        }
        Button(onClick = { navController.navigate("B") }) {
            Text("B")
        }
        Button(onClick = { navController.navigate("C") }) {
            Text("C")
        }
    }
}

@Composable
fun A(teachers: List<Teacher>, navController: NavController) {
    Column {
        Text("教师信息")
        for (teacher in teachers){
            Text("工号：${teacher.tid}, 姓名：${teacher.tname}, 年龄：${teacher.tage}, 邮件：${teacher.temail}, 班级：${teacher.tclass}")
        }
        Button(onClick = { navController.navigate("Home") }) {
            Text("回到主页")
        }
    }
}

@Composable
fun B(students: List<Student>, navController: NavController) {
    Column {
        Text("学生信息")
        for (student in students){
            Text("学号：${student.sid}, 姓名：${student.sname}, 年龄：${student.sage}, 邮件：${student.semail}, 班级：${student.sclass}")
        }
        Button(onClick = { navController.navigate("Home") }) {
            Text("回到主页")
        }
    }
}

@Composable
fun C(onLogout: () -> Unit) {
    Button(onClick = { onLogout() }) {
        Text("Logout")
    }
}
