package Patterns;

import java.util.Scanner;

/*
    1. You are given a number n.
    2. You've to create a pattern of * and separated by tab as shown below.

         	*
	    	*	*
    *	*	*	*	*
	    	*	*
		    *
*/
public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int stars = 1;
        int spaces = number / 2;

        for (int i = 0; i < number; i++) {
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            for (int st = 0; st < stars; st++) {
                if (st < stars / 2 && i != number / 2)
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }
            if (i < number / 2) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
            System.out.println();
        }
    }
}
