package talkingclock;

public class Main {

    public static void main(String[] args) {

        Clock clock = new Clock();
        
        clock.sayTime("00:00");
        clock.sayTime("01:30");
        clock.sayTime("12:05");
        clock.sayTime("14:01");
        clock.sayTime("20:29");
        clock.sayTime("21:00");
    }
}
