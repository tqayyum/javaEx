package Ch2Q;

import java.util.Scanner;

public class HW2_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.print("Enter the x number: ");
        x = input.nextInt();

        System.out.print("Enter the y number: ");
        y = input.nextInt();

        System.out.print("Enter the z number: ");
        z = input.nextByte();

        result = (x + y + z);
        System.out.printf("Product is %s%n", result);
    }
}
