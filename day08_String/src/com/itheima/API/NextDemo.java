package com.itheima.API;

import java.util.Scanner;

public class NextDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        System.out.println(s);

        System.out.println("请输入一个字符串：");
        String t = sc.next();
        System.out.println(t);
    }
}
