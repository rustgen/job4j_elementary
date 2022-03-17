package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !(num > 0);
    }

    public static boolean notEvenAndPositive(int num) {
        return !(num % 2 == 0) && !(num > 0);
    }

    public static boolean evenOrNotPositive(int num) {
        return (num % 2 == 0) || !(num > 0);
    }

    public static void main(String[] args) {
        boolean number1 = LogicNot.isEven(1);
        System.out.println(number1);
        boolean number2 = LogicNot.isPositive(2);
        System.out.println(number2);
        boolean number3 = LogicNot.notEven(3);
        System.out.println(number3);
        boolean number4 = LogicNot.notEvenAndPositive(4);
        System.out.println(number4);
        boolean number5 = LogicNot.evenOrNotPositive(5);
        System.out.println(number5);
    }
}
