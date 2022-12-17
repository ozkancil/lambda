package testmyself;

import java.util.Arrays;

public class MultiDimensionalArray03 {
    public static void main(String[] args) {

        //convert multidimensional array to one dimensional array
        //{{"learn","java","it","easy"}} make this one dimensional array
        int length=0;
        String arr[][]={{"learn","java","it","easy"}};
        for (String[]w:arr){
            length=w.length;
        }
        System.out.println(length);

        //now add the length into a String Array to make the container length. So we got
        //4 as the length, now I want to make a one dimensional array with 4 containers.
        String crr[]=new String[length];
        int i=0;
        for (String[]w:arr){
            for (String u:w){
                crr[i]=u;
                i++;

            }
        }
        System.out.println(Arrays.toString(crr));
    }
}
