package practice;

public class Q04MethodCreation {
    /*
        create a method prints greetings by using the given name
         Ali==> Hi Ali                Tom==> Hi Tom
         */
    public static void main(String[] args) {

        System.out.println(addInteger(25,8));
        System.out.println(addInteger(30,5));



    }
    public static String greetingUser(String name){
        return String.format("Hi", name+"!");
    }
    public static int addInteger(int a, int b){
        return a+b;//11
    }
}
