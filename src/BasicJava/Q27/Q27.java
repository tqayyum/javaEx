package BasicJava.Q27;

import java.util.Scanner;

/**
 * 27. Write a Java program to convert a octal number to a hexadecimal number. Go to the editor
 * Input Data:
 * Input a octal number : 100
 * Expected Output
 *
 * Equivalent hexadecimal number: 40
 */

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        String num = sc.next();

        int result = Integer.parseInt(num, 8);

        System.out.println("Equivalent hexadecimal number: " + Integer.toHexString(result));
    }
}
