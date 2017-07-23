package reversefactorial;

import java.util.Scanner;

public class Main {

    public static int lol;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int input = Integer.parseInt(scanner.nextLine());

        if (reverse_factorial(input, 2)) {
            System.out.println(input + " = " + lol + "!");
        } else {
            System.out.println("NONE");
        }
    }

    public static boolean reverse_factorial(double input, int i) {

        double kek = input / i;

        if (kek == 1.0) {
            lol = i;
            return true;
        } else if (kek < 1) {
            return false;
        }

        return reverse_factorial(kek, i + 1);
    }

}
