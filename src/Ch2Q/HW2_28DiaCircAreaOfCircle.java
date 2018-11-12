package Ch2Q;

import java.util.Scanner;

public class HW2_28DiaCircAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        double diameter = (2* radius);
        double circum = (Math.PI * 2 *radius);
        double area = (Math.PI * (radius * radius));


        System.out.printf("The diameter of the circle is %s%n", diameter);
        System.out.printf("The circumference of the circle is %s%n", circum);
        System.out.printf("The area of the circle is %s%n", area);
    }
}
