package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

    *   *   *       *
            *
    *   *   *   *   *
    *       *
    *       *   *   *
*/
public class Pattern19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int stars = number;
        int spaces = 0;

        for (int i = 0; i < number; i++) {
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            for (int st = 0; st < stars; st++) {
                if (i != 0 && i < number / 2 && st != 0 && st != stars - 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (i < number / 2) {
                stars -= 2;
                spaces++;
            } else {
                stars += 2;
                spaces--;
            }
            System.out.println();
        }
    }

}
