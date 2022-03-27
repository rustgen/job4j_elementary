package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index; i < array.length - i; i++) {
                    if (array[index + i] != null) {
                        String temp = array[index + i];
                        array[index + i] = array[index];
                        array[index] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {null, "I"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
