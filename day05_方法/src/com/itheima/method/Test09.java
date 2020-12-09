package com.itheima.method;
/*
四舍五入
 */
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个小数：");
        double num =sc.nextDouble();
        System.out.println("四舍五入为：" + carry(num));
    }

    public static int carry(double num) {
        int num1 = (int) (num * 10);
        if (num1 % 10 >= 5) {
            return ((num1 + 10)/10);
        } else  {
            return num1/10;
        }

    }
}
