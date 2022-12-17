package practice;

import java.util.Arrays;

public class StringTrimSplit {
    /*
    Create a String variable, print the total number of alphabetical and numeric characters in
the String on the console.
Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.
     */
    public static void main(String[] args) {


    String is= " Miami 33018!!! ";
        System.out.println(is.length());
String trim=is.trim();
int numChar=trim.replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println(numChar);



        /*
        5) Create a String variable and print just the last non-space character on the console for any
String.
Example: For ‘Ali Can’ you should print n
For ‘Miami ’ you should print i etc.
         */

        String m="‘Miami ’";
        String t=m.trim().replace("'","");
        String remove=t.replace(t.substring(0,1),"");
        String delete=t.replace(t.charAt(0),'a');
        //String cut=t.replace(t.indexOf(0),"");

        String first=t.substring(0,1);
        char idx=t.charAt(t.length()-1);
        System.out.println(first+" this");
        System.out.println(idx);


        /*
        Create a String variable and print all characters except the first character on the console.
Example:If the String is ‘Java’ you should print ‘ava’ on the console.
         */
  String java="java";
//        String sum[]=new String[4];
//        for (int i=0;i<java.length();i++){
//            String c=java.substring(i+1);
//            sum[i]=c;
//        }
//        System.out.print(Arrays.toString(sum));

//        String java="java";/// 1 2 3    1 2 3 4
//       String sum="";
//        for (int i=0;i<java.length()-1;i++){
//            char c=java.charAt(i+1);
//            sum=sum+c;
//            //System.out.println(c);
//           // break;
//        }
//        System.out.println(sum);

String ava=java.substring(1);
        System.out.println(ava);

        /*
        Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
         */
        String jav=java.substring(0,java.length()-1);
        System.out.println(jav.toUpperCase());

        /*
        Example:If the String is ‘Java’ you should print ‘AV’ on the console.
         */
        String av=java.substring(1,java.length()-1);
        System.out.println(av);

        boolean j=java.indexOf("v")==-1;
        System.out.println(j);


}}
