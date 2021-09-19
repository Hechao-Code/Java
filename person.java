package com.hc03;

/**
 * @Auther: HeChao
 * @Date: 2021/9/19 - 09 - 19 - 15:10
 * @Description: com.hc03
 * @version: 1.0
 */
public class person {
    //属性
    int age;
    String name;
    double height;
    double weight;
    //空构造器
    public person(){

    }
    //有参构造器
    /*public person(int age,String name,double height,double weight){
        this.age = age;         //当属性和形参发生重名时，this指代当前对象的属性
        this.name = name;
        this.height = height;
        this. weight = weight;
    }*/
    public person(int age,String name,double height,double weight){
        this(age,name,height);
        this.weight = weight;
    }
    public person(int age,String name,double height){
        this(age,name);
        this. height = height;
    }
    public person(int age,String name){
        this(name);
        this.age = age;
    }
    public person(String name){
        this.name = name;
    }
    //方法
    /*public void eat(){
        int age = 10;
        System.out.println(age);//输出10  就近原则
        System.out.println(this.age); //当属性和局部变量重名时,this指代当前对象的属性
        System.out.println("我要吃饭");
    }*/
    public void play(){
        eat();
        System.out.println("上网");
        System.out.println("洗澡");
    }
    public void eat(){
        System.out.println(age);
        System.out.println("吃饭");
    }
}
