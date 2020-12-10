package com.itheima.test;

import com.itheima.domain.Student;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("«Î ‰»Î£∫");
        String s = sc.nextLine();

        String[] sarr = s.split("£¨");

        Student st = new Student(sarr[0],sarr[1]);
        System.out.println(st.getName() + "..." + st.getAge());
    }
}
