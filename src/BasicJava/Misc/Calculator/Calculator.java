package BasicJava.Misc.Calculator;

import java.util.Scanner;

/**
 * Calculator Assignment
 * In this Program you are making a simple calculator that performs
 * addition, subtraction, multiplication and division
 * based on the user input.
 * The program takes the value of both the numbers (entered by user)
 * and then user is asked to enter the operation (+, -, * and /),
 * based on the input program performs the selected operation on the entered numbers using switch case.
 * user can perform operation on as many literals number values they wish until they select (=)
 * operator which calculates total value
 */

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, num2, result = 0;
        String operators;

        System.out.print("Enter a value: ");
        num = sc.nextInt();

        System.out.print("Enter in an operator: +, -, *, / or = to get total: ");
        operators = sc.next();

        while (!operators.equals("=")) {

            System.out.print("Enter a value: ");
            num2 = sc.nextInt();

            switch (operators) {

                case "+":
                    result = num + num2;

                case "-":
                    result = num - num2;
                    break;

                case "*":
                    result = num * num2;
                    break;

                case "/":
                    result = num / num2;
                    break;

                default:
                    System.out.println("Illegal Operation");
                    break;
            }

            System.out.print("Enter in an operator: +, -, *, / or = to get total: ");
            operators = sc.next();
            num = result;
            }
        System.out.println(result);
    }
}
