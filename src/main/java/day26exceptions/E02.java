package day26exceptions;

public class E02 {
    /*
    1) if u want to execute a code for every scenario, use finally block after try
    2) try can be used like i) try+single catch ii)try+multiple catch  iii) try + single catch+finally
           iiii)try+multiple catch +finally   v)try + finally.
           Note: try cannot be used alone.

           finally we use in try catch scenerio.

           Runtime exceptions, when we click run we see these exceptions which are runtime exceptions.
           ArithmeticException, nullpointerexception, arrayindexourofboundexception, numberformatexception.
           stringindexoutofboundexception, illegalargumentexception are displayed after running the code so these are runtime exception.

           4)then we have compile time exception. which will creeate a problem before we run the code. this will be displayed before running the code.

           NOTES: When we create a method and we "variables" inside the method paranthesis it is called parameter. When you call a method and use an actual value it is
           called an argument.


           some exceptions we see without running.
     */
    public static void main(String[] args) {

        divide(6,3);
        add(2,0);
    }

    //create a method to do division then save the result into data base
    public static void divide(int a, int b){
        try{
            System.out.println(a/b+ " was saved into database");

        }catch (ArithmeticException e) {
            System.out.println("Cut connection with the database");

        }finally {
            System.out.println("Cut the connection with the database");

        }

    }
    public static void add(int a, int b){
        try{
            System.out.println(a/b);
        }//catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//
//        }

        finally{
            System.out.println("Stop running");
        }
    }
}
