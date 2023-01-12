package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

    * * *    * * *
    * *        * *
    *            *
    * *        * *
    * * *    * * *
*/
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int stars = number / 2 + 1;
        int spaces = 1;

        for (int i = 0; i < number; i++) {
            for (int st = 0; st < stars; st++) {
                System.out.print("*\t");
            }
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            for (int st = 0; st < stars; st++) {
                System.out.print("*\t");
            }
            if (i < number / 2) {
                spaces += 2;
                stars--;
            } else {
                spaces -= 2;
                stars++;
            }
            System.out.println();
        }
    }
}
