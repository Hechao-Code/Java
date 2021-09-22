package com.hc.Test03;

/**
 * @Auther: HeChao
 * @Date: 2021/9/22 - 09 - 22 - 13:55
 * @Description: com.hc.Test03
 * @version: 1.0
 */
public class Boy {
    //属性
    String name;
    int age;

    //构造器
    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //set get方法

    //方法
    public void buy(){
        System.out.println("和我谈恋爱，给你买买买");
    }
}
