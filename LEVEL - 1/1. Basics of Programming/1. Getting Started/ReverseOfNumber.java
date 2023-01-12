package LEVEL_1.Basics_of_Programming.Getting_Started;

import java.util.Scanner;

/*
    1. You've to display the digits of a number in reverse.
    2. Take as input "n", the number for which digits have to be displayed in reverse.
    3. Print the digits of the number line-wise, but in reverse order.
*/

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number...");
        int number = scanner.nextInt();
        printReverseNumber(number);
    }

    private static void printReverseNumber(int number) {
        while (number > 0) {
            int digitToBePrint = number % 10;
            System.out.println(digitToBePrint);
            number /= 10;
        }
    }
}

