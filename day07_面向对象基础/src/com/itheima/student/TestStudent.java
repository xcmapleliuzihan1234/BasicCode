package com.itheima.student;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student("����", 23);
        Student stu1 = new Student();
        stu1.setName("����");
        stu1.setAge(24);
        stu.show();
        stu1.show();
    }
}
