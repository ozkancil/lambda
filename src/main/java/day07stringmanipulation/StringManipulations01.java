package day07stringmanipulation;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str="Java is easy";
       boolean isExist= str.contains("a");//
        System.out.println(isExist);
        boolean exist=str.contains("java");
        System.out.println(exist);

        boolean start=str.startsWith("j");//
        System.out.println(start);
        // if u use startsWith() method with 2 parameters, second parameter means skip the first characters
        boolean result=str.startsWith("i",5);//this means skip first 5 characters and see if it gives 'i'
        System.out.println("startsWith() method with 2 parameters: "+result);

        /*
        example 1: Check if the given password has
          1)"A" in any position
          2)has "xy" at the beginning
          3) has "w" as 7th character
          4) has 8 characters in total
         */
        String pass= "xy1Amswi";
        boolean firstRule=pass.contains("A");
        boolean secondRule=pass.startsWith("xy");
        boolean thirdRule=pass.startsWith("w",6);
        boolean fourthRules=pass.length()==8;
        System.out.println("Is the password valid? "+(firstRule && secondRule && thirdRule && fourthRules));

        String s="Do practice to be better";
        boolean e=s.endsWith("r");//
        System.out.println(e);

        String b=s.concat("!").concat("...");//concat() method is same with the plus "+" in Java//
                                                    //if you use multiple methods side by side it is called method chain
        System.out.println(b);
    }
}
