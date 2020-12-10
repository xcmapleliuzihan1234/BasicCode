package com.itheima.user;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        String userNane = "admin";
        int password = 123456;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
        System.out.println("请输入用户名：");
        String scUserName = sc.next();
        System.out.println("请输入密码：");
        int scPassword =sc.nextInt();

            if(scUserName.equals(userNane)&&(scPassword==password)){
                System.out.println("登录成功");
                break;
            }else {
                if (i==3){
                    System.out.println("您的登陆次数已用尽");
                }else {
                    System.out.println("密码错误,您还剩" + (3-i) + "次机会");
                }
            }
        }

    }
}
