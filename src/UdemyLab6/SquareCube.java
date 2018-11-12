package UdemyLab6;

public class SquareCube {
    public static void main(String[] args) {

        int i = 0, square, cube;

        while (i <= 9) {

            square = (i * i);

            if ((i % 2) == 0 ) {
                cube = (i * i * i);
                System.out.println("Number is: " + i + " the square root is " + square + " and cube of " + cube);
            } else {
                System.out.println("Number is: " + i + " the square root is " + square);
            }
            i++;
        }
    }
}
