package practice.day18varargs;

public class Varargs01 {
    public static void main(String[] args) {



    }
        int sum=0;
        public static int add(int b, int...a){ //we cant do add(int...a, int b) we cant do this because its an endless hole that we cant fill.
            //but we can do add(int b, int...a)  putting int b allows it cuz its before and int b is full.
            int sum=0;
            for (int w:a){
                sum=sum+w;
            }
            return sum;

}}
