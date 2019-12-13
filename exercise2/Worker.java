package com.study.exercise2;

/**
 * 现已知工人（Worker）类，属性包含姓名（name）、工龄（year），请编写该类，提供构造方法和get、set方法。
 * 在测试类中，请查看键盘录入Scanner类的API，创建工人类对象，属性值由键盘录入，打印对象的属性值。输出效果如下：
 * ```
 * 请录入工人姓名：
 * 张三
 * 请录入工人工龄：
 * 5
 * 该工人对象的属性信息如下：
 * 姓名：张三
 * 工龄：5
 * ```
 */
public class Worker {
    private String name;
    private String year;

    public Worker() {
    }

    public Worker(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
