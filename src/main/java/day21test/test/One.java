package day21test.test;

public class One extends Two{
    One(){//because it extends we have to have a Constructor with a parameter that has nothing in it in class Two()
super(); //here tells constructor go to parent claass and get constructor without any parameters.
        System.out.println(2);
    }

}
