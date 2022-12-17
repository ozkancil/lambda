package practice;

import java.util.Scanner;

public class Methods {
    /*
    Techpro Education 39
Switch Statement
10) Create a method which gives you a random alphabetical character in myClass Class then
print the following by using the method.
Print "First Character" for 'A' and 'a'
Print "Second Character" for 'B' and 'b'
Print "Third Character" for 'C' and 'c'
Print "Forth Character" for 'D' and 'd'
Print "Other Characters" for all others
public class myClass {
public static String getRandomAlphabet(){
String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
int maxIndex = alphabets.length()-1;
int randomIndex = (int)Math.round(Math.random()*maxIndex);
return alphabets.substring(randomIndex, randomIndex+1);
}
}
String alphabet = myClass.getRandomAlphabet().toLowerCase();
switch(alphabet){
case "a":
System.out.println("First Character");
break;
case "b":
System.out.println("Second Character");
break;
case "c":
System.out.println("Third Character");
break;
case "d":
System.out.println("Fourth Character");
break;
default:
System.out.println("Other Characters");
}


     */


    public static void main(String[] args) {
//        10) Create a method which gives you a random alphabetical character in myClass Class then
//        print the following by using the method.
//                Print "First Character" for 'A' and 'a'
//        Print "Second Character" for 'B' and 'b'
//        Print "Third Character" for 'C' and 'c'
//        Print "Forth Character" for 'D' and 'd'
//        Print "Other Characters" for all others
//        public class myClass {
//            public static String getRandomAlphabet(){
       String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a letter, upper or lower case");
        String letter=scan.next();

        switch(letter){
            case  "A":
            case "a":
                System.out.println(letter.toLowerCase()+" "+letter.toUpperCase());
                break;
            case  "B":
            case "b":
                System.out.println(letter.toLowerCase()+" "+letter.toUpperCase());
                break;
            case  "C":
            case "c":
                System.out.println(letter.toLowerCase()+" "+letter.toUpperCase());
                break;
            case  "D":
            case "d":
                System.out.println(letter.toLowerCase()+" "+letter.toUpperCase());
                break;
            case  "E":
            case "e":
                System.out.println(letter.toLowerCase()+" "+letter.toUpperCase());
                break;
            case  "F":
            case "f":
                System.out.println(letter.toLowerCase()+" "+letter.toUpperCase());
                break;
            default:
                System.out.println(" only letters please");

        }


        System.out.println((letter.toLowerCase()+""+letter.toUpperCase()));









        }


}
