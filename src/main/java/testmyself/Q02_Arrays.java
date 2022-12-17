package testmyself;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays {
    public static void main(String[] args) {
        //Example 1: type code to check if a specific element exists in an array or not
        int arr[]={1,2,3,4,5};
        int counter=0;
        for(int w:arr){
            if(w==6){
                counter++;

            }
        }
        if(counter>0){
            System.out.println("we got it haha");
        }else{
            System.out.println("nope ");
        }


//2nd way:
        // we will use binarySearch()==> Everytime we need binary first use sort() method then use binarySearch()

        Arrays.sort(arr);
        int search=Arrays.binarySearch(arr,225);//it tells u the position of where it should have been

        System.out.println(search);


        //2nd way: Get string from user and type code to find the number of words in the string
//        String words=("Java is money money is good");
//        String split[]=words.split(" ");
//        int length=split.length;
//        System.out.println(length);

        //2nd way: Get string from user and type code to find the number of words in the string

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter words");
        String words=scan.nextLine();
        String split[]=words.split(" ");

        //int length=split.length;
        System.out.println(Arrays.toString(split));
        System.out.println(split.length);
//==============================================
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence to check the number of the words");
        String str=input.nextLine();

        String strArr[]=str.split(" ");
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);
        //==========================================

        //example 3: count the number of words starts with "s" in the string

       int counter1=0;
       for(String w:strArr){
           if(w.startsWith("s") || w.startsWith("S")){
               counter1++;
           }

       }

       if (counter1>0){
           System.out.println(counter1);
       }else{
           System.out.println("non");
       }


    }
}
