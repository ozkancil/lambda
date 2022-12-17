package practice;

public class TernaryCheckPassword {
    /*
    Type code to check the password
If it has more than 8 characters, initial should be 'i'
If it does not have more than 8 characters initial should be 'K'
Solve the task by using nested-ternary
     */
    public static void main(String[] args) {


        String p = "XXXXXXXX";
        boolean length = p.length() > 8;
        System.out.println(length);
        if(length){
            if(p.charAt(0)=='i'){
                System.out.println("initial at index zero is i");
            }else{
                System.out.println("initial is not i");
            }
        }else{
           boolean k= p.charAt(0)=='K';
            System.out.println(k);
        }

    Object ternary=    p.length()>8?   (p.charAt(0)=='i'? "Initial is i and length is longer than 8":"initiial is not i") :
            (p.charAt(0)=='K'? "less then 8 initial is k":"initial is not k");  //p? ?(:):?(:)


    }
}