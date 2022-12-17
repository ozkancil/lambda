package testmyself.thisinvokingamethod;

public class Class {


    Class() {
        this(2);

        System.out.println("This parenthesis");
    }

    Class(int x) {
        //this();
        System.out.println(x);
    }
}
    class ex{
        public static void main(String[] args) {
            Class b=new Class(3);
            Class b1=new Class();
            Class b2=new Class(4);
            Class b3=new Class(5);



        }
    }


