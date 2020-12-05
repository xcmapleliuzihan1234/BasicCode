package com.itheima.method;

import java.util.Scanner;

/*
输出两个数之间的所有奇数
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();

        //输入两个数
        odd(num1, num2);
    }

    public static void odd(int num1, int num2) {
        //使两个数从小到大输入
        if (num1 < 0 || num2 < 0) {
            System.out.println("您的输入有误！");
        }else if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        //取奇数
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
