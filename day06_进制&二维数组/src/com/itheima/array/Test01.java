package com.itheima.array;

import java.util.Arrays;
/*
逆转数组
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        //方法一：while循环
        int start=0,end=arr.length-1;
        while (start<end){
      //  方法二：for循环多变量同时进行
            // for(int start=0,end=arr.length-1;start<end;start++,end--) {
            int temp = arr[start];
             arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        /*输出方法一：
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        */
        //输出方法二：
        System.out.println(Arrays.toString(arr));

    }
}
