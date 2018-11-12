package BasicJava.Misc.While;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        //Instance of scanner
        Scanner scan = new Scanner(System.in);
        //Setting up number student school can enroll
        int studentCapacity = 10;
        //setting up the count
        int i = 0;
        //creating while statement to to enroll students until max number is reached
        while (i < studentCapacity) {
            //reseting the count within the loop so the count is updated
            int updatedStudentCapacity = studentCapacity - i;
//            //console lets user know how reminder number if students they can enroll
            System.out.println("You can enroll " + updatedStudentCapacity + " more Student");
            //simple message to instruct user to enter student name
            System.out.println("Please enter Students Name");
            //scanner takes the input from user and displays it on console
            System.out.println(scan.nextLine());
            //if count reaches to 9 which is 10 - 1 since count mostly starts with 0 in loops
            if(i == 9) {
                System.out.println("You have reached maximum number of student for this class");
                System.out.println("No more enrollment until next semester");
            }
            //while loop incremented by one using post increment concept
            i++;
        }
    }
}
