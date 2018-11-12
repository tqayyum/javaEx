package BasicJava.Q6;

/**
 * https://www.w3resource.com/java-exercises/basic/index.php
 * 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Q6 {
    public static void main(String[]args) {
        int num1 = 125;
        int num2 = 24;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiply: " + (num1 * num2));
        System.out.println("Divide: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
    }
}
