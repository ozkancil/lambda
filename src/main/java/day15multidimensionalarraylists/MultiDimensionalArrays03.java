package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays03 {
    public static void main(String[] args) {
        //convert multidimensional array to one dimensional array
        //{{"learn","java","it","easy"}} make this one dimensional array
        String brr[][]={{"learn","java","it"} ,{"is","easy"}};
        System.out.println(Arrays.deepToString(brr));
        System.out.println(brr.length);
        //1 step: find the total number of elements in the multidimensional array
        //So far we are creating a container for the one dimensional array. To create the containers we must take the length and paste the length amount into the container.
        int sum=0;
        for(String[] w:brr){
            sum=sum+w.length;
        }
        System.out.println(sum);
        //2nd step: create one dimensional array by using the total # of elements in multidimensional array
        String arr[]=new String[sum];//we have created a single dimensional array using the 2 dimensional array.
        //by getting the length and putting it in the String name[]=new String[sum]; we have put containers into the one dimensional aarray, which
        //lets us put the right amount of arrays in because the first loop gets the number of elements of the arrays and puts it into the containers.
        //So we actually get 5 containers insdie the 1D array and not a 2D array with 5 element slots as before.

        //3rd step: transfer the elements from the multidimensional (two dimensional) array to the one dimensional array.
        int idx=0;//here we increase the idx, we are not adding it to int, we are adding it to arr. However, we must increase the idx as we
        //as there are certain amount of idx.
        for(String []w:brr){
        for (String u:w){
            arr[idx]=u;
            idx++;
        }
            System.out.println(Arrays.toString(arr));

        }
    }
}
