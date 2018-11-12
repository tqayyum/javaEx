package Fig6_7;

import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0, frequency2 = 0, frequency3 = 0, frequency4 = 0, frequency5 = 0, frequency6 = 0 ;

        for (int i = 1; i <= 600; i++) {
            int face = 1 + randomNumbers.nextInt(6);

            switch (face) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",
                frequency1, frequency2, frequency3, frequency4,
                frequency5, frequency6);
    }
}
