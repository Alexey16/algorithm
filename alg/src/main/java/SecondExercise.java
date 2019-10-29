package main.java;

import java.util.Scanner;

public class SecondExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] ar = new Integer[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int maxLength = 0;
        int curr = 0;

        for (int i = 0; i < n; i++) {
            if (ar[i] == 1) {
                curr++;
                if (maxLength < curr)
                    maxLength = curr;
            } else {
                curr = 0;
            }
        }
        System.out.println(maxLength);
    }
}
