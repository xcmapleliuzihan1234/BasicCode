package com.itheima.method;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("�����룺");
        int num = sc.nextInt();
        System.out.println("����������λ��Ϊ��" + find(arr,num));
    }
    public static int find(int[] arr,int num){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
