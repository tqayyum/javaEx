package Ch2Q;

public class HW2_31SquareCubes {
    public static void main(String[]args){
        int num0 = 0, num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5,
            num6 = 6, num7 = 7, num8 = 8, num9 = 9, num10 = 10;

        System.out.println("number");
        System.out.printf(" %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n",
                num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10);

        System.out.println("square");
        System.out.printf(" %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n",
                (num0 * num0),
                (num1 * num1),
                (num2 * num2),
                (num3 * num3),
                (num4 * num4),
                (num5 * num5),
                (num6 * num6),
                (num7 * num7),
                (num8 * num8),
                (num9 * num9),
                (num10 * num10));

        System.out.println("cube");
        System.out.printf(" %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n",
                (num0 * num0 * num0),
                (num1 * num1 * num1),
                (num2 * num2 * num2),
                (num3 * num3 * num3),
                (num4 * num4 * num4),
                (num5 * num5 * num5),
                (num6 * num6 * num6),
                (num7 * num7 * num7),
                (num8 * num8 * num8),
                (num9 * num9 * num9),
                (num10 * num10 * num10));
    }
}
