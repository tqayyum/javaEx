package BasicJava.Q28;

import java.util.Scanner;

/**
 * 28. Write a Java program to convert a hexadecimal to a decimal number. Go to the editor
 * Input Data:
 * Input a hexadecimal number: 25
 * Expected Output
 *
 * Equivalent decimal number is: 37
 */

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        String num = sc.next();

        int result = Integer.parseInt(num, 16);

        System.out.println("Equivalent decimal number is: " + result);
    }
}
