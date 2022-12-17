package day21inheritancepolymorphism.superman;

public class Main {
    public static void main(String[] args) {

        Car c=new Car(130);// because i added a parameter to this Car constructor, it reads everything inside the Car constructor first.
        //Then gives the rest. THen goes inside vehicle class which calls the Vehicle constructor first. But it would still call cuz it is extends to vehicle .
        System.out.println(c.maxSpeed);
//c.display();//it shows 120 becuase now i used super() to reference the parent class maxSpeed variable.
        //so becuase super() is a reference to the parent, it will call the maxSpeed for the parent.
       // System.out.println(c.display()); this does not work.
//so we used super() on methods. Now lets use super on variables
       // c.vroom();
       // c.fast();


    }
}
