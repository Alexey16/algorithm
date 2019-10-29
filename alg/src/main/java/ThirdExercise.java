package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ThirdExercise {

    public static void main2(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8);
        int idx = 1;
        Integer n = Integer.valueOf(reader.readLine());

        if (n > 0) {
            int temp = 0;
            Integer current = Integer.valueOf(reader.readLine());
            System.out.println(current);

            while (idx < n) {
                temp = Integer.valueOf(reader.readLine());
                if (current != temp) {
                    current = temp;
                    System.out.println(current);
                }
                idx++;
            }
        }
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idx = 1;
        int n = scanner.nextInt();

        if (n > 0) {
            int temp = 0;
            int current = scanner.nextInt();
            System.out.println(current);

            while (idx < n) {
                temp = scanner.nextInt();
                if (current != temp) {
                    current = temp;
                    System.out.println(current);
                }
                idx++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8);

        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            final AtomicInteger[] temp = {new AtomicInteger()};
            final Integer[] current = {Integer.valueOf(reader.readLine())};
            System.out.println(current[0]);

            reader.lines().limit(n-1).forEach(e -> {
                temp[0].set(Integer.valueOf(e));
                if (current[0] != temp[0].get()) {
                    current[0] = temp[0].get();
                    System.out.println(current[0]);
                }
            });
            reader.close();
        }
    }
}
