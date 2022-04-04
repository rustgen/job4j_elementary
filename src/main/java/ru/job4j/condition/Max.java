package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int middle, int right) {
        return max(
                left,
                max(middle, right)
        );
    }

    public static int max(int one, int two, int three, int four) {
        return max(
                max(one, two),
                max(three, four)
        );
    }

    public static void main(String[] args) {
        int num = Max.max(2, 11);
        System.out.println(num);
    }
}
