package practice.day31;

import java.util.Scanner;

public class ChangingLettersToAsterics {
    //ask user to enter his/her name, surname and credit num and convert all characters in name and suranme to asterics except for initials.
    //also convert all numbers in credit card to asterics except for the last digits

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("enter your name, surname and credit card number");

            String str = input.nextLine();

            String name = str.split(" ")[0];

            String surname = str.split(" ")[1];

            String cardNum = str.split(" ")[2];

            String hiddenName = name.replaceAll("[a-z]", "*");
            String hiddenSurName = surname.replaceAll("[a-z]", "*");
            String hiddenNum = "";

            for (int i = 0; i < cardNum.length(); i++) {
                if (i < cardNum.length() - 4) {
                    hiddenNum = hiddenNum + "*";
                } else {
                    hiddenNum = hiddenNum + cardNum.charAt(i);
                }
            }
            System.out.println(hiddenName + " " + hiddenSurName + " " + hiddenNum);


        }catch(Exception e){
            System.out.println("Input again. "+e.getMessage());
        }


    }


}
