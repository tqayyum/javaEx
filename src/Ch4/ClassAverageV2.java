import java.util.Scanner;

/**
 * Initialize total to zero - done
 * Initialize counter to zero - done
 * Prompt the user to enter the first grade - done
 * Input the first grade (possibly the sentinel) - done
 *
 * While the user has not yet entered the sentinel Add this grade into the running total
 * Add one to the grade counter
 * Prompt the user to enter the next grade Input the next grade (possibly the sentinel)
 *
 * If the counter is not equal to zero
 * Set the average to the total divided by the counter Print the average
 * else
 * Print “No grades were entered”
 */
public class ClassAverageV2 {
    public static void main(String[] args) {
        int total = 0; //Initialize total to zero
        int gradeCounter = 0; //Initialize counter to zero
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the grade or -1 to quit: "); //Prompt the user
        int grade = input.nextInt(); //Input grade (possibly the sentinel)

        while (grade != -1) {
            total = (total + grade);
            gradeCounter++;
            System.out.print("Enter the grade or -1 to quit: "); //Prompt the user
            grade = input.nextInt();
        }
        if (gradeCounter !=0) {
            double average = (double) total/gradeCounter;

            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
             System.out.printf("Class average is %.2f%n", average);
        }
         else { // no grades were entered, so output appropriate message
         System.out.println("No grades were entered");
        }

    }
}
