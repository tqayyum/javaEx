package Ch2Q;

import java.util.Scanner;

public class HW2_17ArithmeticSmallestLargest {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int sum;
        int avg;

        System.out.print("Enter 1st number: ");
        num1 = input.nextInt();

        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();

        System.out.print("Enter 3rd number: ");
        num3 = input.nextInt();

        sum = (num1 + num2 + num3);
        avg = ((num1 + num2 + num3)/3);

        System.out.printf("The sum is %d%n", sum);

        System.out.printf("The average is %d%n", avg);

        if (sum > avg)
        System.out.println("The average is greater than sum");

        if (sum > avg)
        System.out.println("The sum is smaller than the average");
    }
}
