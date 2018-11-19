package BasicJava.Q29;

import java.util.Scanner;

/**
 * Write a Java program to convert a hexadecimal to a binary number. Go to the editor
 * Input Data:
 * Enter Hexadecimal Number : 37
 * Expected Output
 *
 * Equivalent Binary Number is: 110111
 */
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        String str = sc.next();

        int result = Integer.parseInt(str, 16);

        System.out.println("Equivalent Binary Number is: " + Integer.toBinaryString(result));
    }
}
