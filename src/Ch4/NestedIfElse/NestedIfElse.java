package Ch4.NestedIfElse;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student grade: ");
        int studentGrade;
        studentGrade = input.nextInt();

        if (studentGrade >= 90) { //If student’s grade is greater than or equal to 90
            System.out.println("A"); //Print “A” else
        } else if (studentGrade >= 80) { //If student’s grade is greater than or equal to 80
            System.out.println("B"); //Print “B” else
        } else if (studentGrade >= 70) { //If student’s grade is greater than or equal to 70
            System.out.println("C"); //Print “C” else
        } else if (studentGrade >= 60) { //If student’s grade is greater than or equal to 60
            System.out.println("D"); // else Print "D"
        } else {
            System.out.println("F"); //Print "F"
        }
    }
}
