package com.itheima.method;

import java.util.Arrays;

/*
���һ�������������������е����ֵ
 */
public class Test06 {
    public static void main(String[] args) {
        int[] arr = {3,5,4,6,2,8,1,7};
        //�������鲻��ֱ���������������洢����ֵ������ֵ
        int[] minAndmax = math(arr);
        System.out.println(minAndmax[0]);
        System.out.println(minAndmax[1]);
    }
    public static int[] math(int arr[]){
        //��������洢���ֵ����Сֵ
        int max = arr[0];
        int min = arr[0];
        //�����ֵ
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
