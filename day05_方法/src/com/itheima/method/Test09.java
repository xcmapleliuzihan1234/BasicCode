package com.itheima.method;
/*
��������
 */
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("������һ��С����");
        double num =sc.nextDouble();
        System.out.println("��������Ϊ��" + carry(num));
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
