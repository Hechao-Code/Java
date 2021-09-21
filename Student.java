package com.hc.Test06;

/**
 * @Auther: HeChao
 * @Date: 2021/9/21 - 09 - 21 - 18:51
 * @Description: com.hc.Test06
 * @version: 1.0
 */
public class Student extends Person {
    //属性

    //set get方法

    //构造器

    //方法
    public void sleep(){
        System.out.println("我要睡觉");
    }
    public Student eat(){
        System.out.println("我要小龙虾和啤酒");
        return new Student();
    }

}
