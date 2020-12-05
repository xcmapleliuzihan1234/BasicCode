package com.itheima.method;
/*
判断两个数是否相等，要求可以输入所有的整数类型
 */
public class Test04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("这两个数相等：" + compare(num1,num2));
    }
    //byte型
    public static boolean compare(byte num1,byte num2){
        return num1 == num2;
    }
    //short型
    public static boolean compare(short num1,short num2){
        return num1 == num2;
    }
    //int型
    public static boolean compare(int num1,int num2){
        return num1 == num2;
    }
    //long型
    public static boolean compare(long num1,long num2){
        return num1 == num2;
    }
}
