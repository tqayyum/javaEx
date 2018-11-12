package BasicJava.Misc.P_FizzBuzz;

import java.util.Scanner;

public class FuzzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = sc.nextInt();

        if (value % 15 == 0 ) {
            System.out.println("Value " + value + " FizzBuzz");
        } if (value % 3 == 0 ) {
            System.out.println("Value " + value + " Fizz");
        } else if (value % 5 == 0 ) {
            System.out.println("Value " + value + " Buzz");
        } else
            System.out.println("Value " + value + " is not divisible by 3 or 5");
        }
}
