package com.itheima.method;

import java.util.Scanner;

/*
�ж���ż
*/
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������һ������");
        int cin = sc.nextInt();
        math(cin);
    }

    public static void math(int cin) {

        if (cin % 2 == 0) {
            System.out.println("����ż��");
        } else {
            System.out.println("��������");
        }
    }
}
