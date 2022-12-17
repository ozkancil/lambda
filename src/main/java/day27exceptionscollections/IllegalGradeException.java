package day27exceptionscollections;
//to make a class exception class make it child of the "Exception class" by using extends keyword.
//if u use extends exception it will be compile time exception( checked exception)
public class IllegalGradeException extends Exception{//all exception classes have exception at the end of name. Exception is the parent of all exceptions

    //checked exceptions and unchecked exceptions.
    public IllegalGradeException(String message){
        super(message);

    }

}
