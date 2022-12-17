package day21inheritancepolymorphism.cat;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat c = new Cat(4, "lucky", "PetBestFood") ;
        System.out.println(c.age+" "+c.name+" "+c.favFoodName);




    }
}