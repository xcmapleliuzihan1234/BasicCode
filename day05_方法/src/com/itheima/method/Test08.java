package com.itheima.method;
/*
查询数组元素
 */
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("请输入：");
        int num = sc.nextInt();
        System.out.println(find(arr,num));
    }
    public static int find(int[] arr,int num){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.print("该数的索引位置为：" );
                return i;
            }
        }
        System.out.print("输入有误，返回：");
        return -1;
    }
}
