package testmyself;

import java.util.Arrays;
import java.util.Scanner;

public class FindRepeatedLetters {

    public static void main(String[] args) {
        //String a="successful";
//        String b="";
//        for (int i=0;i<a.length();i++){
//            String idx=a.substring(i,i+1);
//            if(a.indexOf(idx)!=a.lastIndexOf(idx)){
//                if(!b.contains(idx)){
//                    b=b+idx;
//                }
//            }
//        }
//        System.out.println(b);
//        String c="";
//        for (int i=0;i<a.length();i++) {
//for (int k=0;k<a.length();k++){
//    if(a.charAt(i)!=a.charAt(k)) {
//        if (!c.contains(a))
//        c=c+a.charAt(i);
//    }
//}  }
//        System.out.println(c);
//char[] l=a.toCharArray();
//        String con="";
//        for (int i=0;i<a.length();i++){
//            for (int k=i+1;k<a.length();k++){
//                if(l[i]==l[k]){
//                    System.out.print(l[k]+" ");
//                    break;
//                }
//            }
//
//            }
//String con="";
//           for (int i=0;i<a.length();i++) {
//               for(int k=i+1;k<a.length();k++){
//                   if(a.charAt(i)!=a.charAt(k)){
//                       if(!con.equals(a.charAt(k)))
//                           con+=a.charAt(k);
//                      // System.out.println(a.charAt(k));
//                   }
//               }
//           }
//        System.out.println(con);

        //System.out.println(b);
//        String c="";
//        for (int i=0;i<a.length();i++) {
//            int count=0;
//            for (int k=0;k<a.length();k++){
//                if(a.charAt(i)==a.charAt(k)) {
//                    count++;
//                }
//            }
//            if (count>1 && !c.contains(a.substring(i,i+1))){
//                c=c+a.charAt(i);
//            }
//        }
//        System.out.println(c);
//String c="";
//for (int i=0;i<a.length();i++){
//    int count=0;
//for (int k=0;k<a.length();k++){
//    if(a.charAt(i)==a.charAt(k)){
//        count++;
//    }
//}
//if (count>1  && !a.contains(a.substring(i,i+1))){
//    c=c+a.charAt(i);
//}
//}
//        System.out.println(c);

//        String b="";
//        for (int i=0;i<a.length();i++){
//             b=b+a.charAt(i);
//        }
//        System.out.println(b);
//
//        System.out.println(a.charAt('a'));

        /*
        if the initial of the passwored is lowercase then check if it is 'z' or not.
        if it is 'z' the output will be "valid password"
        otherwise the output will be "Invalid password"
        For example; zoe==> valid password - Zoe==>invalid - john==>invalid.
                */
//        Scanner input=new Scanner(System.in);
//        char pwdInitial=input.next().charAt(0);
//
//        if(pwdInitial>='A' || pwdInitial<='Z'){
//            if (pwdInitial == 'A') {
//                System.out.println("Valid pass");
//            }else {
//                System.out.println("invalid pass");
//            }
//        }else if(pwdInitial>='a'||pwdInitial<='z'){
//            if(pwdInitial=='z'){
//                System.out.println("valid pass");
//            }else{
//                System.out.println("invalid pass");
//            }
//        }else{
//            System.out.println("Invalid password");
//        }
//
//
//




//Find repeated letters
//        String str="successful";
//        String cont="";
//        for(int i=0;i<str.length();i++){//legnth
//            String s=str.substring(i,i+1);//str s,u,c,c
//            // character String
//            if (str.indexOf(s)!=str.lastIndexOf(s)){//uuccss
////i look for string, cuz my parameter is string. but i return a index of the
////string.                l =string (return tpye)  char a =l; return char
//                if(!cont.contains(s)){
//                    cont=cont+s;
//                }
//            }
//        }
//        System.out.println(cont);


        String input = "Ali\n" +
                "Veli Han\n" +
                "Kemal Can Kuzu";

        String rev = "";
        String[] lines = input.split(System.getProperty("line.separator"));
        String ali=lines[0];
        String veliHan=lines[1];
        String kemalKuzu=lines[2];

//        for(int i =ali.length()-1;i>-1;i--){
//            System.out.print(ali.charAt(i));
//        }


//        System.out.println(lines[0]);
//        System.out.println(lines[1]);
//        System.out.println(lines[2]);
        for(String w : lines) {
            System.out.println(w);
            String[] words = w.split(" ");//Here its split and we get index zero for
            for (int i = words.length - 1; i >= 0; i--) {
                if (i != 0) {
                    rev = rev + words[i] + " ";
              }
                else {
                    rev = rev + words[i];
                }
            }
            System.out.println(rev);
            rev="";
        }














































    }}
