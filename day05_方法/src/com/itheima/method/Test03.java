package com.itheima.method;

import java.util.Scanner;
/*
����������еĽϴ�ֵ
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ������");
        int num1 = sc.nextInt();

        System.out.println("�������һ������");
        int num2 = sc.nextInt();

        int max =  getMax(num1,num2);

        System.out.println("�ϴ�ֵ�ǣ�" + max);
    }
    public static int getMax(int a,int b){
        int max = a > b ? a : b;
        return max;
    }
}
