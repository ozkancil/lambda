package day21test.test;

public class Two {
  Two(){//i need this constructor cuz java is jealouse and it will delete the one it has if i
      //make one. so i need to make a constructor that has no paramter cuz child class One has
      //no constructors.
      //if we want it from the class we use this. if we want parent we use super()
//this() is used to call constructor from the same classs
    //this() must be in the first line in a constructor body
    //super() is used to call constructors in the parent class.
  }
    Two(int engineSize){
        System.out.println(1);
    }
    Two(int enginePrice,String make){
      this(300);
    }
}
