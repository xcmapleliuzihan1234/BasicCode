package com.itheima.array;

/*
��ά����ı���
 */
public class Test02 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <arr.length ; i++) {
            /*����һ��
            //�����µ�����洢{1,2,3},{4,5,6},{7,8,9}
            int[] temp = arr[i];
            for (int j = 0; j <temp.length ; j++) {
                System.out.print(temp[j] + " ");
            }
            */
            //��������
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
