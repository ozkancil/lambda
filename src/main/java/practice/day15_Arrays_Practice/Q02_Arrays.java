package practice.day15_Arrays_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays {
    public static void main(String[] args) {


        //Example 1: type code to check if a specific element exists in an array or not
        int arrInt[] = {250, 85, 98, 25, 88, 654, 789};
        int searchItem=25;
        int counter=0;

for(int w:arrInt){
  if(w==searchItem){
      //System.out.println("The element exists");
      counter++;
  }
}
if(counter>0){
    System.out.println("element exists");
}else{
    System.out.println("element does not exist");
}

//2nd way:
        // we will use binarySearch()==> Everytime we need binary first use sort() method then use binarySearch()

        Arrays.sort(arrInt);
int searchNum=Arrays.binarySearch(arrInt, 52);
        System.out.println(searchNum);



        //2nd way: Get string from user and type code to find the number of words in the string
        Scanner input=new Scanner(System.in);
 System.out.println("Enter a sentence to check the number of the words");
String str=input.nextLine();
//        int split1=str.split(" ").length; // <------
        //The difference here I think is that I can split an input, but when I get the input and add
        // it to another String like String strArr[] then I need to do a bracket.
        //So when I'm adding the user input to another String I need to use [ ]
        String strArr[]=str.split(" "); //<-----
        int legnth2=strArr.length;
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);



//example 3: count the number of words starts with "s" in the string
        int counter2=0;
     for (String w:strArr){
         if(w.startsWith("j")||w.startsWith("J")){
             counter2++;
         }
     }
        System.out.println(counter2);
     if(counter2==0){//here we do this out of the for loop because we do not need to repeat these. we are only seeing
         System.out.println("There is no word");
     }else{
         System.out.println("There is a word in sentence");
     }
    }
}