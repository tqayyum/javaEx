package Fig5_5.src;

public class Fig5_5 {
    public static void main(String[]args) {
        int total = 0;
        for (int number = 2; number <=20 ; number+=2) {
            total += number;
            System.out.printf("Sum is %d%n", total);
        }
    }
}
