package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(y1)
            && isValid(x2) && isValid(y2)) {
            rsl = (x1 == y1 && x2 == y2) ? Math.abs(x2 - x1) : rsl;
            rsl = Math.abs(x1 - x2) == Math.abs(y1 - y2) ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

        public static boolean isValid(int coordinate) {
            return coordinate >= 0 && coordinate <= 7;
        }

    public static void main(String[] args) {
        int resEl1 = way(6, 7, 1, 2);
        System.out.println(resEl1);
        int resEl2 = way(7, 0, 0, 7);
        int resEl3 = way(2, 6, 4, 1);
        int resEl4 = way(-1, 6, 4, 1);
        int resEl5 = way(2, -1, 4, 1);
        int resEl6 = way(2, 6, -1, 1);
        int resEl7 = way(2, 6, 4, -1);
        int resEl8 = way(10, 6, 4, 1);
        int resEl9 = way(2, 10, 4, 1);
        int resEl10 = way(2, 6, 10, 1);
        int resEl11 = way(2, 6, 4, 10);
    }
}
