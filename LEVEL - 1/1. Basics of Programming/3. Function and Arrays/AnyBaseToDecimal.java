package function_and_arrays;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You are given a base b. n is a number on base b.
    3. You are required to convert the number n into its corresponding value in decimal number system.
*/
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();
        int convertedNumber = getValueInBase(number, base);
        System.out.println(convertedNumber);
    }

    public static int getValueInBase(int number, int base) {
        int converedNumber = 0;
        int pow = 0;

        while (number != 0) {
            int rem = number % 10;
            converedNumber += rem * (int) Math.pow(base, pow);
            pow++;
            number /= 10;
        }
        return converedNumber;
    }
}
