package newphonenumber;

import java.util.Scanner;

public class NewPhoneNumber {


    public static void main(String[] args) {
        
        System.out.print("Enter a phone number: ");
        String num = new Scanner(System.in).nextLine();
        String newNum = "";
        
        for (int i = 0; i < num.length(); i++) {
            Character c = num.charAt(i);
            newNum += (Integer.parseInt(c.toString()) + 1) + "";
        }
        
        System.out.println("New phone number: " + newNum);
    }
    
}
