package com.itheima.Private;

public class TestStudent {
    public static void main(String[] args) {
        Student stu =new Student();
        stu.setAge(10);
        stu.setHeghit(68);
        System.out.print("����" + stu.getAge());
        System.out.println(" ���" + stu.getHeghit());
        stu.show();
    }
}
