package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

    *
       *
          *
             *
                *
*/
public class Pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int stars = 1;
        int spaces = 0;

        for (int i = 0; i < number; i++) {
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            System.out.print("*");
            spaces++;
            System.out.println();
        }
    }
}
