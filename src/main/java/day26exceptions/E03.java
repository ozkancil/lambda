package day26exceptions;

import org.w3c.dom.ls.LSOutput;

/*
MAINLY THERE ARE EXCEPTIONS AND THROWABLE:
there are two types of exceptions. Runtime exception and compile time exception.
runtime exception is unchecked exception cuz without runnning it java doesnt give you error.

Throwable is a class.
we can have two things, exceptions and errors
Exceptions two types checked and unchecked exceptions.
For the checked exceptions we learned two, one is filenotfoundexception(checked/compile time exceptions) and the other one is
IOexception(Unchecked/runtime exception).

For the unchecked/runtime(IO exceptions Class) exceptions we learned 6, arithmetic excetptions, nullpoint exceptions, indexarraysoutofbound exception,
 numberformatexception, stringindexoutofbound
exceptions, illegalargument exceptions.

Error part:
OutOfMemoryError=heap memory. if you get outofmemory error your application cannot proceed even one more
 step.    StackOutOfMemoryError=is being full of stack memory being full. If there is not enough space in memory
  no code can be executed. You cannot handle while your application runs the memory. This is why we need to be carefull
  when writing memory.
  Virtual Machine EError, Assertion Error etc

WHAT IS THE DIFFERENCE BETWEEN EXCEPTIONS AND ERRORS?
Excetions can be handled. EVen if u get exception u can still run your code. num/0 you can try catch and procceed in your code.
If there is an error there is nothing you can do, your application will be down.


 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {
    /*
    IOException is checked exception.
    1) filenotfoundexception is related with the path of the file, and the existence of the file
    2) filenotfoundexception is compiled time exception. also called checked exception cuz java checks ur code and puts a red line under. It checks
    it before running it.
    3)file not found exception is the child of "ioexception"
    4)ioexception is related with all possible input oiutput issues.
    5) ioexeption is compile time error exception(checked exception)
    6)when u use parent and child exception classes togehter in a try catch, child classes must come first or java gives error.
    7) when you encounter a compile time exception you have two options. i)using throws in method signaturees. java will throw exception and stop the execution.
    ii) using "try catch" block. java will do what ever u do inside the catch body and doesnt stop the execution.
    We use throw new in the body and throws IOException exception in the methods.

    8)what is the difference between throw and throws keywords?
    i) throw keyword is used to throw any exception in anywhere inside the method body. to do multiple throw we need to use throw new again.
    ii)throws keyword is used in the method signature line
    by using throws keyword u can declare multiple exceptions. We can do this in method signature area: throws Filenotfoundexception,
    ZipException, MalformedURL Exception, FilerException, FileLockInterruptionException
    after using throws keyword, you will tell just the name exception class.


    10)creating custom exceptions.
     */
    public static void main(String[] args) throws IOException, ArithmeticException,NullPointerException {
        //we can throw checked or unchecked exceptions
readTheText();
readTheTextFromFile();
    }
    //create a method to read a text from a text file
    //if the path is wrong, if the file doesnt exist, if the text cannot be read stop execution.
    public static void readTheText() throws IOException {//IOException is parent exception. ity will handle everything for intput output. So no need to put file not
        //found because it is the parent.

        FileInputStream fis=new FileInputStream("src/main/java/day26exceptions/File01.txt");//FilenotFoundException. file is not there or path is wrong


        int k=0;
        while((k=fis.read())!=-1){
            System.out.print((char) k);

        }
        System.out.println("===========================");
    }

    /*
    creaate a method to read a text from a text file.
    if the path is wrong, give a message to the user and do not stop execution.
    if the file does not exist, give a message to the user and do not stop execution
    if the text cannot be read, give a message to the user and do not stop execution.

     */
    public static void readTheTextFromFile(){

        try {
            FileInputStream fis= new FileInputStream("/Users/ozkan/IdeaProjects/Batch108/src/main/java/day26exceptions/File01.txt");
            int k=0;
            while((k=fis.read())!=-1){// we do not like nested things.
                System.out.print((char) k);
//if there is a parent child relationship then if you put the filenotfoundexception under the ioexception it will give an error. IOexception is the parent
                //and it covers all. if u do not want mutliple catch blocsk just use parent exceptions. but to make it more readible we use both try catch.

            }
        } catch (FileNotFoundException e) {
            System.out.println("There is an issue in path or in the file"+e.getMessage());
           // throw new RuntimeException(e);
        } catch (IOException e) {
           // throw new RuntimeException(e);
            System.out.println("There is an issue in reading the text -"+e.getMessage());
        }

        System.out.println("execution did not stop");
    }

}
