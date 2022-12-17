package testmyself;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //use user to input data into arrays
        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the number of students you want");
//        int numOfStudents=input.nextInt();
//
//        String amountOfStudentsArray[]=new String[numOfStudents];
//
//        for(int i=0;i<numOfStudents;i++){
//            System.out.println("Enter the name of students");
//            String studentNames=input.next();
//            amountOfStudentsArray[i]=studentNames;
//
//        }
//        System.out.println(Arrays.toString(amountOfStudentsArray));
//
//        //Example 1: type code to check if a specific element exists in an array or not
//        int arrInt[] = {250, 85, 25, 25, 88, 25, 789};
//        int counter=0;
//for (int i=0;i<arrInt.length;i++){
//    if(arrInt[i]==25){
//        counter++;
////    }else{
////        break;
////    }
//}
//
//    }
//        if(counter>0){
//            System.out.println("amount of exists "+ counter);
//        }else{
//            System.out.println("Not there");
//        }





        //2nd way: Get string from user and type code to find the number of words in the string
        System.out.println("Enter string for the number of words divided");
        String scan=input.nextLine();
        System.out.println(scan.split(" "));
        //String split5[]=scan.split(" ");
        String split4[]=scan.split(" ");
        //System.out.println(Arrays.toString(split4));
        System.out.println(split4.length);

        //2nd way: Get string from user and type code to find the number of words in the string
        //Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence to check the number of the words");
        String str=input.nextLine();
//        int split1=str.split(" ").length; // <------
        //The difference here I think is that I can split an input, but when I get the input and add
        // it to another String like String strArr[] then I need to do a bracket.
        //So when I'm adding the user input to another String I need to use [ ]
        String strArr[]=str.split(" "); //<-----
       // int legnth2=strArr.length;
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);




//
//        System.out.println("Enter how many words you want to input");
//        int length=input.nextInt();
//        String words[]=new String [length];
//        String letters;
//        int words1=words.length;
//        System.out.println(words.length);
//        for(int i=0;i<length;i++) {
//            System.out.println("Enter the words");
//            letters = input.nextLine();
//            words[i] = letters;
//
//        }


}}
