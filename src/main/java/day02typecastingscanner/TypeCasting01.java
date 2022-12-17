package day02typecastingscanner;

public class TypeCasting01 {
    public static void main(String[] args) {
        //example 1: create 2 integer variables adn 1 string variable.
        int i=13, k=21;
        String s="Tom";
        System.out.println(i+k+s);//here it adds the numbers because it does numbers 1st,
        //so it does not do concatination first
        System.out.println(s+i*k);

//type casting
        int m=14;
        System.out.println(m);
        double d=m;
        System.out.println(d);/*for this we get 14.00 which makes it type casting because we used double we get a
        decimals
        */
        /*Explicit narrowing
        java does not put large data types into small data types.
         */
        int n=15;
        //byte b=n; java does not allow big ones to go into small ones. so we do casting.
        byte b=(byte)n;




    }
}
