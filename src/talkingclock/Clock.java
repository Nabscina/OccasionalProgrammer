package talkingclock;

import java.util.HashMap;

public class Clock {

    private HashMap<String, String> fird;
    private HashMap<String, String> seconth;
    private HashMap<String, String> thirst;

    public Clock() {

        fird = new HashMap<>();
        seconth = new HashMap<>();
        thirst = new HashMap<>();

        fillMaps();
    }

    public void sayTime(String time) {

        String[] split = time.split(":");

        if (check(split)) {
            System.out.print("It's " + fird.get(split[0]));
            if (split[1].startsWith("1")) {
                System.out.print(" " + seconth.get(split[1]));
            } else if (!split[1].equals("00")) {
                System.out.print(" " + seconth.get(split[1].substring(0, 1)) + thirst.get(split[1].substring(1, 2)));
            }
            if (split[0].startsWith("0") || split[0].equals("10") || split[0].equals("11")) {
                System.out.print(" am");
            } else {
                System.out.print(" pm");
            }
            System.out.println("");
        }
    }

    public boolean check(String[] split) {

        return split.length == 2 && split[0].length() == 2 && split[1].length() == 2;
    }

    public void fillMaps() {

        fird.put("00", "twelve");
        fird.put("01", "one");
        fird.put("02", "two");
        fird.put("03", "three");
        fird.put("04", "four");
        fird.put("05", "five");
        fird.put("06", "six");
        fird.put("07", "seven");
        fird.put("08", "eight");
        fird.put("09", "nine");
        fird.put("10", "ten");
        fird.put("11", "eleven");
        fird.put("12", "twelve");
        fird.put("13", "one");
        fird.put("14", "two");
        fird.put("15", "three");
        fird.put("16", "four");
        fird.put("17", "five");
        fird.put("18", "six");
        fird.put("19", "seven");
        fird.put("20", "eight");
        fird.put("21", "nine");
        fird.put("22", "ten");
        fird.put("23", "eleven");

        seconth.put("2", "twenty");
        seconth.put("3", "thirty");
        seconth.put("4", "forty");
        seconth.put("5", "fifty");
        seconth.put("10", "ten");
        seconth.put("11", "eleven");
        seconth.put("12", "twelve");
        seconth.put("13", "thirteen");
        seconth.put("14", "fourteen");
        seconth.put("15", "fifteen");
        seconth.put("16", "sixteen");
        seconth.put("17", "seventeen");
        seconth.put("18", "eighteen");
        seconth.put("19", "nineteen");
        seconth.put("0", "oh");

        thirst.put("0", "");
        thirst.put("1", " one");
        thirst.put("2", " two");
        thirst.put("3", " three");
        thirst.put("4", " four");
        thirst.put("5", " five");
        thirst.put("6", " six");
        thirst.put("7", " seven");
        thirst.put("8", " eight");
        thirst.put("9", " nine");
    }

}
