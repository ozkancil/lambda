package day07stringmanipulation;

import java.util.Scanner;

public class StringManipulation03 {
    public static void main(String[] args) {
        String str="Ali is 13 years old, I like Ali, Ali does not like me!....";
        //example1: how many punctuation marks are used in the given string
        int numOfAllCharacters=str.length();
        int numOfAAllCharsDiffFromPunctuationMarks=str.replaceAll("\\p{Punct}","").length();//this doesnt give the length of how many punctuations there are
        //-it gives the length after we take out the punctuation.
        //String numOfAAllCharsDiffFromPunctuationMarks1=str.replaceAll("\\p{Punct}","");
        System.out.println("Length-->"+numOfAllCharacters);//Answer: 58
        System.out.println("Length after deletion of punctuations-->"+numOfAAllCharsDiffFromPunctuationMarks);//After we take out the punctuations the length it 51
        System.out.println(numOfAllCharacters-numOfAAllCharsDiffFromPunctuationMarks+"<---");//Answer --> 7
        /*
        so if i minus the erased punctuations from the total length that gives me how many punctuations are now missing, so thats the length of sentence w/out the
        punctuation.
        So 58 minus 51 is 7. so I have deleted 7 punctuation marks.
         */
        System.out.println(numOfAllCharacters);
    //Example 2: Ask user to enter his full name, and fix if the user enters space at the beginning and at the end.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name=input.nextLine();

        String deleteSpace=name.trim();//trim() method removes spaces from the beginning and from the end, it does not touch spaces in the middle.
        System.out.println(deleteSpace);

    }
}
