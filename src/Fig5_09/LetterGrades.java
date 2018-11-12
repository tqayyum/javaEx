package Fig5_09;

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[]args){
        int total = 0, gradeCounter = 0, aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;
            switch (grade / 10) {
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            } //End of Switch
        } //End of while

        System.out.printf("%nGrade Report:%n");

        if (gradeCounter !=0) {
            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", aCount, // display number of A grades
                    "B: ", bCount, // display number of B grades
                    "C: ", cCount, // display number of C grades
                    "D: ", dCount, // display number of D grades
                    "F: ", fCount); // display number of F grades
        } // End of If statement
        else {
            System.out.println("No grades were entered");
        }
    } //End of Method
} //End of class
