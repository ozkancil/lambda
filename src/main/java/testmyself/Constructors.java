package testmyself;

public class Constructors {
    String name="yavuz";
  static  int num=4;
    double digit=10;
    int x=5;

    public Constructors(){
        name="ozkan";
        num=3;
        digit=2.3;

    }
    public Constructors(String name, int num, double digit){

        this.name=name;
        this.num=num;
        this.digit=digit;

    }
    public Constructors(String name, int num, double digit, int x){

        this.name=name;//here by doing this i made it changeable from the Runner class. and the reason it shows yavuz not fatih is because here i have 4 parameters passed
        //-but on the other one i have 3 parameters passed where i used this.name=name; for this reason when i call fatih from here without doing this.name=name;
        //-and run the code from Runner class it will show yavuz because it was hard coded as yavuz
        //if i hadnt done this.name=name; then it wouldnt have worked and would still keep yavuz.
        //x=9;// this makes it read before the runner class, which the answer is 35 in runner class.
        this.x=x;//without putting this. here it will out put zero from the Runner class.
        //x=3;this makes the x read from the runner class.

    }
    public static int add(int a, int b){// this is a method, so we can use the class from Runner to call it. I would use Constructors.add(){  }
        //the reason we can use class to call it is cuz its static.

        return a+b;
    }


}
