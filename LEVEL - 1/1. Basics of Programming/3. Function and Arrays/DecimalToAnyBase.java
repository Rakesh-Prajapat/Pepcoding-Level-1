package function_and_arrays;

import java.util.Scanner;

/*
    1. You are given a decimal number n.
    2. You are given a base b.
    3. You are required to convert the number n into its corresponding value in base b.
*/
public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();
        int convertedNumber = getValueInBase(number, base);
        System.out.println(convertedNumber);
    }

    public static int getValueInBase(int number, int base) {
        int converedNumber = 0;
        int mul = 1;

        while (number != 0) {
            int rem = number % base;
            converedNumber = converedNumber + rem * mul;
            mul *= 10;
            number /= base;
        }
        return converedNumber;
    }
}
