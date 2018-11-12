import java.util.Scanner;

/**
 * Initialize passes to zero
 * Initialize failures to zero
 * Initialize student counter to one
 *
 * While student counter is less than or equal to 10
 * Prompt the user to enter the next exam result
 * Input the next exam result
 *
 * If the student passed
 * Add one to passes
 * Else
 * Add one to failures
 *
 * Add one to student counter
 *
 * Print the number of passes
 *
 * Print the number of failures
 * If more than eight students passed Print “Bonus to instructor!”
 */
public class Analysis {

    public static void main(String[]args){
        int passes = 0; //Initialize passes to zero
        int failures = 0; //Initialize failures to zero
        int studentCounter = 1; //Initialize student counter to one

        Scanner input = new Scanner(System.in);

        while (studentCounter <= 10) { //While student counter is less than or equal to 10
            System.out.print("Enter result (1 = pass, 2 = fail): "); //Prompt the user to enter the next exam result
            int result = input.nextInt();

            if (result == 1) {
                passes++;
            } else {
                failures++;
            }
            studentCounter++;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes >= 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
