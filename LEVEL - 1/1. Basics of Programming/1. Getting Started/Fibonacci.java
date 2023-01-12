package LEVEL_1.Basics_of_Programming.Getting_Started;

import java.util.Scanner;
/*
    1. You've to print first n fibonacci numbers.
    2. Take as input "n", the count of fibonacci numbers to print.
    3. Print first n fibonacci numbers.
*/

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number tp print Fibonacci Sequence...");
        int number = scanner.nextInt();
        printFibonacciSeries(number);
    }

    public static void printFibonacciSeries(int number) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < number; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}