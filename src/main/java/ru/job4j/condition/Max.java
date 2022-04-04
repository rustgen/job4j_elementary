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

    public static int max(int left1, int left2, int right1, int right2) {
        return max(
                max(left1, left2),
                max(right1, right2)
        );
    }

    public static void main(String[] args) {
        int num = Max.max(2, 11);
        System.out.println(num);
    }
}
