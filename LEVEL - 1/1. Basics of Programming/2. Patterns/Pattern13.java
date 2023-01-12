package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

    1
    1	1
    1	2	1
    1	3	3	1
    1	4	6	4	1
*/
public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 1;

        for (int i = 0; i < number; i++) {
            int val = 1;
            for (int j = 0; j < count; j++) {
                System.out.print(val + "\t");
                val = val * (i - j) / (j + 1);
            }
            count++;
            System.out.println();
        }
    }
}
