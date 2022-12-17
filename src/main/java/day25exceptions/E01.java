package day25exceptions;
/*
1. exception means unexpected issues in code execution.
2. there are two ways to work with exceptions.
  i)using try catch block. this is called "handling exception".
       if we dont to the try catch applications will be blocked.
  ii) Throw exception and block the application.
3. If you do not handle the exeption java stops execution and the applicaiton is blocked.
4. try can be used with a single or more catch blocks
5. try cannot be used alone.

 */
public class E01 {
    public static void main(String[] args) {
       // divide(6,0);

        divide2(6,0);
    }

    //1st: way. We do not recommend this way.
    //i) it is not mandatory for developers to know all math rules.
    //ii) In math, there may be very problematic rules, it is so difficult to cover all in
    //if statement.
    //Because its too difficult to cover all issue, we have 911 number. Because 911 works
    //for all issue.

    //2nd: We can use TRY CATCH block to catch all mistakes.
    public static void divide(int a, int b){
        if(b==0){
            System.out.println("A number cannot be divided by zero");
        }
        else {
            System.out.println(a/b);
        }


    }
    public static void divide2(int a, int b){
        try{
            System.out.println(a/b);
            System.out.println(" hi exception");
            System.out.println("by exception");
        }catch(ArithmeticException e){
            System.out.println("A problem occurred in division");
        }

    }
}
