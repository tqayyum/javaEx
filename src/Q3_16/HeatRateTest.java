import java.util.Scanner;

public class HeatRateTest {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        HeartRates fName = new HeartRates();
        HeartRates lName = new HeartRates();

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        fName.setfName(firstName);

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        lName.setlName(lastName);

        System.out.printf("First Name is: %s%n",
                fName.getfName());
        System.out.printf("Last name is: %s%n",
                lName.getlName());
    }
}
