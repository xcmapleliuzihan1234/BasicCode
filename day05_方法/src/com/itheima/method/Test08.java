package com.itheima.method;
/*
��ѯ����Ԫ��
 */
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("�����룺");
        int num = sc.nextInt();
        System.out.println(find(arr,num));
    }
    public static int find(int[] arr,int num){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.print("����������λ��Ϊ��" );
                return i;
            }
        }
        System.out.print("�������󣬷��أ�");
        return -1;
    }
}
