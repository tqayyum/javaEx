package Ch2Q;

import java.util.Scanner;

public class HW2_25EvenOdd {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.print("Enter the 1st number: ");
        num1 = input.nextInt();

        if ((num1%2 == 0))
            System.out.println("Even");

        if ((num1%2 != 0))
            System.out.println("Odd");
    }
}
