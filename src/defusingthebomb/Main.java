package defusingthebomb;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> wires = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sequence of wires, type \"done\" once finished:");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("done")) {
                break;
            } else {
                wires.add(input);
            }
        }

        boolean boomd = false;
        for (int i = 0; i < wires.size() - 1; i++) {
            if (boom(wires.get(i), wires.get(i + 1))) {
                boomd = true;
            }
        }

        if (boomd && wires.size() != 1) {
            System.out.println("Boom");
        } else if (!boomd && wires.size() == 1 && (wires.get(0).equals("red") || wires.get(0).equals("orange") || wires.get(0).equals("green"))) {
            System.out.println("Boom");
        } else {
            System.out.println("Bomb defused");
        }
    }

    public static boolean boom(String color1, String color2) {

        if (color1.equals("white") && (color2.equals("white") || color2.equals("black"))) {
            return true;
        } else if (color1.equals("red") && !color2.equals("green")) {
            return true;
        } else if (color1.equals("black") && (color2.equals("white") || color2.equals("green") || color2.equals("orange"))) {
            return true;
        } else if ((color1.equals("orange") || color1.equals("purple")) && !(color2.equals("red") || color2.equals("black"))) {
            return true;
        } else if (color1.equals("green") && !(color2.equals("orange") || color2.equals("white"))) {
            return true;
        }
        return false;
    }
}
