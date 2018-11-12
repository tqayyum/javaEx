package Ch2Q;

import java.util.Scanner;

public class HW2_15Arithmetic {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter the 1st number: ");
        num1 = input.nextInt();

        System.out.print("Enter the 2nd number: ");
        num2 = input.nextInt();

        System.out.printf("The sum is %d%n", (num1 + num2));
        System.out.printf("The product is %d%n", (num1 * num2));
        System.out.printf("The difference is %d%n", (num1 - num2));
        System.out.printf("The quotient is %d%n", (num1 / num2));
    }
}
