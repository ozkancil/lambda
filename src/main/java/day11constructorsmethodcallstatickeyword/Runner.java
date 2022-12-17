package day11constructorsmethodcallstatickeyword;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
               //input is the object name
        //Scanner input=new Scanner(System.in);//this is the syntax to create an object. we are creating object.
        //create an object from "Car" class.
        //we are creating an object from car class.
        Car audi=new Car();//this will create an object from the "Car" class.
        //Car() is a constructor. Here java goes to Car.java class. inside the Car.java class it will find the constructor.
        //then it will execute that code.
        //NOTE: CONSTRUCTOR name is same as the class name so the constructor knows to go to the car class.
        System.out.println(audi.make);

    Car bmw=new Car("BMW","M5",2022,50000);
        System.out.println(bmw.make);
        System.out.println(bmw.model);
        System.out.println(bmw.year);
        System.out.println(bmw.price);
        System.out.println("=================");
        Car mercedes=new Car("Mercedes","C300",2023,60500);
        System.out.println(mercedes.make);
        System.out.println(mercedes.model);
        System.out.println("====================");
        Car itCar=new Car("Roles Royce","cullinan",2000);


       System.out.println(itCar.make);
        System.out.println(itCar.model);
        System.out.println(itCar.price);
        System.out.println(itCar.year);

        //we made an object
        Static01 obj1=new Static01();
        Static01 obj2=new Static01();
        Static01 obj3=new Static01();
        System.out.println(obj3.nonStaticCounter);//1
        System.out.println(obj3.staticCounter);//3 --> so the reason we get 3 for this is because its static so the three objcts we have created
        //-is constantly added to the obj one by one
        //obj1 =1; obj2=2, obj3=3. Do to it being static a plus 1 is added each time.
        //For nonStatic it only adds once because it does not pull from the other objs. it creates a plus one for each object.
        //nonStatic does not add ontop of the other objects.
        //FOR STATIC WHEN YOU DO AN UPDATE IT WILL COMPILE ALL UPDATES AND GIVE A OVERALL RESULT
        //FOR NON STATICS WHEN U UPDATE IT WILL GIVE INDIVIDUAL UPDATES. SO WE WILL SEE EACH UPDATE ONE BY ONE. AND NOTHING WILL CHANGE


        System.out.println(obj3.staticCounter);//the reason we get 3 for each obj3 is because static makes it so the change is true for all static objects.
//if it is not static do not attach it to the class
//if it is not static attach it to the object
        //Non-static variables are named as object variables or instance variables
        //to access static u dont need object you just need class.
        //for accessing nonstatic we need objects.



    }
}
