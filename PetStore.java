package com.hc.Test05;

/**
 * @Auther: HeChao
 * @Date: 2021/9/22 - 09 - 22 - 20:56
 * @Description: com.hc.Test05
 * @version: 1.0
 */
public class PetStore {
    //工厂设计模式
    public static Animal getAnimal(String PetName){
        Animal an = null;
        if("猫".equals(PetName)){
            an = new Cat();
        }else if("狗".equals(PetName)){
            an = new Dog();
        }else if("猪".equals(PetName)){
            an = new Pig();
        }
        return an;
    }
}
