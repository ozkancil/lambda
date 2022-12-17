package day11constructorsmethodcallstatickeyword;

public class Static01 {
    //so when we make things static all can see the change
    //when we make things non-static then only the one we changed will see it.
    /*
    1. static class members (variables and methods) are common for all objects created from the class
    2. when u do any updates on static class members everyone will see the updates on it
    3. if u want every object informed about every update on a class member make it static

     */
//how to create a static variable
    //to make a variable static, put static keyword btwn access modifier and data type
    public static int staticCounter=0;//when u do update on static variables all objects will be informed about the update.
  public  int nonStaticCounter=0;// this is local to only this variable.

  //to make a constructor put the access modifier and class name
    public Static01(){
        staticCounter++;//
        nonStaticCounter++;//


    }

}
