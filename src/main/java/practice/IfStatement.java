package practice;

public class IfStatement {
    public static void main(String[] args) {


    /*
    Type code to check the grammatical rules for full name
    a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
    b) Your code should print "First name or last name missed" for single words like
"Ali" or "Can" or "ali"
    c) Your code should print "Format error" for all the format like "ALI CAN"
    d) Your code should print "Name was not entered" for one or more space
    characters like " " or " "
    e) Your code should print "Invalid Name" if the name has any character different
    from letters and space.
    Note: If the abbreviation has more than 1 error all related error messages should be
    printed. For example; for "ali3" your code should print "Error in initials", "First name
    or last name missed", and "Invalid Name"

     */
        String fullName = "Ali Can";
        String first = "Ali";
        String last = "Can";
        String a=fullName.substring('A','C');
        System.out.println(a);
        Integer indexOfSpace = fullName.trim().indexOf(' ');
        int fullNameSpaceIdx=fullName.trim().indexOf(" ");
        String indexOfLastName=fullName.substring(fullNameSpaceIdx+1,fullNameSpaceIdx+4);
        System.out.println(indexOfLastName);
        System.out.println(indexOfSpace);
        if (first.charAt(0) == 'A' && first.charAt(1) == 'l' && first.charAt(2) == 'i' && last.charAt(0) == 'C' &&
                last.charAt(1) == 'a' && last.charAt(2) == 'n' && !last.equals("")) {
            System.out.println("correct");
        } else {
            System.out.println("Wrong");
        }


    /* Type code to check if a given integer is palindrome or not
         ex: same String or integer in reverse
            ex: 121 ==> 121  123321 == 123321  nalan ==> nalan
         */

//        String str = "nalan";
//        String reverse = "";
//        int idx = str.length() - 1;
//        int counter = 0;
//
//
//        if (counter == 4){
//
//        while (idx > -1) {
//            reverse = reverse + str.charAt(idx);
//            idx--;
//        }
//        if (str.equals(reverse)) {
//            System.out.println("palindrome");
//
//        } else {
//            System.out.println("not palindrome");
//        }
//    }counter++;
//        System.out.println("we are at 4");

    /*
    Type code to check the format of state abbreviations in the USA
a) Your code should print "State abbreviations cannot have more than 2 characters" if the
abbreviation has more than 2 characters
b) Your code should print "State abbreviations cannot have lowercase characters" if the
abbreviation has lowercase characters
c) Your code should print "State abbreviations cannot have characters different from
letters" if the abbreviation has characters different from letters.
     */
        String state="FL";
        boolean an =state.replaceAll("[a-z]","").length()>2 ;

        if (state.length()>2){
            System.out.println("Not state abbreviation");
        }
    if (an){
        System.out.println(" not proper abbreviation");
    }

    }

}
