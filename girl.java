package com.hc.Test;

/**
 * @Auther: HeChao
 * @Date: 2021/9/20 - 09 - 20 - 7:59
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class girl {//女孩
    //属性
    private int age;
    //设置年龄
    public void shezhiAge(int age){
        if(age>30){
            this.age = 18;
        }else{
            this.age = age;
        }
    }
    //读取年龄
    public int duquAge(){
        return age;
    }
}
