package day06stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        //exmaple: print the first nad the last character of the given String on the console "java is easy"
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=input.nextLine();

        //1st way: By using charAt() method
        char firstChar=str.charAt(0);
        char lastChar=str.charAt(str.length()-1);
        //System.out.println(str.charAt(0)+str.charAt(str.charAt(str.length()-1)));
        System.out.println(firstChar+". Last Character is :"+lastChar);
        System.out.println(firstChar+lastChar);//if u use char data type in a math operation it returns numbers. Java uses ascii values not the characters
        System.out.println(""+firstChar+lastChar);
        //str.charAt(str.length()-1);

        //2nd way: by using substring() method. substring give you part of the string. if you wanna see "easy" which is part of the java is easy, so we need to use
        //substring. 1st index is inclusive, 2nd is exclusive.
        String firstCharacter=str.substring(0,1);
        System.out.println(firstCharacter);
        String lastCharacter=str.substring(str.length()-1);//substring(beginning index) gives you the characters from a specific index to the last index.
       //System.out.println(str.substring(2));
        System.out.println(str.substring(str.length()-1));
        System.out.println(str.substring(3,9));//java is java
                                            //123456789,10    4,9,10
        //2nd example: print just the animal names from the String " I like lion, horse, laptop and cat:
                    // 123456789
        String animal="I like lion, horse, laptop and cat";
        System.out.println(animal.substring(7,11)+", "+animal.substring(13,18)+", "+animal.substring(31));
        String animal1=animal.substring(7,11)+", "+animal.substring(13,18)+", "+animal.substring(31);
        String animal2=animal.substring(7,11)+animal.substring(13,18)+animal.substring(31);

        System.out.println(animal1);
        System.out.println(animal2);

        //3rd example. type code to get intials of the first and last name of a given name.
        //ali can, mary star
        String name="ali can", name1="mary star";
        String names=name.substring(0,1)+name.substring(name.length()-1);
        String names1=name1.substring(0,1)+name1.substring(name1.length()-1);
        System.out.println(names+" the initial and last for Ali can :"+names+" This is for mary Star--> "+names1);
        String initialOfLastName=name.split(" ")[0].substring(0,1);

        //4th example: Find how many words are in a string. "I like to move it, move it"
        String move="I like to move it move it";
        String stringLength="What is this saying?";
        int split=move.split(" ").length;
        System.out.println(split);

        int words=stringLength.split(" ").length; //for split you do not use paranthesis
        System.out.println(words);





    }
}
