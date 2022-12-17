package day25exceptions;

public class E05 {
    public static void main(String[] args) {
      char r1=  charFromString("Java",2);//StringIndexOutOfBoundException
        System.out.println(r1);


    }

    //create a method to get any character from a string
    public static char charFromString(String str, int idx){
char a = 0;

try {
    a= str.charAt(idx);
}catch (StringIndexOutOfBoundsException e){
e.getMessage();
}
return a;
    }

}
