package day23encapsulationabstraction;

public class StudentRunne {
    /*
                 Encapsulation:
       Encapsulation is "data hiding"
       To hide a data we make the access modifier "private"
       After "hiding data" you may need to read or update the data.
       To read or update the data we will create some methods.
       To read encapsulated data you should create get() methods.
       get() methods are for reading. We name it getters.
       To update encapsulated data we use set() methods, we name it setters
       Making it private makes it encapsulated.
       WHEN DO WE NEED ENCAPSULATION?
       For ssn, personal information.

If something is immutabel you cannot change original value so it will not accept getters and setters. java beans
if you want to make a class immutable do not create any setter methods. if there is no setter then no data will be updated. getters shows us the data
but setters helps us change the data.


        */

    public static void main(String[] args) {


    Student s=new Student();
        System.out.println(s.name);
        System.out.println(s.getStdID());

        System.out.println(s.isSuccessful());
       // System.out.println(s.getDisease());

        s.setDisease("Cancer");
        System.out.println(s.getDisease());
s.setStdGPA(4.0);
        System.out.println(s.getStdGPA());
}}
