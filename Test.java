package com.hc04;

/**
 * @Auther: HeChao
 * @Date: 2021/9/19 - 09 - 19 - 16:04
 * @Description: com.hc04
 * @version: 1.0
 */
public class Test {
    //属性
    int id;
    static int sid;
    //空构造器
    public  Test(){

    }

    public static void main(String[] args) {
        Test s1 = new Test();
        s1.id = 10;
        s1.sid = 10;

        Test s2 = new Test();
        s2.id = 20;
        s2.sid = 20;

        Test s3 = new Test();
        s3.id = 30;
        s3.sid = 30;

        System.out.println(s1.id);
        System.out.println(s2.id);
        System.out.println(s3.id);

        System.out.println(s1.sid);
        System.out.println(s2.sid);
        System.out.println(s3.sid);
    }
}

