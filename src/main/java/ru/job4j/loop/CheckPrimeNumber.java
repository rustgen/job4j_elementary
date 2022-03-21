package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        if (number == 1) {
            prime = false;
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(1));
    }
}
