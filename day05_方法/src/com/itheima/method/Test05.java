package com.itheima.method;

import java.util.Arrays;
/*
数组的遍历，要求输出格式：[1,2,3,4,5]
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        tra(arr);
    }
    public static void tra(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //第一种打印方法
            //替换最后一次执行时的字符
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }//第二种方法打印
        System.out.println(Arrays.toString(arr));

    }
}
