package com.itheima.method;

import java.util.Scanner;

/*
判断奇偶
*/
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int cin = sc.nextInt();
        math(cin);
    }

    public static void math(int cin) {

        if (cin % 2 == 0) {
            System.out.println("这是偶数");
        } else {
            System.out.println("这是奇数");
        }
    }
}
