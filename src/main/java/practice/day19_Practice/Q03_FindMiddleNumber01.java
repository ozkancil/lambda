package practice.day19_Practice;

import java.util.Arrays;

public class Q03_FindMiddleNumber01 {
    public static void main(String[] args) {


    //Get middle numbers
    int arr[]={1,34,56,32,12};
    Arrays.sort(arr);
    int middleIdx=arr.length/2;


        if (arr.length%2!=0){
            System.out.println(middleIdx);
        }else{
            int middleNum=(arr[middleIdx]+arr[middleIdx-1])/2;
            System.out.println(middleNum);
    }















    }

}
