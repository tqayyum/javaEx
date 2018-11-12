package BasicJava.Q17;

/**
 * 17. Write a Java program to add two binary numbers. Go to the editor
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output
 *
 * Sum of two binary numbers: 101
 */
public class Q17 {

    public static void main(String[] args) {
        String input1 = "110010";
        String input2 = "110011";

        int num1 = Integer.parseInt(input1, 2);
        int num2 = Integer.parseInt(input2, 2);

        int sum = num1 + num2;

        System.out.println("Sum of two binary numbers: " + sum);
    }
}
