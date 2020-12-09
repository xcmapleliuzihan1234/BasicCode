package com.itheima.student;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student("张三", 23);
        Student stu1 = new Student();
        stu1.setName("李四");
        stu1.setAge(24);
        stu.show();
        stu1.show();
    }
}
