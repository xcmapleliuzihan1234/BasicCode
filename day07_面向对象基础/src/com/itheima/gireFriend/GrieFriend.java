package com.itheima.gireFriend;

public class GrieFriend {
    private String name;
    private double height;
    private double weight;

    public GrieFriend() {
    }

    public GrieFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void wash(){
        System.out.println("Ů���Ѱ���ϴ�·�");
    }
    public void cook(){
        System.out.println("Ů���Ѹ�������");
    }
    public void show(){
        System.out.println("��Ů���ѽ�" + name + "�����" + height +"���ף�����:" + weight + "��");
    }
}
class Test {
    public static void main(String[] args) {
        GrieFriend g = new GrieFriend("����",170.0,120);
        g.show();
        g.wash();
        g.cook();

    }
}