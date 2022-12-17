package practice.day19_Practice;

import java.util.Arrays;

public class MiddleNum {
    public static void main(String[] args) {
        //Get mid num

        int arr[]={21,43,12,13};//12,13,21,43==>4/2=2
        Arrays.sort(arr);
        int middleIdx=arr.length/2;//this gives the middle number//12,13,21,43==>4/2=2

        //if the length is even i need to do extra work. if the length is odd its eaasier
        //just print out the middle num
        if(arr.length%2!=0){//here we are doing if its even or odd length. so for this reason
            //we do not do middleIdx%2!=0; cuz we are not seeing the legnt of the middle number
            //we are getting the length of the variable and seeing if its even or odd.
            System.out.println(middleIdx);
        }else{
            //now I want to get the middle number if its even and get hte middle numb of middle num and divide
            //by two once again.                        //3 idx of 3=47
            int middleNum=(arr[middleIdx]+arr[middleIdx-1])/2;// 2+(1)=  (47/2)  =
            System.out.println(middleNum+" this ");
        }

    }
}
