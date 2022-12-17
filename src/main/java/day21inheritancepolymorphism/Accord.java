package day21inheritancepolymorphism;



public class Accord extends Honda {
    public String sportDesign(){
        //if i run Accord class it will all Car and Honda class as well because the child calls the parents. Parents dont call child.
        return "All accords are in sport design";

    }
    public Accord(){

        System.out.println("Accord class constructor");
    }
}
