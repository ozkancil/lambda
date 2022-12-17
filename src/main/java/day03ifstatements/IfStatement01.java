package day03ifstatements;

public class IfStatement01 {
    public static void main(String[] args) {
        //if statement: we need to execute some codes under some specific conditions
        //if it rains i will cancel the picnic
        //if statemtns are called condinional statments. they have if and then. a condition and a result.
        //if condition is true result will be activated. if condtino is false the result will not be activated.
        //example: Type code to print negative for the numbers less than zero, non-negative for the numbers greater than or equal ot zero.

        double d=2.3;

        if (d<0){
            System.out.println("Negative");

        }
        if(d>=0){
            System.out.println("Non-negative");
        }

        //Example2: type code to print divisible by 5 if th3e number can be divided by 5. otherwise print not divisible by.
       int i=14;
        if(i%5==0){   //= assignemnt. == means equals. so here i%5 the remainder is zero so we are saying 0==0. %(modules operator) gives us the remainder.
            System.out.println("Divisible by 5");

        }
        if(i%5!=0){
            System.out.println("Not Divisible by 5");
        }

        //2. way. this way is faster. customers like that. dont do repetitions and make java work less.
        int k=1;
        if(k%5==0){
            System.out.println("div by 5");
        }else{
            System.out.println("not div by 5");
        }




    }
}
