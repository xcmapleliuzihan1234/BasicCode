package com.itheima.method;
/*
Êý×é½»»»
 */
public class Test07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        exchange(arr,1,4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void exchange(int[] arr,int a,int b){
        int temp ;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
