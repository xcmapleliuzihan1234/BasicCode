package com.itheima.phone;

public class TestPhone {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.brand = "��Ϊ";
        ph.price = 10000;

        System.out.println(ph.brand);
        System.out.println(ph.price);
        ph.call("����");
        ph.sendMessage("����");
    }
}
