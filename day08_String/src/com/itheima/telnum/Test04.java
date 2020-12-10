package com.itheima.telnum;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ÇëÊäÈëÊÖ»úºÅÂë£º");
        String tel = sc.nextLine();

      String start =  tel.substring(0,3);
      String end = tel.substring(tel.length()-4);
        System.out.println(start + "****" + end);
    }
}
