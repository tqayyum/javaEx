import java.util.Scanner;

/**
 * Drivers are concerned with the mileage their automobiles get.
 * One driver has kept track of several trips by recording the
 * miles driven and gallons used for each tankful.
 * Develop a Java application that will input the miles driven
 * and gallons used (both as integers) for each trip.
 *
 * The program should calculate and display the miles per gallon
 * obtained for each trip and print the combined miles per gallon
 * obtained for all trips up to this point.
 * All averaging calculations should produce floating-point results.
 * Use class Scanner and sentinel-controlled repetition to obtain the data from the user.
 */
public class Q4_17GasMileage {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int totalM = 0;
        int tripCounter = 1;

        System.out.print("Enter the miles driven or -1 to quit: ");
        int mPG = input.nextInt();

        while(mPG != -1) {
            System.out.print("Enter the miles driven or -1 to quit: ");
            mPG = input.nextInt();

            totalM = totalM + mPG;

            tripCounter++;
        }
        if (tripCounter !=0) {
            //double average = (double) (totalM / tripCounter);
            //System.out.println(average);
            System.out.println(totalM);
        }
    }
}
