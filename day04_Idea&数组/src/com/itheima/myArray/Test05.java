package com.itheima.myArray;
/*
虎牙抽奖
方法一：创建数组存储随机数
 */
import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr1 =new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            //创建新数组存储随机数，重复随机数再重新赋值
           arr1[i] = index;

            for (int j = 0; j <i ; j++) {
                if(arr1[i] == arr1[j]){
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(arr[arr1[i]]);;
        }

    }
}
