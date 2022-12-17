package day25exceptions;

public class E03 {
    public static void main(String[] args) {

        int r1=getNumOfChars("Tom Hanks");
        System.out.println(r1);

        int r2=getNumOfChars("");
        System.out.println(r2);

        int r3=getNumOfChars(null);//length() doesn't work with null. so it gives nullPointerException

        System.out.println(r3);
        System.out.println(getNumOfChars("ozak "));


    }
    public static int getNumOfChars(String str){
int numOfChar=0;
        try {
            numOfChar= str.length();
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("A problem occurred in using legnth()");
        }
        return numOfChar;
        /*
        exception is unexpected errors. arithmetic exception. nullpiont, arrayindexoutofbound exception.
         */
    }
}
