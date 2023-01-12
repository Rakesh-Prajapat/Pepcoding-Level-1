package LEVEL_1.Basics_of_Programming.Getting_Started;

import java.util.Scanner;

/*
    1. You've to display the digits of a number.
    2. Take as input "n", the number for which digits have to be displayed.
    3. Print the digits of the number line-wise.
*/

public class DigitOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to print its Digits...");
        int number = scanner.nextInt();
        printDigitOfNumber(number);
    }

    private static void printDigitOfNumber(int number) {

        int countDigit = (int) Math.log10(number) + 1;
        int divisor = (int) Math.pow(10, countDigit - 1);

        while (divisor > 0) {
            int digitToPrint = number / divisor;
            System.out.println(digitToPrint);
            number %= divisor;
            divisor /= 10;
        }
    }
}
