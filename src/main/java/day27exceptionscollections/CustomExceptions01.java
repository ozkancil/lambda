package day27exceptionscollections;

public class CustomExceptions01 {
    /*
    normally, java has many Exception classes which cover many issues.
    And we use them to handle many issues/
    sometimes we need specific exceptions, custom exceptions for two reasons
    1)to make java exceptions more specific.
       FileNotFoundException-path can be wrong, file doesnt existed.
    2)to create some exceptions for our application
       For special cases like if we need a certain age then we can make a custom exception.
        we can name it "IllegalGradeException".
3) Custom exceptions directs/guides the developers not to break the application rules.

     */

    public static void main(String[] args) throws IllegalGradeException {

        printGrades(100);
        System.out.println(checkNameFormat("Ozkan"));
    }
    public static void printGrades(double grade) throws IllegalGradeException {
        if(grade<0 || grade>100){
             throw new IllegalGradeException("Grade cannot be less than zero or more than hundred");
  }else {
            System.out.println(grade);
        }


    }
    public static boolean checkNameFormat(String name){
        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;

        }else{
            throw new IllegalNameException("Names must start with Upper cases");
        }
    }


}
