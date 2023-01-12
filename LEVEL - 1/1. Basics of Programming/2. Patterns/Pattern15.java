package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

         		1
        	2	3	2
        3	4	5	4	3
	        2	3	2
		        1
*/
public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int stars = 1;
        int spaces = number / 2;
        int value = 1;

        for (int i = 0; i < number; i++) {
            int val = value;
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            for (int st = 0; st < stars; st++) {
                System.out.print(val + "\t");
                if (st < stars / 2) {
                    val++;
                } else {
                    val--;
                }
            }
            if (i < number / 2) {
                stars += 2;
                spaces--;
                value++;
            } else {
                spaces++;
                stars -= 2;
                value--;
            }
            System.out.println();
        }
    }
}
