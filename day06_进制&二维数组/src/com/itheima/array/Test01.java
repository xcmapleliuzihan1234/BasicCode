package com.itheima.array;

import java.util.Arrays;
/*
��ת����
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        //����һ��whileѭ��
        int start=0,end=arr.length-1;
        while (start<end){
      //  ��������forѭ�������ͬʱ����
            // for(int start=0,end=arr.length-1;start<end;start++,end--) {
            int temp = arr[start];
             arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        /*�������һ��
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        */
        //�����������
        System.out.println(Arrays.toString(arr));

    }
}
