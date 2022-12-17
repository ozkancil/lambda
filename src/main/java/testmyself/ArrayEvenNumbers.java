package testmyself;

import java.util.Arrays;

public class ArrayEvenNumbers {
    public static void main(String[] args) {
        /*
         Create an array compromising of numbers 1 through 10
                Print even numbers
                */
//        int sum=0;
//
//        int arr[]={1,2,3,4,5,6,7,8,9,10};
//        int array[]= new int[arr.length];
//        int i=0;
//        for(int w:arr){
//            if(w%2==0){
//                array[i]=w;
//                System.out.println("These are the even numbers only "+ Arrays.toString(array));
//            }
//            //System.out.println("These are the even numbers only "+ Arrays.toString(array));
//        }
//       // System.out.println("These are the even numbers only "+ Arrays.toString(array));
//        System.out.println(Arrays.toString(array));

        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        for (int k=0;k<arr1.length;k++){
            if(arr1[k]%2==0){
                System.out.println(arr1[k]);
            }

        }
    }
}
