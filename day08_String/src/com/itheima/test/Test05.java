package com.itheima.test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("«Î ‰»Î£∫");
        String s = sc.nextLine();

        String[] mgc = {"TMD","SB","tmd","sb"};
        String restul = s;
        for (int i = 0; i < mgc.length; i++) {
             restul = restul.replace(mgc[i],"***");
            
        }System.out.println(restul);

    }
}
