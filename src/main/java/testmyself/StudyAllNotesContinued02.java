package testmyself;

import java.util.Scanner;

public class StudyAllNotesContinued02 {
    public static void main(String[] args) {
                /*
        1. type code to get the output like
           week1:
           day:1
           day:2
           day:3
           .....
           week: 2
           day:1
           day:2
           day:3
           ......
           week: 3
           day:1
           day:2
           day:3
           .............
         */

//so it runs the outer loop once and the inner loop as much as it needs to make it false. then comes back to
        //outer loop. and this repeats until the outer loop is finished; in this case when i reaches 7
//        for (int i=1;i<8;i++){
//            System.out.println("Week: "+i);
//            for (int k=1;k<4;k++){
//                System.out.println("day: "+k);
//            }
//        }

       /* 2 examaple: write a java program to print rectangle star pattern using for loop
                ****
        ****
        ****
        ****
         */
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter");
//        String scan=scanner.next();
//    for (int i=0;i<3;i++){
//        System.out.println(scan);
//        for (int k=0;k<4;k++){
//            System.out.print(scan);
//        }
//
//    }

        //Example: Type code to print integers from 3 to 6
        //while
//        int a=3;
//    while(a<6){
//        System.out.println(a);
//        a++;
//    }

//        //example: type code to print odd integers from 12 to 67 in the same line with a space between them
//        int an=12;
//    while(an<68){
//       if( an%2!=0);
//        System.out.print(" "+an);
//an++;
//    }
//int c=2,b=8;
//    int temp=c;
//    c=b;
//    b=temp;
//        System.out.println("\n"+b);
//        System.out.println(c);


//        System.out.println("====================");
//        //3rd example: type code to find sum of integers from 12 to 67
//        int a=12;
//        int sum=0;
//        while(a<68){
//
//            sum=sum+a;
//            a++;
//
//        }
//        System.out.println(sum);

        /*
        input user and get the total of each digits in total.
        123==>1+2+3=6
         */

        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter digits");
//        String num=scan.next();
//        int sum=0;
//        for (int i=0;i<num.length();i++){
//            char c=num.charAt(i);
//            sum=sum+Integer.valueOf(c);
//        }
//        System.out.println(sum);
//
//
//
//        System.out.println("===========");
//        String num1=scan.next();
//        int sum1=0;
//        for (int k=0;k<num1.length();k++){
//            String c1=num1.substring(k,k+1);
//            sum1=sum1+Integer.valueOf(sum1);
//        }
//        System.out.println(sum1);
//
//adding the numbers in a digit.
//        int number, digit, sum2 = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        number = sc.nextInt();
//        while(number > 0)
//        {
////finds the last digit of the given number
//            digit = number % 10;
////adds last digit to the variable sum
//            sum2 = sum2 + digit;
////removes the last digit from the number
//            number = number / 10;
//        }
////prints the result
//        System.out.println("Sum of Digits: "+sum2);
//    /*
//        input user and get the total of each digits in total.
//        123==>1+2+3=6
//         */
//        System.out.println("Enter your digits");
//
//        int num,digit1, sum=0;
//        num=scan.nextInt();
//
//        while(num>0){
//            digit1=num%10;
//            sum=sum+digit1;
//            num=num/10;
//
//        }
//
//
//        System.out.println("num "+sum);

//        System.out.println("Enter your digits");
//        int number,digit,sum=0;//we are doing digits so for this reason we do greater than 0 so that it captures starting from lenght 1.
//        number=scan.nextInt();
//        while(number>0){
//            digit=number%10;
//            sum+=digit;
//            number=number/10;
//        }
//        System.out.println(sum);

        /*
        user will give number and create multiplication of that number
        3*1, 3*2, etc
         */

//        int num, multp=0;
//        num=scan.nextInt();
//        for(int i=0; i<num;i++){
//            multp=3*i;
//            System.out.println("3x "+i+" = "+multp);
//        }
//        System.out.println("=================================");
//        StudyingAllNotes obj=new StudyingAllNotes("Toyota","corolla",3000,5000000);
//      //  System.out.println(obj.make);
//       // System.out.println(obj.model);
//        System.out.println(obj.year);
//        System.out.println(obj.price);
//        System.out.println(StudyingAllNotes.model);
//        System.out.println(StudyingAllNotes.make);
//
//        System.out.println("=======================================");

/*
        Type code to print digits just in the decimal part of the given decimal number with an asteric. for exaample
        75.4238==> *4*2*3*8
         */
//        System.out.println("Enter code");
//        double dub, digit, sum=0;
//         dub=scan.nextDouble();
//        do{
//            digit=dub%10;
//            sum=digit;
//            dub=dub/10;
//        }while(dub>0);
//        System.out.println("*"+sum);
//        System.out.println("Enter num here");
//double dub,digit,sum=0;
//dub=scan.nextDouble();
//
//while(dub>0){
//    digit=dub%10;
//    sum=sum+digit;
//    dub=dub/10;
//
//}System.out.println(sum);
//
//
//        System.out.println("==================");
//        System.out.println("Enter a digit");
//        String number, digit1, conc="";
//        int sum2=0;
//        number=scan.next();
//        for (int i=0;i<number.length();i++){//here i looped each one. i looped through the length of the number/ this gives me a right of pass to go inside the number
//            digit1=number.substring(i,i+1);//here i went inside each number and took it to pieces so i can use it to add individually
//            conc=conc+digit1;//now each one I took apart I am adding it to each other. Here i concatenated them. because so far im getting strings as integers only
//            //-so i am concatenating them. to be able to add them i need to turn it into integers.
//            System.out.println("==Concatenation==");
//            System.out.println(conc);//I have not turned them into integers yet so this conc is concatenating it for now
//            System.out.println("Below is where I have added the integers");
//            int add=Integer.valueOf(digit1);
//            sum2=sum2+add;
//            System.out.println(sum2);
//
//        }

//        System.out.println("Enter a digit");
//        String number, digit, concat="";
//        number=scan.next();
//        int sum=0, add;
//        for (int i=0;i<number.length();i++){
//            digit=number.substring(i,i+1);//here i went inside the number and picking it to pieces
//            concat=concat+digit;// here i am concatenating it cuz its still a string
//            System.out.println("I will turn it into a integers");
//            add=Integer.valueOf(digit);
//            sum=sum+add;
//            System.out.println(sum);
//
//
//        }

        /*
        Type code to print digits just in the decimal part of the given decimal number with an asteric. for exaample
        75.4238==> *4*2*3*8
         */
//        System.out.println("Enter double integer");
//        String number,digit,star, add="";
//        number=scan.next();
//  digit=number.trim().split("\\." )[1];
//for (int i=0;i<digit.length();i++){
//
//    add=add+digit.charAt(i)+"*";
//}
//        System.out.println(add);
//        System.out.println("Enter digits");
//        String sc=scan.next();
//String sum="";
//
//        for (int i=0;i<sc.length();i++){
//            String digit=sc.substring(i,i+1);
//            sum=sum+digit+"*";
//        }
//        System.out.println(sum);
//        System.out.println("enter digits");
//        String number, digit, add="";
//   number=scan.next();
//  for (int i=0;i<number.length();i++){
//     digit=number.trim().split("\\.")[1].substring(i,i+1);
//
//     add=add+digit+"*";
//      System.out.println(add);
//  }
//        System.out.println(add);
//        double num = 75.4238;
//        String str=String.valueOf(num);
//        String split=str.split("\\.")[1];
//        int length=split.length();
//        //int i=0;
//        String add="";
//        do{
//            //String c=split.substring(i,i+1);
//            char c=split.charAt(length);
//            add=add+c;
//            System.out.println(c);
//            length++;
//            //i++;
//        }while(true);
        /*
        type the numbers after the digits and add star betwn them
         */
//        double num = 75.4238;
//        String number,digit, sum="";
//                number=String.valueOf(num);//i turned it into a string
//                digit=number.split("\\.")[1];  //now divide it from point. i half divided it
//                //now get each one so we must go inside
//        for (int i=0;i<digit.length();i++){//we got the length
//            sum=sum+digit.substring(i,i+1)+"*";
//
//        }
//        System.out.println(sum);

        /*
        75.4321 and get each integer after the decimal point, whilst
         */

        double num;
        int idx=0;
        num=75.4321;
        String str=String.valueOf(num);
        String split1=str.split("\\.")[1];
        String add="";
        do{
            char c=split1.charAt(idx);
            add=add+c+"*";
            idx++;
        }while(idx<split1.length());
        System.out.println(add);
    }
}
