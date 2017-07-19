package gameofthrees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input (32-bit integer): ");
        int input = Integer.parseInt(sc.nextLine());

        int i = input;
        while (i > 1) {
            if (i % 3 == 0) {
                System.out.println(i + " 0");
                i /= 3;
            } else if ((i - 1) % 3 == 0) {
                System.out.println(i + " -1");
                i = (i - 1) / 3;
            } else {
                System.out.println(i + " 1");
                i = (i + 1) / 3;
            }
        }
        System.out.println(i);
    }

}
