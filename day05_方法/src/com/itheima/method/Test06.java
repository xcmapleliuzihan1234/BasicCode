package com.itheima.method;

import java.util.Arrays;

/*
设计一个方法，用于求数组中的最大值
 */
public class Test06 {
    public static void main(String[] args) {
        int[] arr = {3,5,4,6,2,8,1,7};
        //由于数组不能直接输出，定义数组存储返回值的数组值
        int[] minAndmax = math(arr);
        System.out.println(minAndmax[0]);
        System.out.println(minAndmax[1]);
    }
    public static int[] math(int arr[]){
        //定义变量存储最大值和最小值
        int max = arr[0];
        int min = arr[0];
        //求最大值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            for (int j = 0; j < arr.length; j++) {
            if(arr[j] < min){
                min = arr[j];
            }
        }
        int[] maxAndmin = {min,max};
        return maxAndmin;
    }
}
