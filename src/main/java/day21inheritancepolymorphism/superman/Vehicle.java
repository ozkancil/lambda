package day21inheritancepolymorphism.superman;

 public class Vehicle {
    //super() method is called a reference variable, and refers to the super class in an inheritance relationship.
    int maxSpeed=120;
    public void vroom(){
        System.out.println("Vroom vroom");
    }
    public void fast(){
        System.out.println("Im fast");
    }
    Vehicle(){//If I do not put this here, the maxSpeed inside the Vehicle() constructor gives an error.
        System.out.println("Vehicle constructor");
    }
     Vehicle(int maxSpeed){
//this.maxSpeed=maxSpeed; //this. is only for the class its in. super() can be used to call from another class. which is from child class.
         System.out.println("Vehicle constructor");
     }
}





class Car extends Vehicle{
    int maxSpeed=100; //so instead of doing like this we can do extends Vehicle. this technically makes it to maxSpeeds

    public void display(){
        System.out.println(super.maxSpeed);
        super.vroom();
    }
    public void vroom(){
        super.vroom();
        System.out.println("Skuurt");
    }
    public void fast(){
        super.fast();
    }
    Car(int maxSpeed){
        super();
        System.out.println("We are the constructor in Car class.");
        this.maxSpeed=maxSpeed;
    }

}
//class Main{
//public static void main(String[]args){
//    Car c=new Car();
//    System.out.println(c.maxSpeed);
//
//        }
//        }