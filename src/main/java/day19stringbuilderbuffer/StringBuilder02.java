package day19stringbuilderbuffer;

public class StringBuilder02 {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Mississippi");
        System.out.println(sb);
        //String test=sb; is not allowed cuz it's a StringBuilder being added to String


        sb.toString();//toString method is used to change StringBuilders to Strings
        System.out.println(sb);
        String test=sb.toString();//is not complaining because we made it into a String now by using toString

        StringBuilder reverse=sb.reverse();
        System.out.println(reverse);


        //deletecharat is used to delete a character at a specific index.
        sb.deleteCharAt(0);
        System.out.println(sb);

        //when u use a method for StringBuilders, if is bold and not coming from String class it changes teh original value
        System.out.println(sb.delete(2,5));//pp  iss  issiM

        sb.replace(2,4,"IS");
        System.out.println(sb);

        //insert(number of characters from the beginning, new value) method will insert "new value" after skipping number of characters from begining.
        sb.insert(3,"xxx");
        System.out.println(sb);

        StringBuilder sb2=new StringBuilder("java is love");
        StringBuilder sb3=new StringBuilder("Java is love");


        /*
        the value of 0 if this stringBuidler contains the same character sequence as that of the argument StringBuilder;
        a negative integer if teh first StringBuilder is lexicographically less than the second StringBuilder argument;
        a positive integer if the first StringBuilder is lexicographically greater tahn the second StringBuilder argument.

       NOTE: compareTo() method does not ignore cases, it checks alphabetical order by using ASCII Values.
         */

      int compare=  sb2.compareTo(sb3);
        System.out.println(compare);

        //setCharAt(index, new char value);
        sb3.setCharAt(8,'m');
        System.out.println(sb3);


    }
    /*
    1)mechanism behind the immutability
    2)benefits of immunability
    3) difference between immutability and mutability
    4) features of the StringBuilder
     */
}
