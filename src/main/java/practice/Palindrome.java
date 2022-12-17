package practice;

public class Palindrome {
    public static void main(String[] args) {
        /*
        check if its a palindrome
         */
    String name="Ana";
    String reverse="";
    int idx=name.length()-1;//here we get the name.length()-1, meaning start from the back.Now we need to make this count
        //to make it count we need to add idx--;
        //so length means get the number of length in a value(cahracters) so if we do minus -1 we are saying start from the back.
    //its going to get the index so  its not a String its a number. so int

        while(idx>-1){//the moment it hits zero we say stop so we do >-1
            reverse=reverse+name.charAt(idx);//the reason we do char(idx) is because we are getting the length in numbers by doing idx
            //so when we put the idx we are telling java to get the names starting backwards.
            //now we compare the backwards one the actual name
            idx--;
        }
        if(name.equals(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }



    }
}
