package BasicJava.Q24;

import java.util.Scanner;

/**
 * 24. Write a Java program to convert a binary number to a Octal number. Go to the editor
 * Input Data:
 * Input a Binary Number: 111
 * Expected Output
 *
 * Octal number: 7
 */

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        String num = sc.next();

        int result = Integer.parseInt(num, 2);
        Integer.toOctalString(result);
        System.out.println("Octal number: " + result);
    }
}
