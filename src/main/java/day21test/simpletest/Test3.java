package day21test.simpletest;

public class Test3 {
    int brothers;
    int sisters;
    String siblingNames;
Test3(int brothers,int sisters, String siblingNames){
    this.brothers=brothers;
    this.sisters=sisters;
    this.siblingNames=siblingNames;

    System.out.println("Parent class constructor");


}
int add(int a, int b){
    return a*b;
}

}

class Em extends Test3{
    String parentNames;
    Em(int brothers, int sisters, String siblingNames, String parentNames){
        super(brothers,sisters,siblingNames);
        this.parentNames=parentNames;

    }
    void getMethod(){
        System.out.println(super.add(2,6));
        System.out.println(brothers+" "+sisters+siblingNames+parentNames);
    }
}
class Ex{
    public static void main(String[] args) {
        Em em=new Em(6,1,"Samil, cemal, tarik, fatih, ozgur, ozkan, meral",". Temel and emine cil");
        em.getMethod();
        em.getMethod();
    }
}
