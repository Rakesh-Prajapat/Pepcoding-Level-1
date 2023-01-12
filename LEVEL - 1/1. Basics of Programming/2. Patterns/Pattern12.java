package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

    0
    1	1
    2	3	5
    8	13	21	34
    55	89	144	233	377
*/
public class Pattern12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit = 1;
        int a = 0;
        int b = 1;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < digit; j++) {
                System.out.print(a + "\t");
                int count = a + b;
                a = b;
                b = count;
            }
            System.out.println();
            digit++;
        }
    }
}
