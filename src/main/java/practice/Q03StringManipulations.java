package practice;

public class Q03StringManipulations {
    public static void main(String[] args) {
        /*
        String shirPrice="$12.99"
        String bookPrice="$35.99"

        type a code to find the sum of the shirt aand book  prices.

         */
        String shirtPrice="$ 12.99";
        String bookPrice="$ 35.99";

       // String shirt=shirtPrice.replaceAll("$ ","");
String shirt=shirtPrice.replace("$","");
String book=bookPrice.replace("$","");

//how can I convert String to double?? I should use double wrapper calss and put dot.
        //we can convert strings to do double numeric values cuz its not possible to operate math operations with strings

        double sd=Double.valueOf(shirt);
        double bd=Double.valueOf(book);
        System.out.println(sd+bd);

    }
}
