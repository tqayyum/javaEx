package UdemyLab6;

public class Fib {
    public static void main(String[] args) {

        int f0  = 0;
        int f1  = 1;

        System.out.println("0:\t" + f0);
        System.out.println("1:\t" + f1);

        for (int i = 2; i <= 20; i++) {

            int sum = f0 + f1;
            f0 = f1;
            f1 = sum;

            System.out.println(i + ":\t" + sum);
        }
    }
}
