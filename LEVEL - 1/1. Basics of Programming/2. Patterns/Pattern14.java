package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

    3 * 1 = 3
    3 * 2 = 6
    3 * 3 = 9
    3 * 4 = 12
    3 * 5 = 15
    3 * 6 = 18
    3 * 7 = 21
    3 * 8 = 24
    3 * 9 = 27
    3 * 10 = 30
*/
public class Pattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(number + " * " + counter + " = " + number * counter);
        }
    }
}
