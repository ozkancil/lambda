package day21test;

public class CarRunner {
    public static void main(String[] args) {


//NOTE: THIS CONSTRUCTORS WILL CALL OTHER CONSTRUCTORS. TO CALL METHODS WE NEED TO USE THE OBJECT LIKE THIS: c.carMethod(); c.method(); etc.
    Civic c=new Civic(344,"No");
        System.out.println(c.speed);
        System.out.println();
    Civic d=new Civic(2021);
//super() can be used with parameters as well as super(true)
        //super("hybrid"), super(2021)
        //when a class has multiple  constructors we select the constructor we need with super() parameters.
        System.out.println(d.speed);
}}
