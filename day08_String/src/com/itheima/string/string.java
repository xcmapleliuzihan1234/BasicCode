package com.itheima.string;

public class string {
    public static void main(String[] args) {

        String s1 =new String();
        System.out.println("s1 = " + s1);

        String s2 =new String("abc");
        System.out.println("s2 = " + s2);

        char[] chs = {'a','b','c'};
        String s3 =new String(chs);
        System.out.println("s3 = " + s3);
        
        String s4 = "abc";
        System.out.println("s4 = " + s4);

        byte[] b = {97,98,99};
        String s5 = new String(b);
        System.out.println("s5 = " + s5);
    }
}
