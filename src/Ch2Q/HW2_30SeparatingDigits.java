package Ch2Q;

import java.util.Scanner;

public class HW2_30SeparatingDigits {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Enter the number value: ");
        n = input.nextInt();

        int num5 = (n/10000);
        int num4 = ((n - num5 * 10000)/1000);
        int num3 = ((n - ((num5 * 10000) + (num4 * 1000)))/100);
        int num2 = ((n - ((num5 * 10000) + (num4 * 1000) + (num3 * 100 )))/10);
        int num1 = ((n - ((num5 * 10000) + (num4 * 1000) + (num3 * 100 ) + (num2 * 10)))/1);


        System.out.printf("%d %d %d %d %d", num5, num4, num3, num2, num1);
    }
}
