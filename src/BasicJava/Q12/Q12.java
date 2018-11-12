package BasicJava.Q12;

import java.util.Scanner;

/**
 * https://www.w3resource.com/java-exercises/basic/index.php
 * 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
public class Q12 {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        System.out.print("Enter the 1st value: ");
        num1 = input.nextInt();

        System.out.print("Enter the 2nd value: ");
        num2 = input.nextInt();

        System.out.print("Enter the 3rd value: ");
        num3 = input.nextInt();

        int sum = (num1+num2+num3/3);

        System.out.println("The average of " + " " + num1 + " " +num2 + " " + num3 + " is " + sum);
    }
}
