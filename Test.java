package com.hc.Test05;

/**
 * @Auther: HeChao
 * @Date: 2021/9/22 - 09 - 22 - 20:33
 * @Description: com.hc.Test05
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Pig p = new Pig();
        Girl g = new Girl();
        g.play(c);
        g.play(d);
        g.play(p);

        System.out.println();

        /*Animal an = new Dog();
        an.shout();

         */
        /*Animal an = null;
        Pig pig = (Pig)an;
        pig.weight = 2;
        pig.eat();
        an.age = 20;
         */
        Animal an = PetStore.getAnimal("猪");
        an.shout();


    }
}
