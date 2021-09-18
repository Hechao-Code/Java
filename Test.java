package com.hc;

/**
 * @Auther: HeChao
 * @Date: 2021/9/18 - 09 - 18 - 19:06
 * @Description: com.hc
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        person zs = new person();
        zs.name = "张三";
        zs.age = 19;
        zs.height = 183.2;
        zs.weight = 170.3;

        person ls = new person();
        ls.name = "李四";
        ls.age = 17;
        ls.height = 179.2;
        ls.weight = 160.5;

        System.out.println(zs.name);
        System.out.println(ls.age);

        zs.eat();
        ls.eat();

        zs.sleep("酒店");
        ls.sleep("宿舍");

        //String str = zs.introduce();
        //String stri = ls.introduce();
        System.out.println(zs.introduce());
        System.out.println(ls.introduce());
    }
}
