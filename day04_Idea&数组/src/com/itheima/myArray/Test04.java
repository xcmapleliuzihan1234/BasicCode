package com.itheima.myArray;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五个数：");
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        } int temp = arr[0],max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
          max = temp > arr[i] ? temp : arr[i];
        }
        System.out.println("最大值为：" + max);
    }
}
