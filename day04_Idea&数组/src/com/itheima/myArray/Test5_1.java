package com.itheima.myArray;
/*
�����齱
��������ɾ���ù��������
 */
import java.util.Random;

public class Test5_1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr1 ={0,1,2,3,4};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
     //ѭ��arr1��index�Ա�
            for (int j = 0; j < 5; j++) {
     //�����ͬ��֤��������һ�γ��֣�����arr1��һ������arr�����ڵ�ֵ
                if(index == arr1[j]){
                    arr1[j] = 5;
                  //������һ�γ��֣���ӡ�鵽�Ľ���
                    System.out.println(arr[index]);
                }else{
                //���ǵ�һ�γ��֣�����ȡ������ٴζԱ�
                    i--;
                }
            }

        }
    }
}