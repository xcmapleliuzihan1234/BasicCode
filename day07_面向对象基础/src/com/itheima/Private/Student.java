package com.itheima.Private;

public class Student {
    private int age;
    private int heghit;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        }else {
            System.out.println("������������");
        }
    }

    public int getHeghit() {
        return heghit;
    }

    public void setHeghit(int heghit) {
        this.heghit = heghit;
    }

    public void show() {
        System.out.println("����" + age + " ���" + heghit);
    }
}
