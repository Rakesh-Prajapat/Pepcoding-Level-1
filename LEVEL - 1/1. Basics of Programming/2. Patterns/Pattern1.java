package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

    *
    * *
    * * *
    * * * *
    * * * * *
*/
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int stars = 1;
        int spaces = n - stars;

        for (int i = 0; i < n; i++) {
            for (int st = 0; st < stars; st++) {
                System.out.print("*\t");
            }
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            stars++;
            spaces--;
            System.out.println();
        }
    }
}
