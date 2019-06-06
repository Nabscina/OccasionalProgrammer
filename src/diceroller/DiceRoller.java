package diceroller;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {

        System.out.print("Number of dice to roll and number of sides, separated by 'd': ");

        String[] numbers = new Scanner(System.in).nextLine().split("d");

        try {
            int res = 0;
            for (int i = 0; i < Integer.parseInt(numbers[0]); i++) {
                res += 1 + new Random().nextInt(Integer.parseInt(numbers[1]));
            }
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Bad input.");
        }
    }

}
