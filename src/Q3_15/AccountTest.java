/*
import java.util.Scanner;

// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects
public class AccountTest {

    public static void main(String[]args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        //display initial balance of each object
        displayAccount(account1.getName(), account1.getBalance());
        displayAccount(account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); //obtain user input
        //System.out.printf("%n Adding $%.2f to account1 balance%n%n",
        //       depositAmount);
        account1.deposit(depositAmount);// add to account's balance

        //display balances
        displayAccount(account1.getName(), account1.getBalance());
        displayAccount(account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");//prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%n Adding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount);//add to account2 balance

        //display balances
        displayAccount(account1.getName(), account1.getBalance());
        displayAccount(account2.getName(), account2.getBalance());
    }//end main

    public static void displayAccount(String name, double balance) {
        System.out.printf("%s balance: $%.2f %n", name, balance);
    }
}//end class AccountTest*/
