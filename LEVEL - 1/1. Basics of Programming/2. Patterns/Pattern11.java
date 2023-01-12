package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
*/
public class Pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit = 1;
        int count = 1;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < digit; j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
            digit++;
        }
    }
}
