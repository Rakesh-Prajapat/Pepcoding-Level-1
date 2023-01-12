import java.util.Scanner;

/*
    1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.
*/
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printPrimeFactorization(number);
    }

    private static void printPrimeFactorization(int number) {
        for (int div = 2; div * div <= number; div++) {
            while (number % div == 0) {
                System.out.print(div + " ");
                number /= div;

            }
        }
        if (number != 1) {
            System.out.println(number);
        }
    }
}
