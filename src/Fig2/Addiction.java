package Fig2;// Fig. 2.7: Adidtion.java
// Addition program that inputs two numbers then displays their sum.
import java.util.Scanner;

public class Addiction
{
    //main method begins execution of java application
    public static void main(String[] args)
    {
        //create a scanner to obation inout from the command window
        Scanner input = new Scanner(System.in);

        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2

        System.out.print("Enter first integer: "); //Prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); //Prompt
        number2 = input.nextInt(); // read second number from user

        sum = number1 + number2; // add numbers, then stores total in sum

        System.out.printf("Sum is %d%n", sum); // display sum
    } //end method
} // end class Addition
