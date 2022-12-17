package practice.day24_practice_session;

public class Q03_SymmetricalArray {
    //type a method to check if an int array is semetrcial or not
    public static void main(String[] args) {
        int []a={1,2,2,1};
        System.out.println(arr(a));
    }
    public static boolean arr(int []a){
        boolean isTrue=true;
        for(int i=0;i<a.length;i++){
        if(a[i]!=a[a.length-1-i]){
            isTrue=false;
            break;
        }
    }
        return isTrue;
}}
