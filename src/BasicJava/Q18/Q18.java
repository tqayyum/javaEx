package BasicJava.Q18;

/**
 * 18. Write a Java program to multiply two binary numbers. Go to the editor
 * Input Data:
 * Input the first binary number: 10
 * Input the second binary number: 11
 * Expected Output
 *
 * Product of two binary numbers: 110
 */

public class Q18 {
    public static  void main(String[] args) {
        String input1 = "110010";
        String input2 = "110011";

        int num1 = Integer.parseInt(input1, 2);
        int num2 = Integer.parseInt(input2, 2);

        int sum = num1 + num2;

        System.out.println("Product of two binary numbers: 110" + sum);

    }
}
