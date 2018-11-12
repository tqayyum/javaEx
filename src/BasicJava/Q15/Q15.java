package BasicJava.Q15;

import java.util.Scanner;

/**
 * https://www.w3resource.com/java-exercises/basic/index.php
 * 15. Write a Java program to swap two variables.
 */
public class Q15 {
    public static void main(String[]args) {
        String temp, x, y;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value 1 to be switched: ");
        x = input.nextLine();
        System.out.print("Enter value 2 to be switched: ");
        y = input.nextLine();

        temp = x;
        x = y;
        y = temp;

        System.out.println("The first entered value is " + y + " The second entered value is " + x);
        System.out.println("The reverse order is " + x + " and " + y);
    }
}
