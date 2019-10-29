package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class QSort {
    /*
        В первой строке задано два целых числа 1≤n≤50000 и 1≤m≤50000 — количество отрезков и точек на прямой, соответственно.
        Следующие n строк содержат по два целых числа ai и bi (ai≤bi) — координаты концов отрезков.
        Последняя строка содержит m целых чисел — координаты точек. Все координаты не превышают 108 по модулю.
        Точка считается принадлежащей отрезку, если она находится внутри него или на границе.
        Для каждой точки в порядке появления во вводе выведите, скольким отрезкам она принадлежит.

        2 3
        0 5
        7 10
        1 6 11
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idx = 0;
        int n = in.nextInt();
        int m = in.nextInt();
        Position[] arr = new Position[2*n + m];
        for (int i = idx; i < 2*n; i++, idx++) {
            int posit1 = in.nextInt();
            String type1 = "left";

            Position pos1 = new Position(posit1, type1);
            arr[i] = pos1;
            i++;
            idx++;
            int posit2 = in.nextInt();
            String type2 = "right";
            Position pos2 = new Position(posit2, type2);
            arr[i] = pos2;
        }

        for (int j = idx; j < 2*n + m; j++) {
            int posit1 = in.nextInt();
            String type1 = "osn";

            Position pos1 = new Position(posit1, type1);
            arr[j] = pos1;
        }
        Arrays.sort(arr);

        getCount(arr);

    }

    private static void getCount(Position[] arr) {
        int countLeft = 0;
        int countRight = 0;
        for (Position position : arr) {
            if ("left".equalsIgnoreCase(position.getType())) {
                countLeft++;
            } else if ("right".equalsIgnoreCase(position.getType())) {
                countRight++;
            } else {
                System.out.print(countLeft - countRight + " ");
            }
        }
    }

    static class Position implements Comparable<Position>{
        int position;
        String type;

        public Position(int position, String type) {
            this.position = position;
            this.type = type;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public int compareTo(Position o) {
            if (this.position == o.position) {
                if ("osn".equalsIgnoreCase(this.type) && "left".equalsIgnoreCase(o.type)) {
                    return 1;
                } else if ("osn".equalsIgnoreCase(this.type) && "right".equalsIgnoreCase(o.type)) {
                    return -1;
                } else if ("left".equalsIgnoreCase(this.type) && "right".equalsIgnoreCase(o.type)) {
                    return -1;
                }
            }
            return Integer.compare(this.position, o.position);
        }
    }
}
