package com.itheima.myArray;

import java.util.Scanner;
/*
数组求和
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五个数：");
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        } int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println("总和为：" + sum);
    }
}
