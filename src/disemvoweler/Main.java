package disemvoweler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input:");
        String input = sc.nextLine();

        String output1 = "";
        String output2 = "";

        System.out.println("Output:");
        
        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if (!c.toString().matches("[aeiou ]")) {
                output1 += c;
            } else {
                output2 += c.toString().trim();
            }
        }

        System.out.println(output1 + "\n" + output2);
    }

}
