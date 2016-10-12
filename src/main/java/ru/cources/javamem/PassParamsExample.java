package ru.cources.javamem;

import java.util.*;

/**
 * Created by roman-nem on 12.10.16.
 */
public class PassParamsExample {
    public static void main(String[] args) {
//        passPrimitive();

//        passObject();

//        passObject2();


    }

    private static void passPrimitive() {
        int x = 5;
        add(x);
        System.out.println("after function: " + x);
    }

    private static void add(int source) {
        int random = new Random().nextInt(10);
        System.out.println("random is: " + random);
        source += random;
        System.out.println("result from function: " + source);
    }

    private static void passObject() {
        Date date = new Date();
        add(date);
        System.out.println(date);
    }

    private static void add(Date source) {
        source.setTime(new Date().getTime() + 86400*1000);
        System.out.println("from function: " + source);
    }

    private static void passObject2() {
        String s = "I love Java";
        add(s);
        System.out.printf(s);
    }
    private static void add(String source) {
        source = source + ", only 8";
        System.out.println("from function: " + source);
    }
}
