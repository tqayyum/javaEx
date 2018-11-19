package BasicJava.Q26;

import java.util.Scanner;

/**
 * 26. Write a Java program to convert a octal number to a binary number. Go to the editor
 * Input Data:
 * Input any octal number: 7
 * Expected Output
 *
 * Equivalent binary number: 111
 */
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int num = sc.nextInt();

        System.out.println("Equivalent binary number: " + Integer.toBinaryString(num));

    }
}
