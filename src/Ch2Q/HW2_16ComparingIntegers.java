package Ch2Q;

import java.util.Scanner;

public class HW2_16ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter the 1st number: ");
        num1 = input.nextInt();

        System.out.print("Enter the 2nd number: ");
        num2 = input.nextInt();

        if (num1 > num2)
            System.out.printf("Is larger %d%n", num1);

        if (num2 > num1)
            System.out.printf("Is larger %d%n", num2);

        if (num1 == num2)
            System.out.println("These numbers are equal");

    }
}
