package BasicJava.Q21;

/**
 * 21. Write a Java program to convert a decimal number to octal number. Go to the editor
 * Input Data:
 * Input a Decimal Number: 15
 * Expected Output
 *
 * Octal number is: 17
 */

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value: ");
        int num = sc.nextInt();
        String str = Integer.toOctalString(num);

        System.out.println("Octal number is: " + str);
    }
}
