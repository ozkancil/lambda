package testmyself;

public class Loops2 {

    public static void main(String[] args) {
        //add this up
        int num=1234;
        //we cant add this up so we need to put it into an array
        int [] arr={1,2,3,4};
        int idx=0;
        int sum=0;
        do{
            sum=sum+arr[idx];
            idx++;

        }while(idx<arr.length);
        System.out.println(sum);



        //get it and print it out
        String letters="ozkan";
        int idx1=0;
        String sum1="";

        do{
            sum1=sum1+letters.substring(idx1,idx1+1);
                    idx1++;
        }while(idx1<letters.length());

        System.out.println(sum1);


    }
}
