package com.itheima.method;

import java.util.Scanner;
/*
���������֮�����������
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ������");
        int num1 = sc.nextInt();

        System.out.println("�������һ������");
        int num2 = sc.nextInt();

        //����������
        odd(num1,num2);
    }
    public static void odd(int num1,int num2){
        //ʹ��������С��������
        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }else {
            System.out.println("���������������");
            return;
        }
        //ȡ����
        for(int i = num1;i <= num2;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
