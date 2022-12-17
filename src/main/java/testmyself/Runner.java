package testmyself;

public class Runner {
    public static void main(String[] args) {


        Constructors test=new Constructors();
        System.out.println(test.name);
        //System.out.println(test.num);
        System.out.println(Constructors.num);
        System.out.println("======================================2");

        Constructors test2=new Constructors("hasan", 7,10.5);
        System.out.println(test2.name);
        System.out.println(test2.num);
        System.out.println(test2.digit);
        System.out.println(Constructors.num);//i can do this way, meaning call the class name Constructor without an object because i made it a static, meaning that i can use only class name.
        System.out.println("======================================3");
        Constructors fourParameter=new Constructors("Fatih", 22,33,35);
        System.out.println(fourParameter.name);
        System.out.println(fourParameter.digit);
        System.out.println(fourParameter.x+" this is the int x i put. ");//u cannot call a variable without making it this.x=x; or else it will not out put
        //anyhting. So for u to call it you must do this. . if you dont do this. you can still give a value from another class but you cannot run it.

        System.out.println("======================================4");

        System.out.println(Constructors.add(4, 5));
        System.out.println(test.add(2,4));


    }

}
