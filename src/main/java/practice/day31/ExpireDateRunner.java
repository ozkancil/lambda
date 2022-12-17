package practice.day31;

public class ExpireDateRunner {
    public static void main(String[] args) {

        ExpireDate obj1=new ExpireDate("Cheese", 10.29,10);
        System.out.println(obj1.productName+ " "+obj1.productPrice+ "$. "+obj1.expirationDate);

        ExpireDate obj2=new ExpireDate("Milk",4.99);
        System.out.println(obj2.productName+ " "+obj2.productPrice+"$");

        ExpireDate obj3=new ExpireDate("Salt",3.99);
        System.out.println(obj3.productName+" "+obj3.productPrice+"$");


    }
}
