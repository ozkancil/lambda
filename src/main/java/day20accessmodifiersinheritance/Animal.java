package day20accessmodifiersinheritance;

public class Animal {
    //update and repetition is hard.
    //so we put common functionalities in one class, and remove from other classes.
    //for eats and drink we have it written once. and once we update it then its good.
    //so we will say go to animal class and take eat(); drink() for dog,cat, bird.
    //so we will make cat, dog, bird classes child of animal class so that we can use it.

    public void eat(){
        System.out.println("animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }

    public static void main(String[] args) {


        Cat cat = new Cat();
        System.out.println(cat);

    }
}
