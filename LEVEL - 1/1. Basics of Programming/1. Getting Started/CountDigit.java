package LEVEL_1.Basics_of_Programming.Getting_Started;

import java.util.Scanner;

/*
      1. You've to count the number of digits in a number.
      2. Take as input "n", the number for which the digits has to be counted.
      3. Print the digits in that number.
*/
public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to find count of digits...");
        int number = scanner.nextInt();

        int countDigit = (int) Math.log10(number) + 1;
        System.out.println(countDigit);
    }
}