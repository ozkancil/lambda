package day09loops;

public class ForLoop01 {
    public static void main(String[] args) {
        //example 1: type code to reverse a string
        //tom ==> mot
String tom="tom";
       // String reverseName="";//===> this ones position will change
for (int i=tom.length()-1;i>-1;i--){//length()-1 last index
    char ch=tom.charAt(i);
//    System.out.println(tom.charAt(i));//1st way
//    System.out.println(ch);//2nd way
    //3rd way of doing it
    String reverseName="";
    reverseName=reverseName+ch;
    System.out.print(reverseName);//==> this ones position will change

}
        //System.out.print(reverseName);//==> this ones position will change
        //find the integers from 3 to 6
//        int sum=0;// this is a container. this is the heap memory where everything is stored.
//for (int i=3; i<7;i++){
//   // int sum=0;
//    sum+=i;
//    System.out.println(sum);
//}
//        System.out.println(sum);

        //muptioplcation of the integers from 3 to 6
        int multp=1;
        for (int i=3;i<7;i++){
            multp=multp*i;
    }
        System.out.println(multp);









        // find the sum of the modules of digits of an integer from 585 to 0
        //584 ==> 5+8+4=17
        //Note: "number %10" gives you the last digit
         int sumOfDigits=0;
         for(int i=584;i>0;i=i/10){
             sumOfDigits=sumOfDigits+i%10;
         }

        System.out.println(sumOfDigits);






         ///
        int num=-584;

      num=Math.abs(num);//Math.abs makes it positive.
      int sumOfDigits1=0;

        for (int i=num;i>0;i=i/10){
            sumOfDigits1=sumOfDigits+i%10;//the reason we do i%10 is because i has the actual number. i=num and num =584.
        }
        System.out.println(sumOfDigits1);
    }}
