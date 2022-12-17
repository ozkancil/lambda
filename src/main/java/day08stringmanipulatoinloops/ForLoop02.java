package day08stringmanipulatoinloops;

public class ForLoop02 {
    public static void main(String[] args) {
        //1Example: Put "*" btwn 2 consecutive characters and to the end in a String. For example; Java ==> j*v*a*
        String ste="java";

        for (int i=0;i<=ste.length()-1;i++){
            System.out.print(ste.charAt(i)+"*");
        }

        System.out.println();
        //Example 2: type code to print unique characters in a string. Hello==> Heo
        String str="Hello";
        for (int i=0; i<str.length();i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {//What is happening here is that we are comparing the indexes of all the string
                //If indexes of first occurrence and last occurrences equal each other than those are unique. If not, then it is two different indexes of the same
                //character.
                System.out.print(str.charAt(i));
    }
        }


    }
}
