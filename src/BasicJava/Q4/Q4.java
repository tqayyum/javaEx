package BasicJava.Q4;

/**
 * https://www.w3resource.com/java-exercises/basic/index.php
 * 4. Write a Java program to print the result of the following operations. Go to the editor
 * Test Data:
 * a. -5 + 8 * 6
 * b. (55+9) % 9
 * c. 20 + -3*5 / 8
 * d. 5 + 15 / 3 * 2 - 8 % 3
 * Expected Output :
 * 43
 * 1
 * 19
 * 13
 */
public class Q4 {
    public static void main(String[]args) {
        System.out.println("a. " + (-5 + 8 * 6));
        System.out.println("b. " + (55+9)%9);
        System.out.println("c. " + (20 + -3 * 5 / 8));
        System.out.println("d. " + (5 + 15 / 3 * 2 - 8 % 3));
    }
}
