package com.itheima.charDemo;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i <s.length() ; i++) {
            System.out.println(s.charAt(i));
        }
    }
}
