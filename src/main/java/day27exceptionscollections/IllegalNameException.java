package day27exceptionscollections;
//when u extend to runtiem exception your custom exception will be runtime exception
public class IllegalNameException extends RuntimeException{

    public IllegalNameException(String message){
        super(message);

    }

}
