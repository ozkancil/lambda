package day21inheritancepolymorphism.practice;

public class Cat extends Animal{
    String catFoodPreference;

    public Cat(int age, String name, String catFoodPreference){
//        this.age=age; //Here as you can see we are calling this from the Animal class which the int age and String name are already set to this.
//        this.name=name;// So for this reason we can use super() to call the animal method.

        //super() must be the first line. The reason we did super() here is cuz we dont need this.age=age; this.name=name;
        super(age,name);//Here we used super() to call age and name from Animal class without needing to this.
        //if i was to take out super() method above then from the SuperDuper class my results would show 0 for age and null for string, cuz i either have to do
        //this.age/name=age/name; or I have to use super(age,name);
        //Also it doesnt make sense here if we used super classes construction method from another method like from makeNoise, cuz it would give error
        //So constructors for super() methods only can be used inside of that sub/child classes constructors. So here we are using it in Cat class constructor.

        this.catFoodPreference=catFoodPreference;
    }
   @Override//we use @Override annotation here because I am taking makeNoise method
    //from Animal class and adding a actual voice to Cat class.
    public void makeNoise(){
        //super(age, name);Gives error
        super.makeNoise();//this lets me call the makeNoise() method from the Animal class without making a constructor for it to run it from the SuperDuper class.
        //One constructor for the Cat myCat=new Cat(); constructor lets me call the Animal class method for makeNoise(){ sout("Hello, I'm an animal").
        //We can use super class in another method example: check jump(){} method below. However, mainly super is used inside its own method name.
        //NOTE: Notice how I made a makeNoise(){} method in Cat class same as Animal class, and wrote a different outcome (sout) inside of Cat classes makeNoise(){}
        //method. And the Reason I used super() method wasnt because I am not able to call makeNoise() method, but because, I am able to call the makeNoise(){}
        //We want to use super() when we override an implementation from a parent class, like makeNoise();
        //super(); method can only be used inside that classes method to call a super class(parent class).
        //We can't use super() method to access private methods in parent class.
        super.eat();
        //method from the Cat class and go to my Runner Class SuperDuper and access the Animal class makeNoise(){} method without making an object of Animal Class.
        //super.doSomethingPriavte(); It wont let us call.
        System.out.println("Meow meow meow");//Now because i Override the makeNoise method from Animl class
        //when i run it in SuperDuper class I will see "Meow meow meow" but I do not see the Animal class
        //method of makeNoise() which says sout("Hello, i'm an animal"). To call from the animal class and make it
        //say the Animal class method of makeNoise() we will use super() method

    }
    public void jump(){
        super.makeNoise();
}

}
