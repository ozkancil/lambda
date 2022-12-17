package day05ternarystringmanipulations;

public class Ternary01 {
    public static void main(String[] args) {
        //What is ternary?
        //if an integer is positive print "The integer is positive" otherwise print "the integer is not positive"
        int i=12;

        if(i>0){
            System.out.println("The integer is positive");
        }else{
            System.out.println("The integer is not positive");
        }
    //2nd Way; ternary
             //     condition       will be selected for true condition           : will be selected for false condition
        String result=i>0 ?"The integer is positive":"The integer is not positive"; //1st part if its true. second part if its not true.
        System.out.println(result);

        //Type a program to print the minimum of 2 double on the console. use ternary
        //12,23=>12,     345,23=>23       -12,-3==>-12
        double d=1.2,e=2.3;
        double min=d>e ?e:d;// meaning of : is else.
        System.out.println(min);

        double a=2, b=5;
       double num= a>b ? b:a;
        System.out.println(num);

        /*
        calculate absolute value of a num
        for positive numbers and zero absolute value is the same with the number
        for negative numbers to find absolute value multiply the number by -1
         */
        int c=12;

        int absoluteValue=c>0 ? c:-1*c;
        System.out.println(absoluteValue);


        int n=1,m=2;//ternary is used for if else
       int minNum= n>m ? m:n;
        System.out.println(minNum);

        double f=-12.4;

        double absltValue=f>=0? f:f*-1;
        System.out.println(absltValue);

       double abs= f<0? -1*f:f;

       /*
       you have 2 integers,
       if both of the integers are positive do multiplication.
       otherwise, return "i do not know how to multiply"
        */
        //object data type can be used for all data types whenever we need
        int int1=12, int2=3;
       Object res= int1>0 && int2>0? a*b: "I do not know how to multiply";



    }
}
