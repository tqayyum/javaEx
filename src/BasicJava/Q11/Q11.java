package BasicJava.Q11;

/**
 * https://www.w3resource.com/java-exercises/basic/index.php
 * 11. Write a Java program to print the area and perimeter of a circle. Go to the editor
 * Test Data:
 * Radius = 7.5
 * Expected Output
 * Perimeter is = 47.12388980384689
 * Area is = 176.71458676442586
 */
public class Q11 {
    public static void main(String[]args){
        double radius = 7.5;
        double area = Math.PI*(radius*radius);
        double perimeter = 2*Math.PI*radius;

        System.out.println("The perimeter of a circle is " + perimeter);
        System.out.println("The area of a circle is " + area);
        System.out.println(Math.PI);
    }
}
