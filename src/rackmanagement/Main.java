package rackmanagement;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //H a s h M a p B o y s
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Letters: ");
        String letters = scanner.nextLine();
        System.out.print("Word: ");
        String word = scanner.nextLine();

        for (int i = 0; i < letters.length(); i++) {
            Character c = letters.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        boolean status = true;
        for (int i = 0; i < word.length(); i++) {
            if (!status) {
                break;
            }
            Character c = word.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) == 0) {
                    status = false;
                }
                map.put(c, map.get(c) - 1);
            } else {
                status = false;
            }
        }
        System.out.println(status);
    }
}
