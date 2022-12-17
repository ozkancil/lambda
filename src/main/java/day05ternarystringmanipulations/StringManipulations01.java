package day05ternarystringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        /*
        strings are non primitve, non-primitives have values and methods in them.
        1) equals() method compares two strings by not ignoring cases.
        "Tom".equals("tom");==> false. upper case T diff than lower case t.
        equals() method returns boolean. what the functianality and what does it give you.
         */
        String a="asdf asd a sd a ";
        int b=a.length();
        System.out.println(b);
    }
}
