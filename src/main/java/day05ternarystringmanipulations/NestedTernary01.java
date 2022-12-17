package day05ternarystringmanipulations;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        type java code by using nested ternary.
        write a program to check if a year is a leap year or not
        if the year is divisible by 100 then it must be divisible by 400.
        if a year is not divisible by 100 then it must be divisible by 4
        int a%100==0? (a%400==0?"leap year" :"Not leap year"):(a%4==0?"leap year":"Not leap year")
         */
        double a=60000;
        String leap=a%100==0 ? ( a%400==0?"Leap year": "Not leap year") : (a%4==0? "A leap year": "Not a leap yaer");
        System.out.println(leap);

        /*
        type code to check the password:
        if it has more than 8 charactgers, initial should be 'i'
         itf it haas no more than 8 characters iniatial should be 'k'
         solve the task by using nested ternary.
         */
        String pwd="ia1b3cxyz";
        pwd.length();
       String passwordLength= pwd.length()>8? (pwd.charAt(0)=='i'?"Valid" :"Invalid") : (pwd.charAt(0)=='k' ?"Valid":"Invalid");
        System.out.println(passwordLength);
    }
}
