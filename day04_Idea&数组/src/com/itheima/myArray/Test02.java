package com.itheima.myArray;

import java.util.Scanner;
/*
��ί���
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("����������������");
        for (int i = 0; i <arr.length ; i++) {
            int grade = sc.nextInt();
            arr[i] = grade;
        }
        System.out.print("������ί�ķ����ֱ�Ϊ��");
        for (int j = 0; j <arr.length ; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
