package com.study.exercise2;

/**
 * 定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
 * 请定义出手机类，类中要有空参、有参构造方法，set/get方法。
 * 定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
 * 调用对象的两个功能，打印效果如下：
 * <p>
 * ```
 * 正在使用价格为3998元黑色的小米手机打电话....
 * 正在使用价格为3998元黑色的小米手机发短信....
 * ```
 */
public class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone(){};

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //打电话call()
    public void call() {
        System.err.println("call to others");
    }

    //sendMessage()功能
    public void sendMessage() {
        System.err.println("send message from my phone");
    }

}
