package Fig5_7.src;

public class Fig5_7DoWhile {
    public static void main(String[]args) {
        int counter = 1;

        do {
            System.out.printf("%d", counter);
            ++counter;
        } while (counter <= 10);
        System.out.println();
    }
}
