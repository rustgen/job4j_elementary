package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double pPer = (a + b + c) / 2;
        double rsl = Math.sqrt(pPer * (pPer - a) * (pPer - b) * (pPer - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
