package testmyself;
/*
so static blocks are those that run before main methods. when we run them the run before the main method.

 */

import org.w3c.dom.ls.LSOutput;

public class StaticBlock {
   public   static int num1=0;
   public static String name="Yavuz";

    static{
        System.out.println("==============STATIC block 1 starts here ======================");
 int num=0;
        System.out.println(num+" num insdie static block");
        System.out.println(num1+" num1 inside static block 1");

    }


    public static void main(String[] args) {
        System.out.println("==========this is main method============");
        int num=0;
        System.out.println(num);
        System.out.println(num1);
    }
    static{
        System.out.println("=============This is static 2================");
        String name1="ozkan";
        System.out.println(name1);
        System.out.println(name);
    }
}
