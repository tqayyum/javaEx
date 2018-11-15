package BasicJava.Q19;

import java.util.Scanner;

/**
 * 19. Write a Java program to convert a decimal number to binary number. Go to the editor
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */

public class Q19 {
    public static void main(String [] args) {
        double num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        num = sc.nextDouble();

        System.out.println(Long.toBinaryString(Double.doubleToLongBits(num)));
    }
}
