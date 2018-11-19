package BasicJava.Q25;

import java.util.Scanner;

/**
 * 25. Write a Java program to convert a octal number to a decimal number. Go to the editor
 * Input Data:
 * Input any octal number: 10
 * Expected Output
 * Equivalent decimal number: 8
 */

public class Q25 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String num = sc.next();

        int result = Integer.parseInt(num, 8);
        Integer.toOctalString(result);

        System.out.println("Octal number: " + result);

    }
}
