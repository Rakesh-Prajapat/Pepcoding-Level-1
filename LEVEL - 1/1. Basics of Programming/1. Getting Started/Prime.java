package LEVEL_1.Basics_of_Programming.Getting_Started;

import java.util.Scanner;
/* 
    1. You've to check whether a given number is prime or not.
    2. Take a number "t" as input representing count of input numbers to be tested.
    3. Take a number "n" as input "t" number of times.
    4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
*/

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers to be tested as prime or not...");
        int numbersToBeTested = scanner.nextInt();
        System.out.println("Enter " + numbersToBeTested + " Numbers...");
        int[] numbersArray = new int[numbersToBeTested];
        for (int i = 0; i < numbersToBeTested; i++) {
            numbersArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbersArray.length; i++) {
            if (isPrime(numbersArray[i])) {
                System.out.println(numbersArray[i] + " is prime number");
            } else {
                System.out.println(numbersArray[i] + " is not a prime number");
            }
        }
        scanner.close();
    }

    private static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int div = 2; div * div <= number; div++) {
            if (number % div == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
