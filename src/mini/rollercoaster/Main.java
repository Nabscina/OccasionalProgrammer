package mini.rollercoaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/mini/rollercoaster/enable1.txt"));
        HashMap<String, Integer> alphabet = alphabet();
        int count = 0;

        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            if (word.length() < 5) {
                continue;
            }
            int i = 1;
            int j = 0;
            boolean kek = true;
            Character prev = word.charAt(0);
            while (kek && i < word.length()) {
                Character c = word.charAt(i);
                if (alphabet.get(c.toString()) > alphabet.get(prev.toString())) {
                    if (j == 2) {
                        kek = false;
                    } else {
                        j = 2;
                    }
                } else if (alphabet.get(c.toString()) < alphabet.get(prev.toString())) {
                    if (j == 1) {
                        kek = false;
                    } else {
                        j = 1;
                    }
                } else {
                    kek = false;
                }
                prev = c;
                i++;
            }
            if (kek) {
                count++;
                System.out.println(word);
            }
        }
        System.out.println("Total: " + count);
    }

    public static HashMap<String, Integer> alphabet() {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        map.put("g", 7);
        map.put("h", 8);
        map.put("i", 9);
        map.put("j", 10);
        map.put("k", 11);
        map.put("l", 12);
        map.put("m", 13);
        map.put("n", 14);
        map.put("o", 15);
        map.put("p", 16);
        map.put("q", 17);
        map.put("r", 18);
        map.put("s", 19);
        map.put("t", 20);
        map.put("u", 21);
        map.put("v", 22);
        map.put("w", 23);
        map.put("x", 24);
        map.put("y", 25);
        map.put("z", 26);

        return map;
    }

}
