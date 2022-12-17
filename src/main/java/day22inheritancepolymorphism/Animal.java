package day22inheritancepolymorphism;

public class Animal {
    public String name="Animal";

    //Overridden method
    public void eat(){
        System.out.println("Animals eat...");
        //method overriding is when we want to change things to specific.
    }
    public Animal create(){//this is an animal object so we made the method return type Animal
        return new Animal();

    }

    public Integer add(){
        return 12;
    }
    public int multiply(){
        return 24;
    }
    public final int divid(){
        return 34;
    }
    private boolean isRetired(){
        return true;
    }
    public static int counter(){
        return 5;
    }
}
