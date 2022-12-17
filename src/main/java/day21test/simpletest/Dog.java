package day21test.simpletest;

public class Dog {

    public String name;
public int age;

public Dog(){
    this("fido",0);
}
public Dog(String name, int age){
    //this.name=name;
    //this.age=age;

}
    public void dogs( String name, int age){
this.age=age;
this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
    return age;
    }
}
