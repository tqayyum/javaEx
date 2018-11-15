package BasicJava.Q20;

import java.util.Scanner;

/**
 * 20. Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
 * Input Data:
 * Input a decimal number: 15
 * Expected Output
 *
 * Hexadecimal number is : F
 */
public class Q20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a value: ");
        num = sc.nextInt();

        System.out.println(Integer.toHexString(num));
    }
}
