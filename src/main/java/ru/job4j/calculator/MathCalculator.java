package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinDiv(double first, double second) {
        return min(first, second)
                + divide(first, second);
    }

    public static double mainSum(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + min(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы разности и деления равен: " + sumMinDiv(10, 20));
        System.out.println("Результат расчета суммы 4 операций равен: " + mainSum(10, 20));
    }
}
