package day32lambda;

import java.util.List;

public class UtilsClass {

    public static void printLine(Object str){

        System.out.print(str + " ");

    }
public static boolean checkToBeEven(int x){
        return x%2==0;
}
public static boolean checkToBeOdd(int x){
        return x%2!=0;
}
public static int getSquare(int x){
        return x*2;
}
public static int getCube(int x){
        return x*x*x;
}
public static int sum(int x){
        return x+x;
}
public static double half(int x){
        return x/2.0;
}
public static char getLastChar(String a){
      return  a.charAt(a.length()-1);

}
public static char getFirstChar(String a){
        return a.charAt(0);
}
public static int getSumOfDigits(int x){
        int sum=0;
        while(x!=0){
            sum=sum+x%10;
            x=x/10;
        }
        return sum;
}
}
