package LEVEL_1.Basics_of_Programming.Getting_Started;

import java.util.Scanner;

/*
    1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
        2. Take as input n and k.
        3. Print the rotated number.
        4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
        n = 12340056
        k = 3
        r = 05612340
*/

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number...");
        int number = scanner.nextInt();
        System.out.println("Enter the Rotation...");
        int rotation = scanner.nextInt();
        int rotatedNumber = rotateNumber(number, rotation);
        System.out.println(rotatedNumber);
    }


    private static int rotateNumber(int number, int rotation) {
        int rotatedNumber = 0;
        int countDigit = (int) Math.log10(number) + 1;
        rotation = rotation % countDigit;
        if (rotation < 0) rotation += countDigit;
        int divisor = (int) Math.pow(10, rotation);
        int leftSide = number % divisor;
        int rightSide = number / divisor;

        rotatedNumber = leftSide * (int) Math.pow(10, countDigit - rotation) + rightSide;
        return rotatedNumber;
    }
}
