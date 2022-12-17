package day11constructorsmethodcallstatickeyword;

import java.sql.SQLOutput;


    /*
    when you create a  class you will use it to create an object most probably, java knows this.
    so java puts a constructor behind it. so java puts constructor in it automatically. Its called default constructors
    default constructors are invisible.

    if u create your own constructor java deletes its own constructor.
     */
    //how to create constructor?
    //THE DIFFERENCE BETWEEN CONSTRUCTORS AND METHODS
    //write access modifier and make it public
    //make class name the constructor name
    //constructor name must match with the class name
    //NOTE: CONSTRUCTORS do not have return type(data types)
    //NOTE: METHODS have return type
    //you can put any name for the method but for the constructor you cant put any name; constructors must have the class name only.
    /*note: constructors are used to create "objects"  but methods are used to create some actions. for example if you want to do addition
    you create a method.
    You want to do a scanner object you will create a constructor.
     */


    /*

    Constructors must have the same name as the class within which it is defined while it is not necessary for the method in Java.
    Constructors do not return any type while method(s) have the return type or void if does not return any value.
    Constructors are called only once at the time of Object creation while method(s) can be called any number of times.

     */






    /*
    class Geek
{
  .......

  // A Constructor
  new Geek() {
  }

  .......
}

// We can create an object of the above class
// using the below statement. This statement
// calls above constructor.
Geek obj = new Geek();
     */

//NOTE: IF ANY CLASS YOU WANT TO USE IS IN THE SAME PACKAGE "NO NEED" TO IMPORT it.
//but if the class is in hte different package you have to import it



    public class Car {

//here we make it assign to each variable. using constructor we can change it and its more dynamic now.
    static String make="Toyata";
    String model="Honda";
    int year=2020;
    int price=20000;

    public Car() {//now this is a constructor. constructors do not have return tpyes.
        System.out.println("car constructor 1");

    }
        public Car(String make,String model,int year, int price){//we made constructor with parameter to make different objects.
        //here we have made each car component changeable.
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;


        }
   // public int add() { this is a method not an constructor. constructor needs class name and is used to create objects.
        //i can call this from the runner class with object cuz its not static. if it was static i can use class to call.

    //}
        public Car(String make, String model, int year){
    this.make=make;
    this.model=model;
    this.year=year;
        }


}
