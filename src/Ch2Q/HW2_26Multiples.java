package Ch2Q;

import java.util.Scanner;

public class HW2_26Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter the 1st number: ");
        num1 = input.nextInt();

        System.out.print("Enter the 2nd number: ");
        num2 = input.nextInt();

        if ((num2%num1) == 0)
            System.out.print("The 1st number is multiple of the 2nd ");

        if ((num2%num1) != 0)
            System.out.print("The 1st number is not multiple of the 2nd ");
    }
}
