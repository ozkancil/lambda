package testmyself;

public class VariablesWithStaticBlocksInstances {

    //we can create variables inside the class and outside of all methods, constructors and static blocks, but where they go depends on
    //the statement it puts forth.
    public static String name="hasan";
    public String lastName="Cil";
    public String test1="test 1 works";
    public static String test2="Test 2 does work";

    static {
        System.out.println("This is static block");
       System.out.println(name);
       System.out.println(test2);
    }

    public static void main(String[] args) {
        System.out.println("This is the main method");

    }
    public VariablesWithStaticBlocksInstances(){//inside constructors on static ones work. Constructors are automatically static
        //so when u do sout u can only call out static inside the constructors, but you can this. and call all from another classRunner
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println("=========");
        this.name=name;
        this.lastName=lastName;
        this.test1=test1;
        this.test2=test2;
    }
    static{//so when we call a constructor from another class static classes are called as well.
        System.out.println("static block 2");
    }
}
