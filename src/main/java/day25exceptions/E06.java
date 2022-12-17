package day25exceptions;

public class E06 {
    public static void main(String[] args) {
//       doCombo("null",2);//this can be NullPointerException, or NumberFormatException
//        //str.length() will throw NumberformatException or NullPointException.
//
//        doCombo("12a",2);//Integer.valueOf(str) will throw numberformatexception
//        doCombo("420",0);//will throw ArithmeticException
        doCombo2("null",2);
        doCombo2("12a",2);
        doCombo2("420",0);

    }
    //create a method, find the length of the string, and convert the string to an integer, and
    //divide the integer by a given number.
    public static void doCombo(String str, int num){
        try {
            int length = str.length();
            System.out.println(length);
            int intStr = Integer.valueOf(str);
            System.out.println(intStr);
            int result = intStr / num;
            System.out.println(result);
        }catch(NullPointerException e){
            System.out.println("There is a problem in finding length");
        }catch(NumberFormatException e){
            System.out.println("There is a problem in conversion");
        }catch (ArithmeticException e){
            System.out.println("There is a problem in division");
        }
        System.out.println("Execution did not stop");
    }




    public static void doCombo2(String str, int num){
        try {
            int length = str.length();
            System.out.println(length);

            int intStr = Integer.valueOf(str);
            System.out.println(intStr);

            int result = intStr / num;
            System.out.println(result);

        }catch(Exception e){
            System.out.println(e.getMessage());        }
        System.out.println("Execution did not stop");
    }
}
