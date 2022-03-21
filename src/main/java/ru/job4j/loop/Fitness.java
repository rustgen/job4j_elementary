package ru.job4j.loop;

public class Fitness {

    public static int calc(int ivan, int nik) {
        int month = 0;
        int thrustI = 0;
        int thrustN = 0;
        if (ivan > nik) {
            month--;
        }
        while (thrustI <= thrustN) {
            ivan *= 3;
            nik *= 2;
            thrustI = ivan;
            thrustN = nik;
            month++;
        }

        return month;
    }

    public static void main(String[] args) {
//        calc(95, 90);
        System.out.println(calc(95, 90));
    }
}
