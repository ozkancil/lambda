package day18datetimeclassvargs;

public class Varargs01 {
    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.println(add(4,6,2));
//    }
//    //create a method adds two integers
//    public static int add(int a, int b){
//        return a+b;


    }

    //create a method adds three integers
//public  static int add(int a, int b, int c){//no need to type int a, int b, etc. we just use var args which is int...// means like endless...
  //      return a+b+c;

   // }
    /*
    1st: if u want to make number of parameters flexible in a method. use varargs
    2nd: To create varargs "Data type + ...+ space + a name for the varargs
    3rd: Varargs use arrays behind it. When u work with varargs you may think you are working with arrays
    4th: Varargs can accept zero or more elements
    5th: CaN I use another parameter after varargs? No. So no other parameter after varargs because varargs cannot be made full. second parameter will be
    unreachable.
    Varargs must be last parameter everytime.
    6th: Can I use another regular parameter before varargs? Yes.
    7th: Can I use multiple varargs paarameter in a method? No. Cuz in the 5th rule we saw that varargs is the last one so that nothing comes after that.
    8th: you do not need to assign anything to varargs.
     */



    int sum=0;
    public static int add(int...a){ //we cant do add(int...a, int b) we cant do this because its an endless hole that we cant fill.
        //but we can do add(int b, int...a)  putting int b allows it cuz its before and int b is full.
        int sum=0;
        for (int w:a){
            sum=sum+w;
        }
        return sum;

    }
}
