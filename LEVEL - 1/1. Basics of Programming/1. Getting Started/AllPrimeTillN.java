package LEVEL_1.Basics_of_Programming.Getting_Started;

import java.util.Scanner;

/* 
    1. You've to print all prime numbers between a range. 
    2. Take as input "low", the lower limit of range.
    3. Take as input "high", the higher limit of range.
    4. For the range print all the primes numbers between low and high (both included).
*/
public class AllPrimeTillN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit...");
        int low = scanner.nextInt();
        System.out.println("Enter the higher limit...");
        int high = scanner.nextInt();

        System.out.println("All Prime Number Between " + low + " to " + high);
        for (int number = low; number <= high; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
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