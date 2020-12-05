package com.itheima.myArray;

import java.util.Scanner;
/*
评委打分
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入六个分数：");
        for (int i = 0; i <arr.length ; i++) {
            int grade = sc.nextInt();
            arr[i] = grade;
        }
        System.out.print("六个评委的分数分别为：");
        for (int j = 0; j <arr.length ; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
