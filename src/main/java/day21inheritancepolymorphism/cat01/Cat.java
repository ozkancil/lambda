package day21inheritancepolymorphism.cat01;

import day21inheritancepolymorphism.cat01.Animal;

public class Cat extends Animal {
    String catFood;

   public Cat(int age, String name, String catFood){
        super(age,name);
        this.catFood=catFood;

    }
@Override
    public void add(int maxSpeed){
        System.out.println(super.maxSpeed+" super.");//super references the parent so give me 100. If i put this after this.maxSpeed=maxSpeed; it would give me 200.
       this.maxSpeed=maxSpeed;

   }
}
