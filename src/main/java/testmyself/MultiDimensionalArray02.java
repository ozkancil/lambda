package testmyself;

import java.util.Arrays;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {
        //print the elements from a 2 dimensional string array. {{"learn","java","it","easy"}}
        String arr[][]={{"learn","java"}, {"it","easy"}};
        for (String[] w:arr){
            System.out.println(Arrays.deepToString(w));
        }

        //print only those that contain an 'a'
        for(String[]w:arr){
            for (String u:w){
                if(u.contains("a")){
                    System.out.println(u);
                }
            }
        }
        //create an integer multidimensional array then find the sum of the elements
        int sum=0;
        int crr[][]={{1,2,3},{3,4},{5}};
        for (int[]w:crr){
            for (int u:w){//the reason we do not do i=0 i++; is because we are already going into the idx
                //and taking the elements one by one and adding it to one another.
                //if we want to add it to a container then we would do i=0; i++;
                sum=sum+u;
            }
        }
        System.out.println(sum);


    }
}
