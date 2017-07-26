package isbn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        String cleaninput = input.replaceAll("[^0-9Xx]", "");

        int kek = 0;
        int lel = 10;
        for (int i = 0; i < 10; i++) {
            if (cleaninput.charAt(i) == 'x' || cleaninput.charAt(i) == 'X') {
                kek += 10;
            } else {
                Character c = cleaninput.charAt(i);
                kek += Integer.parseInt(c.toString()) * lel;
            }
            lel--;
        }

        if (kek % 11 == 0) {
            System.out.println("Valid ISBN");
        } else {
            System.out.println("Invalid ISBN");
        }
    }

}
