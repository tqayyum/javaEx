package Fig5_6.src;

public class CompoundInterest {
    public static void main(String[]args) {
     // formula a = p(1+r)n

     double principal = 1000.00;
     double rate = .05;
     double amount;
        System.out.printf("%s %20s %n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
