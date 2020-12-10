package com.itheima.charDemo;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ÇëÊäÈë×Ö·û´®£º");
        String s = sc.nextLine();

        char[] chs = s.toCharArray();

        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
    }
}
