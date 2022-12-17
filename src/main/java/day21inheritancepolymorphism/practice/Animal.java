package day21inheritancepolymorphism.practice;

public class Animal {
    int age;
    String name;

    //public Animal(){} //if i was to delete this and delete the super() for Cat class for the Cat construction it would give an error becuase it is
    //automatically calling arguments (args) from this. But if I do this.age/name=age/name; still gives an error in Cat class constructor. If do super(age,name); then it would not
    //give an error. when i use super() its calling on another constructor which is Animal with the parameters(arguments)

    public Animal(int age, String name){
        this.age=age;
        this.name=name;
    }


     void makeNoise(){
        System.out.println("Hello, I am an animal");
    }
    public void eat(){
        System.out.println("Munch munch");
    }
    private void doSomethingPrivate(){
        System.out.println("Do someting private");
    }

}
