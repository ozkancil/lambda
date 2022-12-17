package testmyself;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RandomTests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String number, code;
//        number=scan.next();
//       double digit=number.trim().split("\\.")[1].length();
//        System.out.println(digit);

        /*
        //Example 1: Change all names start with "A" to "*****" in linkedlist
for (String w: names){
    if (w.startsWith("A")){
        w.replace(w,"*****");
    }
}
System.out.println(names);
         */
//        String names[]={"Ozkan"," is An"," apple with ","a car"};
//        //String name="a";
//        for(String w:names){
//            if(w.startsWith("A")){
//            }}


//        System.out.println(power(2,5));

        //EXAMPLE 1: TYPE CODE TO MAKE ALL ELEMENTS IN A LIST UNIQUE
//        List<Integer> a=new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(2);
//        a.add(1);
//        List<Integer> b=new ArrayList<>();
//
//        for (Integer w:a) {
//            if(b.contains(w)){
//                break;
//            }
//            b.add(w);
//        }
//        System.out.println(b);

//        List<String> c=new ArrayList<>();
//        c.add("1");
//        c.add("2");
//        c.add("3");
//        c.add("4");
//        c.add("2");
//        c.add("1");
//        List<String>d=new ArrayList<>();
//        d.add("1");
//        d.add("e");
//        d.add("3");
//        d.add("a");
//        d.add("b");
//        d.add("1");
//       for (String w:c){
//           if (d.contains(w)){
//               d.set(d.indexOf(w),"Got it");
//           }
//           d.add(w);
//       }
//        System.out.println(d);

        //using user enter letters to see if they are in the list, if not add them, if they are say got it

//        Scanner input=new Scanner(System.in);
//String str=input.next();
//
//        List<String> a=new ArrayList<>();
//        a.add("1");
//        a.add("2");
//        a.add("3");
//        a.add("4");
//        a.add("2");
//        a.add("1");
//
//            if(a.contains(str)){
//                a.set(a.indexOf(str),"Got it ");
//            }
//            a.add(str);
//        System.out.println(a);

//example 1: Increase the value of every element by 3 except 7
//        List<Integer> a = new ArrayList<>();
//        a.add(11);
//        a.add(31);
//        a.add(22);
//        a.add(7);
//        a.add(15);
//        for (Integer w:a){
//            if(w!=7){
//                a.set(a.indexOf(w),w+3);
//                continue;
//            }
//
//        }
//        System.out.println(a);

//convert all elements to "*" except the last 4 elements
//        List<String> b = new ArrayList<>();
//        b.add("11");
//        b.add("31");
//        b.add("22");
//        b.add("7");
//        b.add("15");
//        b.add("31");
//        b.add("21");
//        b.add("67");
//        for (int i=0;i<b.size();i++){
//            if (b.indexOf(i)-4==b.size()-4){
//
//            }
//        }


//        String words="words are easy to get ";
//        int split=words.split(" ").length;
//        System.out.println(split);
//
//        System.out.println("Enter words");
//        Scanner input=new Scanner(System.in);
//        String str=input.nextLine();
//
//        int divide=str.split(" ").length;
//        System.out.println(divide);

//        String speech = "Four score and seven years ago";
//        String[] result = speech.split("\\s");
//        System.out.println(speech.split(" ").length);
//        String split=speech.replace(" ","");
//        System.out.println(split.length()+ " this is it");
//        System.out.println(result.length);
//        for (int x=0; x<result.length; x++) {
//            System.out.println(result[x]);
//        }
//
//String oz=scan.nextLine();
//        System.out.println(oz.split(" ").length);


        //make sure that only digits are in the code
//        String pass="a#42!ads2323232";
//        String erase=pass.replaceAll("[a-zA-Z ]","");
//        String erase1=erase.replaceAll("[^0-9]","");
//        System.out.println(erase1);
        //}
// public static int power(int a, int b){
//        return a*b;
//    }

        //Find the middle index and print out the middle number
//        int [] arr={1,2,4,5,6,7};
//        Arrays.sort(arr);
//        int middleIdx=arr.length/2;//gives me the length of arr divided by two so its 2.5. java gives us 2
//        if(arr.length%2!=0){
//            System.out.println("The middle index is "+middleIdx+ " and the number at index is "+ arr[middleIdx]);
//        }
//        else{
//                                //3             2       =5 /2=2.5=2
//            int middleNum=((middleIdx)+(middleIdx-1))/2;
//            System.out.println("Middle number when its an even number is "+arr[middleNum]);
//        }




        //Find the middle index and print out the middle number

//int arr[]={1,2,3,4,5,6,7};
//int middleIdx=arr.length/2;
//
//if(arr.length%2!=0){
//    System.out.println("Give me the number at index "+middleIdx+" which is "+arr[middleIdx]);
//}else{
//    //if its even i want you to give me the sum of middleIdx+middleIdx-1/2
//    int middleNum=(middleIdx+(middleIdx-1))/2;
//    System.out.println(arr[middleNum]);
//}


        /*
        Type code to find the common elements between two string arrays
        without case sensitivity
        input1: john,brad,angel, sofia, emily, input2: sofia, brad, grace, emily , hazel
        output: brad, sofia, emily.
         */

//        String arr[]={"john", "brad","angel","sofia","emily"};
//        String brr[]={"sofia","brad","grace","emily","hazel"};
//
//        List<String> commonNames= new ArrayList<>();

//        for(String w:arr){
//            for(String u:brr){
//                if(u.equalsIgnoreCase(w)){
//                    commonNames.add(w);
//                    //System.out.println(commonNames);
//                }
//            }
//        }System.out.println(commonNames);

//        for(String w:arr){
//            for (String u:brr){
//                if(u.equalsIgnoreCase(w)){
//                    commonNames.add(w);
//                }
//            }
//        }
//        System.out.println(commonNames);



        /*
    If the list has 15 as element, change all 15s to 51.
    Example: 12,11,15,34,43==> Output is 12,11,51,34,43
     */

//            List<Integer> num=new ArrayList<>();
//            num.add(12);
//            num.add(11);
//            num.add(15);
//            num.add(34);
//            num.add(43);
//
//            List<Integer> num1=new ArrayList<>();
//
//            for(Integer w:num){
//                if(w.equals(15)){
//                    num.set(num.indexOf(w),51);
//                }
//            }
//        System.out.println(num);
//
//
//        //3rd wat to create list object
//        List<Integer> list= Arrays.asList(12,11,13,34,43);
//
//        for(Integer w:list){
//            if(w.equals(11)){
//                list.set(list.indexOf(w),51);
//            }
//        }
//        System.out.println(list);


         /*
        find the middle element in an integer array
        Example: 12,5,8  ==> 5,8.12==> output =8
        Example 2:12,5,8 ,13 ==>12,5,8 ,13==>output (8+12)/2=10;
         */
//        int []arr={12,5,8,21,13,15,50,60};//{12,5,8,21,13,15,50,60}
//        int length=arr.length/2;
//
//        if(arr.length%2!=0){
//            System.out.println(length);
//        }else{
//int total=(length+(length-1))/2;
//            System.out.println("Give me the character at index "+total+". The character is "+arr[total]);
//
//        }

//        String fullName=" Ozgur Cil ";
////        String firstInitial=fullName.trim().substring(0,1).toUpperCase();
////        String lastInitial=fullName.trim().split(" ")[1].substring(0,1);
//       // System.out.println(firstInitial+" "+lastInitial);
//        String f1="";
//        String f2="";
//        for(int i=0;i<fullName.length();i++){
//            //System.out.println(fullName.charAt(i));
//            String initial=fullName.substring(1,2);
//           int lastInitial=fullName.indexOf(i);
//            if(fullName.substring(i).equalsIgnoreCase("o")){
//                f1=f1+initial;
//                System.out.println(f1);
//            }else if(fullName.substring(i).equalsIgnoreCase("C")){
//                f2=f2+fullName;
//                System.out.println(f2);
//            }
//
//        }System.out.println(f1);
//        System.out.println(f2);

//        String name = "ozgur";
//        String reverse = "";
//
//        for(int i=name.length()-1; i>-1 ; i--){
//                char n = name.charAt(i);
//            reverse = reverse + n;
//        }
//
//        System.out.println(reverse);


//

//        String s = "";
//        for(Integer i=120; i>10; i--){
//            if(i%4==0 && i%6==0){
//                s = s + i + " ";
//                System.out.println(s);
//            }
//        }





//        String repeat = "accessories";//
//       // String container = "";
//
//        for(int i=0; i<repeat.length(); i++){
//            String inside = repeat.substring(i, i+1);
//            //  a=0 c=1                        a=0 c=2
//            if(repeat.indexOf(inside) != repeat.lastIndexOf(inside)){
//                if(inside==inside)
//                System.out.println(inside);
//                //if(!container.contains(inside)) {
//                    //container = container + inside;

//        String repeat = "accessories";//
////Only get the ones that are repeating its self
//        String c="";
//        for (int i=0;i<repeat.length();i++) {
//            String inside = repeat.substring(i, i + 1);
//            if (repeat.indexOf(inside) != repeat.lastIndexOf(inside)) {
//                //c index 0   c last index 0
//                // container= cc ee ss --> c e s
//                //c=c+inside;
//                if (!c.contains(inside)) {
//                    //container= c e s      inside=cc ee ss
//                    c = c + inside;
//                }
//            }
//            //System.out.println(c+" this is the container w/out the nested if");
//        }
//        System.out.println(c);


/*
String s = "accessories";
String d = "";
for(Integer i=0; i<s.length(); i++){
String c = s.substring(i,i+1);
if(s.indexOf(c)!=s.lastIndexOf(c)){
if(!d.contains(c)){
d = d + c;
} }
} System.out.println(d);
 */
                    //we are looking for index to get repeated characters. we want to get those that are not equal indexes
                    //INDEX= starting from 0.
                    //            a   c ==c a
                    //We want the ones with the different indexes...
                    //printout(inside) -->

                    // There is only one "a", the index for "a" is what=0
                    //"a" indexOf(i)=0    , "a" lastIndexOf(i)=0
                    //"c" indexOf(i)=1    , "c" lastIndexOf(i)=2
                    //We want "c" because its repeated and its not equal(index)
                //}


        //System.out.println(container);


//        String s = "accessories";
//        String d = "";
//        for(int i=0; i<s.length(); i++){
//            String c = s.substring(i,i+1);
//            if(s.indexOf(c)!=s.lastIndexOf(c)){
//
//                if(!d.contains(c)){
//                    d = d + c;
//                }
//            }
//        } System.out.println(d);




//        String name = "piss of ozkan";
//        String reverse = "";
//
//        for(int i=name.length()-1; i>-1; i--){
//            char nr = name.charAt(i);
//             reverse += nr;
//        }
//        System.out.println(reverse);

//        int num = 223878;
//String num1=String.valueOf(num);
//String contain="";
//
//        for(int i=0;i<num1.length();i++){
//String compare=num1.substring(i,i+1);
//if (num1.indexOf(compare)==num1.lastIndexOf(compare)){
//    contain=contain+compare;
//}
//        }
//        System.out.println(contain);
//
//        String name = "Mark";
//
//        for(int i=name.length()-1; i>-1; i--){
//            String inside = name.substring(i, i+1);
//            System.out.print(inside);
//        }
//
//        System.out.println();
//
//
//
//        String name1 = "Mark";
//        String container = "";
//
//        for(int i=name1.length()-1; i>-1; i--) {
//            String inside1 = name1.substring(i, i + 1);
//            container = container + inside1;
//
//        }
//        System.out.println(container);


//        String name = "Christmas";
//        String container = "";
//
//        for(int i=0; i<name.length(); i++){
//            String inside = name.substring(i, i+1);
//            if(inside.equals('m')){
//                break;
//
//            }
//            container = container + inside;
//        }
//        System.out.print(container);

//Create a string Array and print the elements whose length is less than 5

//        String names[] = {"ali", "thomas", "mark", "jackson", "tom", "martin"};
//        //System.out.println(Arrays.toString(names));
//
//        for(String w:names){
//            if (w.length()<5){
//                System.out.println(w);
//            }
//        }
//
//
//
//
//        for(String w : names){
//            if(w.length()<5){
//                System.out.println(w);
//            }
//        }
        /*
        Create 3 String variables for people's names.
         Print the sum of the number of characters in
        all the 3 names except space characters.
        Example: If the names are Ali Can, Merve Star,
         Mark Tom you should see 22 on the console.
               */
//                String name1 = "Ali Can";
//        String name2 = "Aliye Canan";
//        String name3 = "Aliyev Can Cananov";
//
//int name1Length=name1.replaceAll("\\s","").length();
//int name2Length=name2.replaceAll("\\s","").length();
//int name3Length=name3.replaceAll("\\s","").length();
//        System.out.println(name1Length+name2Length+name3Length);
//
//        /*
//        Print the alphabetical and numerical length of
//        String is Miami 33018!!!
//         */
//        String a=" Miami 33018 ! ! ! ";
//        String trim=a.replaceAll("[^a-zA-Z0-9]","");
//        System.out.println(trim);
//        int lenght=trim.length();
//        System.out.println(lenght);

        /*Create a String variable and print just the last non-space character on the console for any
        String.
                Example: For ‘Ali Can’ you should print n
        For ‘Miami ’ you should print i etc.
        */

//        String s="Ali can";
//        String a="Miami ";
//        char n=s.charAt(s.length()-1);
//        System.out.println(n);
//String trim=a.trim();
//        char m=trim.charAt(trim.length()-1);
//        System.out.println(m);
//
        /*
        Create a String variable and find the sum of the ASCII values of the first and the last
characters of the String.
         */
//        String a="Ac";
//        int b=a.charAt(0);
//        System.out.println(b);
//
//        int c=a.charAt(a.length()-1);
//        System.out.println(c+a);
/*
Create a String variable and print all characters except the last character on the console in
uppercases.
Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
 */
//        String a="Java";
//        String b=a.substring(0,a.length()-1);
//        System.out.println(b.toUpperCase());

        /*
        Create a String variable and print all characters except the first character and the last
character on the console in uppercases.
Example:If the String is ‘Java’ you should print ‘AV’ on the console.
         */
//        String a="Java";
//        String b=a.substring(1,a.length()-1);
//        System.out.println(b.toUpperCase());

        /*
        Type code to check if a String has just a single space character any position in the middle
Example: For ‘Ali Can’ your code should print false on the console
For ‘ Ali Can ’ your code should print false on the console
For ‘ Ali Can ’ your code should print false on the console
For ‘Ali Can’ your code should print true on the console
         */

//        String a="AliCan";
//        boolean b=a.replace("\\s","").length()==6;
//        System.out.println(b);
//       // System.out.println(b);

/*
Type code to check if a String does not have any space character at the beginning and at
the end?
Example: For ‘ Ali ’ your code should print false on the console
For ‘Ali’ your code should print true on the console
 */


//        String a=" Ali Can ";
//        String b=a.trim();
//        //boolean c=b==7;
//boolean result=a.equals(b);
//
//        System.out.println(result);

        /*
        Type code to check if a String has an uppercase initial and dot at the end.
Example: For ‘Ali’ your code should print false on the console
For ‘ali.’ your code should print false on the console
For ‘ Ali. ’ your code should print false on the console
For ‘Ali.’ your code should print true on the console
For ‘ALI.’ your code should print true on the console
         */
//String ali="Ali";
//boolean a=ali.charAt(0)>='A' && ali.charAt(0)<='Z';
//        System.out.println(a);

/*
//Create a String Array and print the elements before "tom" and "tom"

        String names[] = {"ali", "thomas", "mark", "Jackson", "tom", "martin"};
 */
//
//        String names[] = {"ali", "thomas", "mark", "Jackson", "tom", "martin"};
//
//        String store="";
//        for(String w:names){
//            store+=w+" ";
//            if(w.equals("tom")){
//                break;
//            }}
//        System.out.println(store);

/*
Type code to check if a String has an uppercase initial and dot at the end.
Example: For ‘Ali’ your code should print false on the console
For ‘ali.’ your code should print false on the console
For ‘ Ali. ’ your code should print false on the console
For ‘Ali.’ your code should print true on the console
For ‘ALI.’ your code should print true on the console
 */

//        String a="Ali.";
//        boolean b=a.charAt(0)>='A' && a.charAt(0)<='Z';
//        System.out.println(b);
//boolean c=a.charAt(a.length()-1)=='.';
//        System.out.println(c);

/*
Type code to check if a password is valid or not for the following conditions;
Password must have at least 8 characters different from space character
Password must have at least 1 symbol
Example: For ‘A2b!’ your code should print false on the console
For ‘A2b3cdef’ your code should print false on the console
For ‘!1a23b4’ your code should print false on the console
For ‘!1a23b4?es’ your code should print true on the console
For ‘! a b 3 k’ your code should print false on the console
 */

//String a="A2b3cdef!!";
//int length=a.length();
//boolean equalsLength=length==8;
//        System.out.println(equalsLength);
//boolean contian=a.replace("\\p{Punct}","").length()==8;
//boolean replace=a.replaceAll("\\s","").replaceAll("[a-zA-Z0-9]","").length()>0;
//        System.out.println(replace);
//        boolean eight=a.replaceAll("\\s","").length()==8;
//        System.out.println(eight);

//        String s = "Java";
//        Boolean result = s.replaceAll("[^v]", "").length()>0;
//        System.out.println("Does the character exist? " + result);
//
//        boolean mathc=s.matches("v");
//        System.out.println(mathc);
//
//        boolean b=s.indexOf("v")!=-1;
//        System.out.println(b);
//
//      boolean n=  s.contains("v");
//        System.out.println(n);


        /*
        15) String shirtPrice = ‘$12.99’;
String bookPrice = ‘$35.99’;
Type code to find the sum of the shirt and book prices.
         */
//String shirtPrice="12.99";
//String bookPrice="35.99";
//
//double shirtPrice1=Double.valueOf(shirtPrice);
//double bookPrice1=Double.valueOf(bookPrice);
//
//        System.out.println(shirtPrice1+bookPrice1);


        /*
        Type a code to find the number of punctuation marks used in a String.
String s = "Wow! Ali is 13 years old, but he is a university student.";
         */
//        String s = "Wow! Ali is 13 years old, but he is a university student.";
//int length1=s.length();
//int length2=s.replaceAll("\\p{Punct}","").length();
//
//int numberOfPunctuationMarksUsed=length1-length2;
//        System.out.println(numberOfPunctuationMarksUsed);


        /*
        Type code to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
         */
//        System.out.println("Enter Season name");
//        String input=scan.nextLine();
//
//
//        if(input.toLowerCase()=="december" || input.toLowerCase()=="january" || input.toLowerCase()=="february"){
//            System.out.println("Winter");
//        }
//        if(input.toLowerCase()=="march" || input.toLowerCase()=="april" || input.toLowerCase()=="may"){
//            System.out.println("Spring");
//        }
//        if(input.toLowerCase()=="june" || input.toLowerCase()=="july" || input.toLowerCase()=="august"){
//            System.out.println("Summer");
//        }
//        if(input.toLowerCase()=="september" || input.toLowerCase()=="october" || input.toLowerCase()=="november"){
//            System.out.println("Fall");
//        }
//        else{
//            System.out.println("Invalid month name");
//        }

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
//        String fullName = "ali Can?";
//        String initialOfFirstName = fullName.trim().substring(0,1);
//        Integer indexOfSpace = fullName.trim().indexOf(' ');//here it gets the index which we will be adding and subtracting
//        String initialOfLastName = fullName.substring(indexOfSpace+1,indexOfSpace+2);
//
//
//
//        Boolean isFirstNameInitialUpperCase = (initialOfFirstName.charAt(0)>='A' && initialOfFirstName.
//                charAt(0)<='Z');
//        Boolean isLastNameInitialUpperCase = (initialOfLastName.charAt(0)>='A' && initialOfLastName.
//                charAt(0)<='Z');
//        if(indexOfSpace==-1){
//            System.out.println("First name or last name missed");
//        }
//        if(!isFirstNameInitialUpperCase || !isLastNameInitialUpperCase){
//            System.out.println("Error in initials");
//        }
//        if(fullName.equals(fullName.toUpperCase())){
//            System.out.println("Format error");
//        }
//        if(fullName.replaceAll("\\s","").length()==0){
//            System.out.println("Name was not entered");
//        }
//        if(fullName.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
//            System.out.println("Invalid Name");
//        }

        /*
        Type code to check the format of state abbreviations in the USA
a) Your code should print "State abbreviations cannot have more than 2 characters" if the
abbreviation has more than 2 characters
b) Your code should print "State abbreviations cannot have lowercase characters" if the
abbreviation has lowercase characters
c) Your code should print "State abbreviations cannot have characters different from
letters" if the abbreviation has characters different from letters.
Note: If the abbreviation has more than 1 error all related error messages should be printed.
For example; for "fl3" your code should print, "State abbreviations cannot have more than
2 characters", "State abbreviations cannot have lowercase characters", and "State abbreviations
cannot have characters different from letters"
         */
//        String a="Um";
//        boolean b=a.length()>2 || a.length()<2;
//
//        if(b){
//            System.out.println("not 2 characters");
//        }else{
//            System.out.println("is two characters");
//        }
       /* Use ternary to print "Valid Password" if the password has at least 8 characters different
        from space characters. "Invalid Password" if the password has less than 8 characters
        different from space character

        */

//String pass="12345678";
//String validPass=pass.replaceAll("\\s","").length()>=8? "has 8 characters":"Not long enoug";
//
//        System.out.println(validPass);

/*
Use ternary to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
 */
        /*
        Type Apex code by using nested ternary.
Write a program to check if a year is a leap year or not.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
         */

//        int num=100;
//    Object leapYear=   num%100==0? num%400==0? "leap year":"not leap year 1" : num%4==0?"leap year":"not leap year 2";
//        System.out.println(leapYear);

        /*
        Use switch statement to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
         */
//String seasons=scan.nextLine();
//        switch(seasons.toLowerCase()){
//            case "winter":
//                System.out.println("Dec"+" Jan"+"Feb");
//                break;
//
//        }

/*
Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
with a space between two consecutive integers
 */
//        for (int i=120; i>=11;i--){
//if(i%6==0 && i%4==0){
//    System.out.println(i);
//


//    int x=120;
//    while(x>=11){
//if (x%4==0 && x%6==0){
//    System.out.println(x);
//
//}
//        x--;
//    }

//        int x=120;
//
//        do{
//            if (x%4==0 && x%6==0){
//                System.out.println(x);
//            }
//            x--;
//        }while(x>=11);
/*
2) Type code to print repeated characters in a String. For example; accessories ⇒ ces
 */
//String a="accessories";
//String cont="";
//for (int i =0;i<a.length();i++){
//    String l=a.substring(0,1);
//    if (l.indexOf(i)!=l.lastIndexOf(i)){
//        cont+=l;
//    }
//
//}
//String singleCon="";
//int x=cont.length();
//while(x<cont.length()) {
//    String singlChar = cont.substring(0, 1);
//    if (!singlChar.contains(singlChar)) {
//        singleCon+=singlChar;
//    }
//    x++;
//}
//        System.out.println(singleCon);

     //String a="accessories";
//      String cont="";
//        for(int i=0;i<a.length();i++){
//            String l=a.substring(i,i+1);
//            if (a.indexOf(l)!=a.lastIndexOf(l)){
//                if(!cont.contains(l)){
//                    cont+=l;
//                }
//            }
//        }
//        System.out.println(cont);
//int i=0;
//String cont="";
//        int b=a.length();
//        while(i<b){
//            String l=a.substring(i,i+1);
//            if (a.indexOf(l)!=a.lastIndexOf(l)){
//                if(!cont.contains(l)){
//                    cont+=l;
//                }
//            }
//            i++;
//        }
//        System.out.println(cont);

//int i=0;
//        String cont="";
//        do{
//            String l=a.substring(i,i+1);
//            if (a.indexOf(l)!=a.lastIndexOf(l)){
//                if(!cont.contains(l)){
//                    cont+=l;
//                }
//            }
//            i++;
//        }while(i<a.length());
//        System.out.println(cont);

/*
Type code to check whether a String is palindrome or not. If a String is the same with its
reverse then it is called palindrome. For example; “anna”, “123321” are palindromes
 */
//String a="ozkan";
//String reverse="";
//int x=a.length()-1;
//while(x>-1){
//    String l=a.substring(x,x+1);
//    reverse+=l;
//    x--;
//}
//        System.out.println(reverse);
//
//String rev="";
//for (int i=a.length()-1;i>-1;i--){
//  // char l=a.charAt(i);
//    String l=a.substring(i,i+1);
//    rev+=l;
//}
//        System.out.println(rev);

        /*
        4) Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
         */
//        int n=223878;
//        String numbersString=String.valueOf(n);
//        System.out.println(numbersString);
//        String cont="";
//        int x=0;
//        while(x<numbersString.length()){
//            String a =numbersString.substring(x,x+1);
//            if(numbersString.indexOf(a)==numbersString.lastIndexOf(a)){
//                cont+=a;
//            }
//            x++;
//        }
//        System.out.println(cont);

        long nFactorial=factorialFunction(5);
        System.out.println(nFactorial);
        //System.out.println(factorialFunction( 1));
    }
    public static long factorialFunction(long n){
        if(n<=1) return 1 ;
        return n*factorialFunction(n-1);//we want to times it by the number I will input. so we need to come down. I'll put 3 so it will be 3*3,3*2
    }
}
