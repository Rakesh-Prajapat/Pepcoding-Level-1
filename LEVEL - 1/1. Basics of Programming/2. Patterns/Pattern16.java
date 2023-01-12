package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

    1												1
    1	2										2	1
    1	2	3								3	2	1
    1	2	3	4						4	3	2	1
    1	2	3	4	5				5	4	3	2	1
    1	2	3	4	5	6		6	5	4	3	2	1
    1	2	3	4	5	6	7	6	5	4	3	2	1
*/
public class Pattern16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int spaces = (number * 2) - 3;
        int stars = 1;

        for (int i = 0; i < number; i++) {
            int num = 1;
            for (int st = 0; st < stars; st++) {
                System.out.print(num + "\t");
                num++;
            }
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            for (int st = 0; st < stars; st++) {
                num--;
                if (num != number)
                    System.out.print(num + "\t");
            }
            spaces -= 2;
            stars++;
            System.out.println();
        }
    }
}
