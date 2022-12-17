package day26exceptions;

public class E01 {
    //create a method to print the given age, then put a try catch for the erros that come up.
    public static void main(String[] args) {
        try {
            age(1);
            age(8);
        }catch (IllegalArgumentException e){
            System.out.println("age is wrong");
        }

        try {
            workerAge(3);
        }catch (IllegalArgumentException e){
            System.out.println("Age is not valid");
        }
    }

    public static void age(int age) {     //if a method just prints something we make the return type void

        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println(age);
    }

    //Create a method to print worker's age
    public static void workerAge(int age){
        if (age<16){
            throw new IllegalArgumentException("A workers age cannot be less than 16");
        }
        System.out.println(age);
    }
}
