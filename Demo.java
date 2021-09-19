package com.hc04;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @Auther: HeChao
 * @Date: 2021/9/19 - 09 - 19 - 16:37
 * @Description: com.hc04
 * @version: 1.0
 */
public class Demo {
    //属性
    int id;
    static int sid;
    //方法
    public void a(){
        System.out.println(id);
        System.out.println(sid);
    }
    public static void b(){
        System.out.println(this.id); //在静态方法中不能使用this关键字
        a(); //在静态方法中不能访问非静态方法
        System.out.println(id); //静态方法只能找静态的
        System.out.println(sid);
    }

    public static void main(String[] args) {
        Demo a = new Demo();
        a.a();
        Demo.b();  //静态方法可以用类名.方法名调用（推荐）
        a.b();     //静态方法也可以用对象名.方法名调用
        b();//同一个类中，方法可以直接调用
    }
}
