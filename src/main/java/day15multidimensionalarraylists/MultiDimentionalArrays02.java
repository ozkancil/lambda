package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimentionalArrays02 {
    public static void main(String[] args) {

//print the elements from a 2 dimensional string array. {{"learn","java","it","easy"}}
        String arr[][]={{"learn","java","it","easy"}};
        int add=0;
        for(String[] w:arr){//dont forget to put ur [] sign
            add+=w.length;
            System.out.println(Arrays.toString(w)+" W only");

            for(String u:w){
                if(u.contains("a")){
                    System.out.println(u+" ");
                }
            }

        }
        System.out.println(add);

        //create an integer multidimensional array then find the sum of the elements
        int brr[][]={{12,54},{3,2,7},{21}};
        int sum=0;
        for (int[] w:brr){
            for (int u:w){
                sum=sum+u;
               // System.out.println(sum);
            }
           // System.out.println(sum);
        }
        System.out.println(sum);
    }
}
