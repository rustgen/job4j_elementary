package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] value = new int[size][size];
        for (int row = 0; row < value.length; row++) {
            for (int cell = 0; cell < value[row].length; cell++) {
                System.out.println();
                value[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return value;
    }
}
