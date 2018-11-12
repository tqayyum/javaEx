import java.util.Scanner;

/**
 * Set total to zero
 * Set grade counter to one
 *
 * While grade counter is less than or equal to ten
 * Prompt the user to enter the next grade Input the next grade
 * Add the grade into the total
 * Add one to the grade counter
 *
 * Set the class average to the total divided by ten
 * Print the class average
 */
public class ClassAverage {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int i = 1;

        while (i <= 10) { // loop 10 times
            System.out.print("Enter grade: "); // prompt
            int grade = input.nextInt(); // input next grade
            total = (total + grade); // add grade to total
            i++; // increment counter by 1
        }
        int average = total / 10; // integer division yields integer result
        System.out.println(total/10);
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
}
