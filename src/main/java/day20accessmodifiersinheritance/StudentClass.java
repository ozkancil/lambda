package day20accessmodifiersinheritance;

 public class StudentClass {

    //It has imported day20accessmodifier package
    //only name is visible cuz its public.
    //when you go out side of the class private is no visible
    //You cant see default as well, only open to small group. employees only. u
    //cannot see it outside the package
    //default modifier is called package private cuz when u are outside of the package u cant see it
    //protected one. it means for a group and their childs. TestRunner01 is in a different package so its not the
    //child of this class.

    /*
    1. public is accessible from all other packages no restrictions
    2. private can be used only from inside the class it was created in
    3. default can be used just inside the day20accessmodifiersinheritance package
    It can be used just inside the package it was created
    4. protected can be used in the package it was created in, and from the child classes in other
    packages.
     */

    String stdName="Tom Hanks";
   private String stdID="TH202217007";
    double stdGPA=3.83;//if you want to make access modifier default, because automatically it will be default.
  protected String stdAddress="Miami, FL USA";
   //public, private, default, protected
    /*
    student is the child of parent class.
     */

    /*
    if its static use class name, if its not static use object.
     */
  public static  String Name="Tom Hanks";
    private static String ID="TH202217007";//it can only be accessed from its own class. no other.
    static double  GPA=3.83;//
    protected static String Address="Miami, FL USA";


    /*
    1-->what is the difference between default and protected access modifiers?
   1: protected access modifier is wider then default access modifier. because
    protected is open to child classes from other packages as well.
    protected ones can be used from the classes from other packages if the classes
    are child classes.
   2: default ones can not be used from out-side the package.
    there for its other name is package private.

   2--> Could you please tell the names of the access modifiers from teh narrowest to the widest?
    Narrowest to widest:
    1)private
    2)default
    3)protected
    4)private

    3--> Could you please explain all access modifiers?

    NOTE: classes cannot be protected

     */




}
