package com.hc.Test01;

/**
 * @Auther: HeChao
 * @Date: 2021/9/22 - 09 - 22 - 10:27
 * @Description: com.hc.Test01
 * @version: 1.0
 */
public class Student {
    //属性
    private String name;
    private int age ;
    private double height ;
    //构造器
    public Student() {
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    //set get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //方法
    public void eat(){
        System.out.println("我爱吃饭");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
