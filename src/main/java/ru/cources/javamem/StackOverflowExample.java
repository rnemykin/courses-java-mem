package ru.cources.javamem;

/**
 * Created by roman-nem on 11.10.16.
 */
public class StackOverflowExample {

    public static int callsCount = 0;

    public static long factorial(long n) {
        if(n < 2) {
            return n;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
