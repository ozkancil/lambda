package practice;

public class day15_Q03 {
    public static void main(String[] args) {

        //type code to check if a given integer is palindrome or not
        //Palindrome: 121<==>121    123321,   nalan
        String palindrome="121";
        for(int i=0;i<palindrome.length();i++){
            char s=palindrome.charAt(i);
            for(int k=palindrome.length()-1;k>=0;k--){
char c=palindrome.charAt(k);
if(c==palindrome.charAt(i)){
    System.out.println("Palindromeee");

}else if(c!=s){
    System.out.println("Nothingggg");
}
            }}

String name="nalan";
      String reverse="";
      int idx=name.length()-1;
        System.out.println(idx);

        while(idx>-1){
           reverse=reverse+name.charAt(idx);
           idx--;
        }
if (name.equals(reverse)){
    System.out.println("Palindrome");
}else{
    System.out.println("Not a palindrome");
}
//        String name="ozkan";
//        for(int i=name.length()-1;i>=0;i--){
//char c=name.charAt(i);
//            System.out.println(c);
//        }
    }
}
