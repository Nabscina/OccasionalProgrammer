package rovarspraket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        String consonants = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ";
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if (consonants.contains(c.toString())) {
                output += c + "o" + c.toString().toLowerCase();
            } else {
                output += c;
            }
        }
        System.out.println(output);

    }

}
