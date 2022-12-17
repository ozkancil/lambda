package day25exceptions;

public class E04 {
    public static void main(String[] args) {
      int num=  stringToInt("1234");
        System.out.println(num+1);

        int num1=  stringToInt("abc");//Gives us NumberFormatException if we use
        //valueOf() for a non digit
        System.out.println(num1+1);
    }
    //create a method to convert a string to an integer
    public static int stringToInt(String a){
        int i=0;
        try {
            i= Integer.valueOf(a);
        }catch(NumberFormatException e){
            e.getMessage();


        }
        return i;
    }
}
