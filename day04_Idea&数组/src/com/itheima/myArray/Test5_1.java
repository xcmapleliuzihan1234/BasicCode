package com.itheima.myArray;
/*
虎牙抽奖
方法二：删除用过的随机数
 */
import java.util.Random;

public class Test5_1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr1 ={0,1,2,3,4};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
     //循环arr1和index对比
            for (int j = 0; j < 5; j++) {
     //如果相同则证明索引第一次出现，并给arr1赋一个不在arr索引内的值
                if(index == arr1[j]){
                    arr1[j] = 5;
                  //索引第一次出现，打印抽到的奖项
                    System.out.println(arr[index]);
                }else{
                //不是第一次出现，重新取随机数再次对比
                    i--;
                }
            }

        }
    }
}