package practice.day19_Practice;

import java.util.Arrays;

public class Q03_FindEleInMiddle {
    public static void main(String[] args) {
        /*
        find the middle element in an integer array
        Example: 12,5,8  ==> 5,8.12==> output =8
        Example 2:12,5,8 ,13 ==>12,5,8 ,13==>output (8+12)/2=10;
         */
        int []arr={12,5,8,21,13,15,50};
        Arrays.sort(arr);
        int middleIndex=arr.length/2;//java will give 3. 3.5==> 3
        //System.out.println(middleIndex);
        //System.out.println(Arrays.toString(arr));

        if (arr.length%2!=0){
            //System.out.println(middleIndex+" odd ");
            System.out.println("At length divided by 2 = "+middleIndex+ " and at this index is : "+ arr[middleIndex]);
        }else{
           int middleValue= (arr[middleIndex]+arr[middleIndex-1])/2;
            System.out.println(middleIndex+" this");

        }

    }
}
