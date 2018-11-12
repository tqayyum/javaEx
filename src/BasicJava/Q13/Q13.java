package BasicJava.Q13;

/**
 * https://www.w3resource.com/java-exercises/basic/index.php
 * 13. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 */

public class Q13 {
    public static void main(String[]args) {
        double width = 5.6, height = 8.5;
        double area = (width * height);
        double perimeter = 2*(width + height);

        System.out.printf("The area of a rectangle is %.2f%n", area);
        System.out.printf("The perimeter of a rectangle is %.2f%n", perimeter);
    }
}
