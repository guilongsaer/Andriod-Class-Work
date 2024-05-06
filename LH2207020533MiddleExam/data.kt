package com.example.middleexam1.ui.theme

data class Teacher(
    var tid: Int,
    var tname:String,
    var tage:Int,
    var temail: String,
    var tclass: String
)

data class Student (
    var sid: Int,
    var sname:String,
    var sage:Int,
    var semail: String,
    var sclass: String

)
val teachers = listOf(
    Teacher(11,"林俊杰",45,"1234567@qq.com","1班"),
    Teacher(12,"张学友",37,"89101112@qq.com","2班"),
    Teacher(13,"胡彦斌",55,"13141516@qq.com","3班")
)
val students = listOf(
    Student(1,"刘一",18,"09876576@qq.com","4班"),
    Student(2,"陈二",19,"114514@qq.com","2班"),
    Student(3,"张三",20,"1919810@qq.com","3班"),
    Student(4,"李四",21,"114114@qq.com","4班"),
    Student(5,"王王",22,"514514@qq.com","5班")
)
