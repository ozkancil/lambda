package day21inheritancepolymorphism.practice;

public class SuperDuper {
    public static void main(String[] args) {


    //Lets create a new cat
    //Because we are using Cat(); class to call all methods, using super() method will help simply the syntax and allow use to print it from call Cat(); constructor
        //while keeping the code looking neat.
    Cat myCat=new Cat(3,"George","Purina one");
        System.out.println(myCat.age+", "+myCat.name+", "+myCat.catFoodPreference);
    myCat.makeNoise();//Here with this we get "Hello, I am an animal" from Animal class and prints that first, because when printing
    //it goes from parents down to child. Then we get "Meow, meow, Meow" which comes second cuz its in the child class.


    myCat.eat();//The reason I can call eat() is because I did not override eat() method in Cat class, so cuz Cat extends into Animal class
        //I can call eat() method with myCat obj.
    //The Cat object can call eat() from Animal class because Cat extends
        //to Animal class. So Cat class is a child of Animal class.
        //If i wanted to use super.eat(); and call it once with the makeNoise(); I can.
        //In console you can see I have 1st: "Hello, I am an animal"
                                     //2nd:"Munch Munch"
                                    //3rd:"Meow meow meow"
        //The reason for this is because I used super() method to call eat() method inside of makeNoise method in Cat class, which
        //erases the need to create an object for eat() method or to call it.



//    Animal myAnimal=new Animal();
//    myAnimal.makeNoise();

}}
