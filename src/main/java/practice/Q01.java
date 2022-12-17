package practice;

import java.util.Scanner;

public class Q01 {
    /*
    ask user to enter a  character if it is vowel print vowel and if it is not vowel print not vowel
    a,e,i,o,u
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not");

        char c=input.next().toLowerCase().charAt(0);
    }
}
