package practice;

public class Palindrome1 {
    public static void main(String[] args) {
        String name="ana";
        String reverse="";
        int idx=name.length()-1;

        while(idx>-1){
            reverse=reverse+name.charAt(idx);
            idx--;

        }
        if (name.equals(reverse)){
            System.out.println("Palin");
        }else{
            System.out.println("not palindrome");
        }
        System.out.println("==================================================");
        String str="ey edip adanada pide ye";
        String reverse1="";
        int idx1=str.length()-1;

        while(idx>-1){
            reverse1=reverse1+str.charAt(idx);//charAT() used index's so when we say charAt() we are looking for character at that given index
            //so when we do idx inside the charAt() i am actually looking at each given number given by the idx1.
            idx--;

        }
        if(str.equals(reverse1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Palindrome");
        }




    }
}
