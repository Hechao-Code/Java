package com.hc04;

import java.beans.PersistenceDelegate;
import java.nio.MappedByteBuffer;

/**
 * @Auther: HeChao
 * @Date: 2021/9/19 - 09 - 19 - 16:15
 * @Description: com.hc04
 * @version: 1.0
 */
public class msbStudent {
    //属性
    String name;
    int age;
    static String school;

    //空构造器
    public msbStudent(){

    }

    public static void main(String[] args) {
        msbStudent.school = "马士兵教育";
        msbStudent t1 = new msbStudent();
        t1.name = "张三";
        t1.age = 20;

        msbStudent t2 = new msbStudent();
        t2.name = "李四";
        t2.age = 19;

        msbStudent t3 = new msbStudent();
        t3.name = "赵六";
        t3.age = 25;

        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.school);

        System.out.println(t2.name);
        System.out.println(t2.age);
        System.out.println(t2.school);

        System.out.println(t3.name);
        System.out.println(t3.age);
        System.out.println(t3.school);

    }
}
