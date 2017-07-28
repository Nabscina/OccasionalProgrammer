package atbash;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // I love HashMap.

        HashMap<String, String> bestmapever = new HashMap<String, String>() {
            {
                put("a", "z");
                put("b", "y");
                put("c", "x");
                put("d", "w");
                put("e", "v");
                put("f", "u");
                put("g", "t");
                put("h", "s");
                put("i", "r");
                put("j", "q");
                put("k", "p");
                put("l", "o");
                put("m", "n");
                put("n", "m");
                put("o", "l");
                put("p", "k");
                put("q", "j");
                put("r", "i");
                put("s", "h");
                put("t", "g");
                put("u", "f");
                put("v", "e");
                put("w", "d");
                put("x", "c");
                put("y", "b");
                put("z", "a");
            }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if (bestmapever.containsKey(c.toString().toLowerCase())) {
                output += bestmapever.get(c.toString().toLowerCase());
            } else {
                output += c;
            }
        }
        System.out.println("Output: " + output);
    }

}
