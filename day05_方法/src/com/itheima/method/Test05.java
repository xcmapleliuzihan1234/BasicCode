package com.itheima.method;

import java.util.Arrays;
/*
����ı�����Ҫ�������ʽ��[1,2,3,4,5]
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        tra(arr);
    }
    public static void tra(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //��һ�ִ�ӡ����
            //�滻���һ��ִ��ʱ���ַ�
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }//�ڶ��ַ�����ӡ
        System.out.println(Arrays.toString(arr));

    }
}
