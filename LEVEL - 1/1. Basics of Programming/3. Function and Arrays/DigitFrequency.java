package function_and_arrays;

import java.util.Scanner;
/*
    1. You are given a number n.
    2. You are given a digit d.
    3. You are required to calculate the frequency of digit d in number n.

    Constraints: 0 <= n <= 10^9
                 0 <= d <= 9

    Sample Input: 994543234
                  4

    Sample Output: 3
*/

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int digit = scn.nextInt();

        int frequency = getDigitFrequency(number, digit);
        System.out.println(frequency);
    }

    public static int getDigitFrequency(int number, int digit) {
        int count = 0;
        while (number > 0) {
            int rem = number % 10;
            if (rem == digit)
                count++;
            number /= 10;
        }
        return count;
    }
}