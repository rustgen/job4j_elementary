package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] abc = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = back(abc);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }
}


