package com.itheima.method;

/*
���һ�������������������е����ֵ
 */
public class Test06 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 6, 2, 8, 1, 7};
        //�������鲻��ֱ���������������洢����ֵ������ֵ
        int[] minAndmax = math(arr);
        System.out.println("��Сֵ��" + minAndmax[0]);
        System.out.println("���ֵ��" + minAndmax[1]);
    }

    public static int[] math(int arr[]) {
        //��������洢���ֵ����Сֵ
        int max = arr[0];
        int min = arr[0];
        //�����ֵ
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        int[] maxAndmin = {min, max};
        return maxAndmin;
    }
}
