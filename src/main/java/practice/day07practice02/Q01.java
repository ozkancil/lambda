package practice.day07practice02;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //ask user to enter a character, if it is vowel print vowel and if it is not vowel print not vowel
        Scanner input=new Scanner(System.in);
        System.out.println("enter vowels");
        //String vowel=input.nextLine();
        //boolean isVowel=vowel.replaceAll("aeiou","").isEmpty();
        //System.out.println(isVowel);
        char c=input.next().toLowerCase().charAt(0);
        switch (c){
            case 'a':
            case'e':
            case'o':
            case 'i':
            case 'u':
                System.out.println("vowels");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
                System.out.println("enter a vowel");
                break;
            default:
                System.out.println("Enter a letter not anything else");
        }
    }
}
