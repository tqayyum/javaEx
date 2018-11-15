package BasicJava.Q22;

import java.util.Scanner;

/**
 * 22. Write a Java program to convert a binary number to decimal number. Go to the editor
 * Input Data:
 * Input a binary number: 100
 * Expected Output
 *
 * Decimal Number: 4
 */
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        String num = sc.next();

        System.out.println("Decimal Number: " + Integer.parseInt( num, 2));
    }
}
