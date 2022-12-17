package day21inheritancepolymorphism;

import org.w3c.dom.ls.LSOutput;

public class Human {

    public static void human(){
        Human h=new Human();

        System.out.println("Human method");
        Human.human();


        Male m=new Male();

        Female f=new Female();
    }


}
