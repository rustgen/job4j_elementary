package ru.job4j.loop;

public class Factorial {

    public static int calc(int n) {
        int result = 0;
        for (int i = 1; i - 1 < n; i++) {
            if (result == 0) {
                result = 1;
            }
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}


