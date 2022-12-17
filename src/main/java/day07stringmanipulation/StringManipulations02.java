package day07stringmanipulation;

public class StringManipulations02 {
    public static void main(String[] args) {
        String str="Java is OOP";
        String result1=str.replace("O","%");
        System.out.println(result1);
        String result2=str.replace("Java","wawa");
        System.out.println(result2);

        String st="Ali is 16 years old, I think he seems 13.";
        //Example 1: change all digits to "*" in the given string
       String rp= st.replace("13","*").replace("15","*");
        System.out.println(rp);
// if your code doesnt work for all values it is called hard coding.
        String r3=st.replace('0','*').
                replace('1','*').
                replace('2','*').
                replace('3','*').
                replace('4','*').
                replace('5','*').
                replace('6','*').
                replace('7','*').
                replace('8','*').
                replace('9','*');
        System.out.println(r3);

       String regex= st.replaceAll("[0-9]","*");
        System.out.println(regex);
                /*
                what is Regex= regular expressions.
                Regex represents a group of data
                All digits: [0-9]
                All lowercase letters: [a-z]
                All uppercase letters: [A-Z]
                All lower and uppercase letters: [a-zA-Z]
                All lower and uppercase letters and digits: [a-zA-Z0-9]
                Some multiple characters like a,e,i,o,u:[aeiou]

                All characters different digits:[^0-9]
                All characters different from letters:[^a-zA-Z]
                All characters different from vowels: [^aeiou]

                Space character: \\s
                All characters different from space character:\\S

                All digits:\\d
                All characters different from space digits: \\D
                All uppercase, lowercase, digits and _ : \\w
                Different from All uppercase and lowercase and digits and _ :\\W

                All punctuation marks: \\p{Punct}
                */
        /*
        example 2: Type code to check if a password is valid or not for the following conditions;
        password must have at least 8 characters different from space character
        password must have at least 1 symbol
         */

        String pwd="!1a23b4?es";
        String pwd1="a1 !2  s def";
        boolean firstRule=pwd.replaceAll("\\s","").length()>7;

        //password must have one 1 symbol
        boolean secondRule=pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        boolean secondRule1=pwd.replaceAll("[a-zA-Z0-9 ]","").length()>0;//so here i put a space between 9 and bracket and that clears space also.
        System.out.println(firstRule);
        System.out.println(secondRule1);
        System.out.println(secondRule);


    }
}
