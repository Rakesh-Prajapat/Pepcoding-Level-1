package function_and_arrays;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You are given a base b1. n is a number on base b.
    3. You are given another base b2.
    4. You are required to convert the number n of base b1 to a number in base b2.
*/
public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sourceBase = scanner.nextInt();
        int destBase = scanner.nextInt();

        int decimalBase = sourceBaseToDecimalBase(number, sourceBase);
        int destinationBase = decimalToDestBase(decimalBase, destBase);
        System.out.println(decimalBase);
        System.out.println(destinationBase);
    }

    private static int sourceBaseToDecimalBase(int number, int sourceBase) {
        int convertedNumber = 0;
        int pow = 0;

        while (number != 0) {
            int rem = number % 10;
            convertedNumber += rem * (int) Math.pow(sourceBase, pow);
            pow++;
            number /= 10;
        }
        return convertedNumber;
    }

    private static int decimalToDestBase(int number, int destBase) {
        int convertedNumber = 0;
        int pow = 0;

        while (number != 0) {
            int rem = number % destBase;
            convertedNumber += rem * (int) Math.pow(10, pow);
            pow++;
            number /= destBase;
        }
        return convertedNumber;
    }
}

