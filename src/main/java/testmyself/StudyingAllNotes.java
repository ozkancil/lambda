package testmyself;

import java.util.Scanner;

public class StudyingAllNotes {

   static String make="Honda", model="civic";
    int year=2019, price=30000;

    public static void main(String[] args) {
//      Scanner scan=new Scanner(System.in);
////        char b=scan.next().charAt(2);
////        char a=scan.next().charAt(0);
//
//        /*
//        type java code by using nested ternary.
//        write a program to check if a year is a leap year or not
//        if the year is divisble by 100 then it must be divisible by 400.
//        if a year is not divisible by 100 then it must be divisible by 4
//         */
//        double leap=1600;
//
//       String leapYear= leap%100==0? (leap%400==0?"Leap year":"Not a leap year") :(leap%4==0?"Leap year":"Not a leap year");
//        System.out.println(leapYear);
//
//        //exmaple: print the first nad the last character of the given String on the console "java is easy"
//        String java="java is easy";
//        for(int i=0; i<java.length();i++){
//            if(i==0) {
//                System.out.println(java.charAt(0));
//            }
//            if(java.lastIndexOf(java)==java.length()-1)
//System.out.println(java.charAt(java.length()-1));//}
//            System.out.println("================");
//System.out.println(java.lastIndexOf(java));
//        }
//
//        System.out.println("Last character");
//        String lastCharacter=java.substring(java.length()-1);
//        System.out.println(lastCharacter);
//        System.out.println(java.charAt(java.length()-1));
//        System.out.println(java.length()-1);//when we do length we are getting the length.
//
//        System.out.println("Get initials of the first and last name");
//        String ozkan=" Ozkan cil ";
//        System.out.println(ozkan.trim().charAt(0));
//        System.out.println(ozkan.trim().substring(0,1));
//
//        System.out.println("get initial of last name");
//        System.out.println(ozkan.trim().split(" ")[1].substring(0,1));
//
//
//        System.out.println("Get how many words are in a sentence");
//        String words="words are to good to be true, actions";
//
//        System.out.println(words.trim().split(" ").length);
//        System.out.println();
//
//
//
//        System.out.println("=========================");
//        String s="I like to study java, learn java earn money, java is easy";
//        int idx=s.indexOf("java");
//        System.out.println(s.indexOf("java"));
//        System.out.println(idx+1);
//
//        System.out.println("==============");
//        String word="I like to a study";
//        System.out.println(word.indexOf("x")==-1);
//        System.out.println(word.contains("r"));
//        System.out.println(word.indexOf("x"));
//
//        System.out.println("==========================");
//        //example 5; type a code if a character is unique in a string or not
//        // hello==> h is unique, e is unique, o is unique
//        String hlo="Hello word r";
//        if(hlo.indexOf("r")==hlo.lastIndexOf("r")){
//            System.out.println("unique");
//        }else{
//            System.out.println("Not unique");
//        }
//
//        System.out.println(hlo.indexOf("like"));
//
//
//        String str="Ali is 13 years old, I like Ali, Ali does not like me!....";
//        //example1: how many punctuation marks are used in the given string
//        System.out.println();
//        int length=str.length();
//        int length2=str.replaceAll("\\p{Punct}","").length();
//        System.out.println(length-length2);
//
//
//        System.out.println("=====================");
//
//        String st="Ali is 16 years old, I think he seems 13.";
//        //Example 1: change all digits to "*" in the given string
//        System.out.println(st.replaceAll("[0-9]","*"));
//
//        System.out.println("=====================================");
//         /*
//        example 2: Type code to check if a password is valid or not for the following conditions;
//       1) password must have at least 8 characters different from space character
//        2)password must have at least 1 symbol
//         */
//        String pwd1="a1 !2  s def";
//        boolean rule1=pwd1.replaceAll("\\s","").length()>7;
//        boolean rule2=pwd1.replaceAll("[a-zA-Z0-9]","").length()>0;
//
//        System.out.println(rule1+"======"+rule2);
//
//        System.out.println("=====================================");
//        //Example 1: Check if a string has just a letters and spaces in it. so its saying check to see if you have only words and spaces.
//        //to do this you would do .replaceAll("[a-zA-Z "); and we gave space. now if i do isEmpty() at end and comes out true, then we know we only
//        //had letters and spaces in there.
//        String ss="Learn Java earn money!";
//       String replace= ss.replaceAll("[a-zA-Z ]","");
//      boolean blank= replace.isBlank();
//        System.out.println(blank);
//        boolean blank1=replace.length()==0;
//        System.out.println(blank1);
//
//        System.out.println("========================");
//
//        /*
//        example 2: check ssn for the following rules
//        it must have just digits
//        it must have 9 digits
//         */
//        //1st to check if its only digits do this
//        String ssn="123!34564";
//        boolean digitss=ssn.replaceAll("[0-9 ]","").length()==0;
//      boolean digits=ssn.replaceAll("[a-zA-Z ]","").length()>8;
//        boolean digits2=ssn.replaceAll("[a-zA-Z ]","").length()==9;
//        System.out.println(digits);
//        System.out.println(digits2);
//        System.out.println(digitss);
//
//
//        /*
//        example 1: String shirtPrice="$12.99"
//        String bookPrice="$35.99";
//        Type the sum of both variables
//         */
//
//        String shirtPrice="$12.99";
//        String bookPrice="$35.99";
//        String shirts=shirtPrice.replace("$","");
//        String book=bookPrice.replace("$","");
//        double shirts1=Double.valueOf(shirts);
//        double books=Double.valueOf(shirts1);
//        System.out.println(shirts1+books);
//
//        int shoes=12;
//        int hat=5;
//        String shoes1=String.valueOf(shoes);
//        String hat1=String.valueOf(hat);
//        System.out.println(shoes1+hat1);
//
//
//        System.out.println("======================");
//        String string="Hello";
//        for (int i=0;i<string.length();i++){
//            if (string.indexOf(string.charAt(i))==string.lastIndexOf(string.charAt(i))) {
//                System.out.println("Unique ones-->" + string.charAt(i));
//                //System.out.println("Not unique");
////            }else{
////                System.out.println("Not-Unique ones-->"+string.charAt(i));
////            }
//            }}
//
//        System.out.println("======================");
//        String hello="Words are too good";
//        for (int i=0;i<hello.length();i++){
//            boolean c=hello.indexOf(hello.charAt(i))==hello.lastIndexOf(hello.charAt(i));
//            System.out.println(c);
//        }
//
//        System.out.println("======================");
//            String l="lost boy come";
//            for (int i=0;i<l.length();i++){
//                //System.out.println(l.indexOf(l.charAt(i))==l.lastIndexOf(l.charAt(i)));
//                if (l.indexOf(l.charAt(i))==l.lastIndexOf(l.charAt(i))){
//                    System.out.print(l.charAt(i)+" ");
//                }
//            }
//
//        System.out.println("======================");
///*
//type code to reverse tom
// */
//        String tom="Tom";
//        for (int i=tom.length()-1;i>-1;i--){
//            System.out.println(tom.charAt(i));
//        }
//
//        String o="ozkan";
//        String reverse="";
//        for (int i=o.length()-1;i>-1;i--){
//            char c=o.charAt(i);
//            reverse=reverse+c;
//
//        }
//        System.out.println(reverse);
//
//        //find the integers from 3 to 6
//        int t=3;
//        int sum=0;
//
//        for (int i=3; i<7;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);
//
//        // find the sum of the modules of digits of an integer from 585 to 0
//        //584 ==> 5+8+4=17
//        //Note: "number %10" gives you the last digit
//        int m=584;
//        int sum1=0;
//        for (int i=584;i>0;i=i/10){//so we do i=i/10. we do this cuz we get the 4,8,5, so then we get the module
//            //-using %.
//            sum1=sum1+i%10;
//        }
//        System.out.println(sum1+" this is ");
//
//        //example 1: type code to print characters in a string, except "m"
//        // for example: andromeda==> andro(m)eda
//        String an="andromeda";
//        for (int i=0;i<an.length();i++){
//            char c=an.charAt(i);
//            //if (an.charAt(i)!='m')
//            if (c!='m'){
//                System.out.println(an.charAt(i));
//                continue;
//            }
//        }
//        System.out.println("=======================");
//        String v="andromeda";
//        for(int i=0;i<v.length();i++){
//            if (v.charAt(i)=='m'){
//                continue;
//            }else{
//                System.out.println(v.charAt(i));
//            }
//        }
//        System.out.println("==========================");
//        String v1="andromeda";
//        for (int i=0;i<v1.length();i++){
//            if (v1.charAt(i)=='m'){
//                continue;
//            }
//            System.out.println(v1.charAt(i));
//
//        }
//        System.out.println("==========================");
//
//        String v2="andromeda";
//for (int i=0;i<v2.length();i++){
//    char c1=v2.charAt(i);
//    if (c1!='m'){
//        System.out.println(c1);
//    }
//}
////example 3: write code to find the sum of the unique digits in an integers
//        //user will give 1232==> 1+3=4. dont add 2 cuz they are repeated
//        System.out.println("enter the digits");
//String digits1=scan.next();
//int add=0;
//
//for(int i=0;i<digits1.length();i++){
//    char c=digits1.charAt(i);
//    System.out.println(c+" this is for first char example");
//    if (digits1.indexOf(c)==digits1.lastIndexOf(c)){
//        add=add+Integer.valueOf(c);
//
//    }
//    System.out.println("This is char "+add);
//
//}
////        System.out.println("========================================");
////        System.out.println("enter the digits");
////String dig=scan.next();
////int sum3=0;
////for(int i=0;i<dig.length();i++){
////    String dig1=dig.substring(i+1);
////
////}
//
//
//        //example 3: write code to find the sum of the unique digits in an integers
//        //user will give 1232==> 1+3=4. dont add 2 cuz they are repeated
//        String d="123";
//int sum4=0;
//for(int i=0;i<d.length();i++){
//    String lenght=d.substring(i,i+1);
//    if(d.indexOf(lenght)==lenght.lastIndexOf(lenght)){
//        sum4=sum4+Integer.valueOf(lenght);
//    }
//    System.out.println(sum4);
//}
//
//
//
//        //example 3: write code to find the sum of the unique digits in an integers
//        //user will give 1232==> 1+3=4. dont add 2 cuz they are repeated
//        System.out.println("==============");
//        System.out.println("Enter digits");
//String string1=scan.next();
//
//int sum5=0;
//for(int i=0;i<string1.length();i++){
//    String idx1=string1.substring(i,i+1);
//    if (string1.indexOf(idx1) == string1.lastIndexOf(idx1)) {
//        sum5+=Integer.valueOf(idx1);
//    }
//    System.out.println(sum5);
//}
////example 3: write code to find the sum of the unique digits in an integers
//        //user will give 1232==> 1+3=4. dont add 2 cuz they are repeated
//        System.out.println("Enter code");
//        String code=scan.next();
//        int sum6=0;
//        for(int i=0; i<code.length();i++){
//            char c2=code.charAt(i);
//            if (code.indexOf(c2)==code.lastIndexOf(c2)){
//                sum6+=Integer.valueOf(c2);//the reason its c2 is becuase c2 gets each char individually and
//                //turns it into a integer. if i put "code" in there it tries to turn all into integer at once.
//                //i need it individually.
//
//            }
//            //System.out.println(sum6);
//        }
//        System.out.println(sum6);
//
//        System.out.println("====================");
//        //Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number please!");
//        String digits3 = scan.next();
//
//        int add1=0;
//
//        for(int i=0; i<digits3.length(); i++) {
//
//            char c = digits3.charAt(i);
//            if (digits3.indexOf(c) != digits3.lastIndexOf(c)) {
//                add += Integer.valueOf("" + c);
//
//            }
//        }
//        System.out.println(add);
//
//        System.out.println("============");
//        System.out.println("Enter a number please!");
//        String code2=scan.next();
//int sum7=0;
//        for (int i=0; i<code2.length();i++){
//            String idx3=code2.substring(i,i+1);
//            if (code2.indexOf(idx3)==code2.lastIndexOf(idx3)){
//                sum7+=Integer.valueOf(idx3);
//            }
//        }
//        System.out.println(sum7);

        System.out.println("========================");
        /*
if integer is less than 100 tell user "won!"
otherwise tell user "lost!"
 */
      int game=99;

      do{
          if (game<100){
              System.out.println("won");
              break;
          }else{
              System.out.println("lost");
              break;
          }
      }while(true);

        System.out.println("============================");
   /*
if integer is less than 100 tell user "won!"
otherwise tell user "lost!"
 */
//NOTE: here in do while we put the conditions to be true. and as long as the condition is true the inside
        //of the do loop will run and when not it will stop. if i make while(true) it will endlessly run it.
        //do will check if the condition is true, if the condition is true it will repeat the loop as long as the
        // condition is true.
        //
        int e=0;
        do{
            System.out.println("enter number");
            if (e<100){
                System.out.println("won");
            }
        }while(false);
        System.out.println("lost");



    }
    public  StudyingAllNotes(String make, String model, int year, int price){
        this.make=make;
        this.model=model;
        this.price=price;
        this.year=year;


    }
}
