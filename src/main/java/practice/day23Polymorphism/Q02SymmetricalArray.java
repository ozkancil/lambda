package practice.day23Polymorphism;

public class Q02SymmetricalArray {
    //Type a method to check if an int Array is symmetrical or not
    //Palindrome

    public static void main(String[] args) {
        int arr[]={1,2,2,4};

        System.out.println(symmetrical(arr));


        int arr1[]={1,2,3,4};
            for(int i=0;i<arr.length;i++){
                System.out.println(arr1[i]);
            }
        }

    public static boolean symmetrical(int [] arr) {
        boolean result=true;// int counter;
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!=arr[arr.length-1-i]){
                result=false;
                break;
            }
        }//counter ++;
        return result;
    }










}
