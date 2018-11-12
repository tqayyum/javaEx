package Ch2Q;

import java.util.Scanner;

public class HW2_24LargestSmallest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5;

        System.out.print("Enter the 1st number: ");
        num1 = input.nextInt();

        System.out.print("Enter the 2nd number: ");
        num2 = input.nextInt();

        System.out.print("Enter the 3rd number: ");
        num3 = input.nextInt();

        System.out.print("Enter the 4th number: ");
        num4 = input.nextInt();

        System.out.print("Enter the 5th number: ");
        num5 = input.nextInt();

        if (num1>num2 && num1>num3 && num1>num4 && num1>num5)
            System.out.printf("The largest number is %d%n", num1);

        if (num2>num1 && num2>num3 && num2>num4 && num2>num5)
            System.out.printf("The largest number is %d%n", num2);

        if(num3>num1 && num3>num2 && num3>num4 && num3>num5)
            System.out.printf("The largest number is %d%n", num3);

        if(num4>num1 && num4>num2 && num4>num3 && num4>num5)
            System.out.printf("The largest number is %d%n", num4);

        if(num5>num1 && num5>num2 && num5>num3 && num5>num4)
            System.out.printf("The largest number is %d%n", num5);

    }
}
