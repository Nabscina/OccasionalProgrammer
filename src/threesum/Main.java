package threesum;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        int[] input1 = new int[]{4, 5, -1, -2, -7, 2, -5, -3, -7, -3, 1};
        int[] input2 = new int[]{-1, -6, -3, -7, 5, -8, 2, -8, 1};
        int[] input3 = new int[]{-5, -1, -4, 2, 9, -9, -6, -1, -7};

        triplets(input1);
        triplets(input2);
        triplets(input3);
    }

    //wow fast
    public static void triplets(int[] input) {

        HashMap<String, String> map = new HashMap<>();
        PriorityQueue<Integer> kek = new PriorityQueue();

        for (int i = 0; i < input.length; i++) {
            kek.clear();
            for (int j = 0; j < input.length; j++) {
                for (int k = 0; k < input.length; k++) {
                    if (input[i] + input[j] + input[k] == 0 && i != k && k != j && i != j) {
                        kek.add(input[i]);kek.add(input[j]);kek.add(input[k]);
                        map.put(kek.poll() + "" + kek.poll() + "" + kek.poll(), input[i] + " " + input[j] + " " + input[k]);
                    }
                }
            }
        }

        printSets(map);
    }

    public static void printSets(HashMap<String, String> map) {

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }
}
