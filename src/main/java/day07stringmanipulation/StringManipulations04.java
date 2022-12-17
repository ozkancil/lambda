package day07stringmanipulation;

public class StringManipulations04 {
    public static void main(String[] args) {
        String str="String is a non-primitve data type in Java";
       Boolean empty= str.isEmpty();//isEmpty() method returns the true if the string goes not have any character, returns false if the string has any chaatacter.
        //str.length()==0; and isEmpty() has same meaning. Using isEmpty() is preferable.
        System.out.println(empty);
        //isEmpty("")==> true, isEmpty(" ")==>False

        str.isBlank();
        //isBlank("")==>true, isBlank(" "); ==>true

        //Example 1: Check if a string has just a letters and spaces in it. so its saying check to see if you have only words and spaces.
        //to do this you would do .replaceAll("[a-zA-Z "); and we gave space. now if i do isEmpty() at end and comes out true, then we know we only
        //had letters and spaces in there.
        String s="Learn Java earn money";
        boolean space=s.replaceAll("[a-zA-Z ]","").isEmpty();
        System.out.println(space);

        /*
        example 2: check ssn for the following rules
        it must have just digits
        it must have 9 digits
         */
        //1st to check if its only digits do this
        String ssn="123495678";
        boolean rep=ssn.replaceAll("[0-9 ]", "").isEmpty();
        System.out.println(rep+" --> Only digits or not");

        //2nd. To see if it has 9 digits do this
        boolean secondRule=ssn.length()==9;
        if(rep && secondRule){
            System.out.println("Valid ssn");
        }else{
            System.out.println("Invalid ssn");
        }


    }
}
