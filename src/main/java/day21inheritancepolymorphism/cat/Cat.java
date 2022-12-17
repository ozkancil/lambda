package day21inheritancepolymorphism.cat;

public class Cat extends Animal {
String favFoodName;
    Cat(int age, String name, String favFoodName){
        super(age,name);
        this.favFoodName=favFoodName;

    }

}
