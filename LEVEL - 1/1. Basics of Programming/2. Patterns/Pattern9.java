package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

     *              *
        *       *
            *
        *       *
    *               *
*/
public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j || i + j == number - 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
