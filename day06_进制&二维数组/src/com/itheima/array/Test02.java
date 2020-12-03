package com.itheima.array;

/*
二维数组的遍历
 */
public class Test02 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <arr.length ; i++) {
            /*方法一：
            //定义新的数组存储{1,2,3},{4,5,6},{7,8,9}
            int[] temp = arr[i];
            for (int j = 0; j <temp.length ; j++) {
                System.out.print(temp[j] + " ");
            }
            */
            //方法二：
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
