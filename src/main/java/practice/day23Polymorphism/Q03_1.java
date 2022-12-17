package practice.day23Polymorphism;
import java.util.*;
public class Q03_1 {
    public static void main(String[] args) {


    int arr[]={1,2,2,1};
    boolean isTru=true;
    for (int i=0;i<arr.length;i++){
        if (arr[i]==arr[arr.length-1-i]){
            isTru=true;
            //System.out.println(arr[i]);
        }else{
            isTru=false;
            break;
        }
    }
        System.out.println(isTru);
}}





class A{
    public static void main(String[] args) {
       int[] arr={1,2,2,1};

//        A a=new A();
//        A.arr();

        System.out.println(arr(arr));

    }
    public static boolean arr(int arr[]){
boolean isTrue=true;
        for (int i=0;i<arr.length/2;i++){
            if(arr[i]==arr[arr.length-1-i]){
                isTrue=true;
            }
            else{
                isTrue=false;
                break;
            }
        }
return isTrue;
    }






}
class B{
    public static void main(String[] args) {
        int arr[]={1,2,1,2};
        System.out.println(arr(arr));
    }
    public static boolean arr(int arr[] ){
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }

}




class C{
    public static void main(String[] args) {
        int arr[]={1,2,2,1};
        System.out.println(arr(arr));
    }
    public static boolean arr(int arr[]){
        int idx=0;
        while(idx<arr.length/2){
            if (arr[idx] != arr[arr.length-1-idx]) {
                return   false;
            }
            idx++;
        }
        return true;
    }
}
/*
Example 3: Checking If a Number is Odd or Even Using Boolean Method
*/
class D{
    public static void main(String[] args) {

        System.out.println(oddEven(1));
    }
    public static int oddEven(int a){
        if(a%2==0){
            System.out.println("is even");
            return a ;
        }else{
            System.out.println("Is odd");
            return a;

        }
    }

}

class E{
    public static void main(String[] args) {
        int a=3;
        System.out.println(oddEven(a));
    }
    public static boolean oddEven(int a){
        if(a%2!=0){
            return false;
        }
        return true;
    }
}

class F{
    public static void main(String[] args) {
int a[]={1,2,3,4,5,};
        System.out.println(arr(a));
    }
    public static int arr(int []a){
        int i=0;
        if(a[i]%2==0){
            System.out.println("Even"+a[i]);
            i++;
        }else{
            System.out.println("not even"+a[i]);
            i++;
        }
        return a[i];
    }
}

class G{
    public static void main(String[] args) {
        int a []={-34,-23,-32,-56,-1,-3,-969,-57,-68,-45};
        System.out.println(max(a));
    }
    public static int max(int []a){
        int maxValue=Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++){
            if(a[i]>maxValue){
                maxValue=a[i];
            }
        }
        return maxValue;
    }
}

class H{

    public class Main
    {
        public static String[] return_Array() {
            //define string array
            String[] ret_Array = {"Java", "C++", "Python", "Ruby", "C"};
            //return string array
            return ret_Array;
        }

        public static void main(String args[]) {
            //call method return_array that returns array
            String[] str_Array = return_Array();
            System.out.println("Array returned from method:" + Arrays.toString(str_Array));

        }
    }
}

class M{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(toArr()));
    }
    public static String [] toArr(){
        String []toArr={"o","z","k"};
        return toArr;
    }
}

class I{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr()));
    }
    public static String [] arr(){
        String arr[]={"a","z","d"};

        return arr;
    }
}


class J{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr()));
    }
    public static int [] arr(){
        int arr[]={1,2,3,4,};
        return arr;
    }
}

class K{
    public static void main(String[] args) {
        final int N=10;
        int[]randomNum;
        randomNum = create_random(N);
        System.out.println("The array of random numbers:");
        // display array of random numbers
        for (int i = 0; i <randomNum.length; i++)
        {
            System.out.print(randomNum[i] + " ");
        }
    }


    public static int[] create_random(int N){
        int [] randomNum=new int[N];

        for (int i=0;i<randomNum.length;i++){
            randomNum[i]=(int)(Math.random()*10);

        }
        return randomNum;
    }
}






















