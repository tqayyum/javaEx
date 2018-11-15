package BasicJava.Q23;

import java.util.Scanner;

/**
 * 23. Write a Java program to convert a binary number to hexadecimal number. Go to the editor
 * Input Data:
 * Input a Binary Number: 1101
 * Expected Output
 *
 * HexaDecimal value: D
 */

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int num = sc.nextInt();

        String hexStr = Integer.toString(num, 16);

        System.out.println("HexaDecimal value: " + hexStr);
    }
}
