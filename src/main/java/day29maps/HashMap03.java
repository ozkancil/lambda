package day29maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    /*
    type code to print the number of occurrences of words in a sentence.
    I like to move it move it, do you like it?
     */
    public static void main(String[] args) {

//Remove punctuation marks
        String sentence = " I like to move it move it, do you like it?";
        sentence.replace("\\p{Punct}","");

        //Get the words from the sentence by using split() with space.
        String [] words= sentence.split("");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> occurrenceMap=new HashMap<>();

        for (String w:words){
            Integer numOfOccurrence=occurrenceMap.get(w);

            if(numOfOccurrence==null){
occurrenceMap.put(w,1);
            }
            else{
occurrenceMap.put(w,numOfOccurrence+1);
            }
        }
        //Example 2: Type code to print the number of occurrences of letters in a sentence



    }
}
