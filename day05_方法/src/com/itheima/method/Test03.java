package com.itheima.method;

import java.util.Scanner;
/*
输出两个数中的较大值
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();

        System.out.println("请输入第一个数：");
        int num2 = sc.nextInt();

        int max =  getMax(num1,num2);

        System.out.println("较大值是：" + max);
    }
    public static int getMax(int a,int b){
        int max = a > b ? a : b;
        return max;
    }
}
