import java.util.Scanner;

/*
     1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
     2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
     3. Take input "num1" and "num2" as the two numbers.
     4. Print their GCD and LCM.
*/
public class GcdLcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int[] gcdLcm = gcdLcm(firstNumber, secondNumber);
        System.out.println(gcdLcm[0]);
        System.out.println(gcdLcm[1]);
    }

    private static int[] gcdLcm(int firstNumber, int secondNumber) {
        int div1 = firstNumber;
        int div2 = secondNumber;
        int[] gcdLcm = new int[2];

        while (div1 % div2 > 0) {
            int rem = div1 % div2;
            div1 = div2;
            div2 = rem;
        }
        gcdLcm[0] = div2;
        gcdLcm[1] = (firstNumber * secondNumber) / div2;

        return gcdLcm;
    }
}
