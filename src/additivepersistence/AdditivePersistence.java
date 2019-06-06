package additivepersistence;

import java.util.Scanner;

public class AdditivePersistence {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        String num = new Scanner(System.in).nextLine();
        String digits = num;
        int z = 0;

        while (digits.length() != 1) {
            int p = 0;
            z++;
            for (int i = 0; i < digits.length(); i++) {
                Character c = digits.charAt(i);
                p += Integer.parseInt(c.toString());
            }
            digits = p + "";
        }

        System.out.println(num + " -> " + z);
    }

}
