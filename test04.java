package com.hechao;

import java.util.Arrays;

/**
 * @Auther: HeChao
 * @Date: 2021/9/18 - 09 - 18 - 15:35
 * @Description: com.hechao
 * @version: 1.0
 */
public class test04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c = 43;
        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 55;
        arr[2] = 44;
        arr[3] = 22;
        Arrays.toString(arr);
        eat();
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }

        }
        public static int eat(){
            System.out.println("-----1");
            System.out.println("-----2");
            System.out.println("-----3");
            return 90;
        }

    }

