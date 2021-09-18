package com.hc;

/**
 * @Auther: HeChao
 * @Date: 2021/9/18 - 09 - 18 - 18:33
 * @Description: com.hc
 * @version: 1.0
 * 创建类：人类
 */
public class person {
    //创建属性
    int age;
    String name;
    double height;
    double weight;

    //创建方法
    public void eat(){
        System.out.println("我要吃饭");
    }
    public void sleep(String address){
        System.out.println("我要在"+address+"睡觉");
    }
    public String introduce(){
        return "我的姓名是"+name+",我的年龄是"+age+"，我的身高是"+height+",我的体重是"+weight;
    }

}
