package day20accessmodifiersinheritance;

public class Runner {
    public static void main(String[] args) {
        //to access StudentClass for the stdName we must maake an object
        //public, default and protecteed is visible but not private

        //I accessed data on teh object
        StudentClass obj=new StudentClass();
        System.out.println(obj.stdName);
        obj.stdName="Ozkan";
        System.out.println(obj.stdName);
        System.out.println(obj.stdGPA);
        System.out.println(obj.stdAddress);

        StudentClass std2=new StudentClass();
        obj.stdGPA=2.3;
        double gpa=obj.stdGPA;
        System.out.println(gpa);

        //here we accessed data inside the class without using object
        System.out.println(StudentClass.GPA);
        StudentClass.Address="!06 tall pine circle";
        System.out.println(StudentClass.Address);
        System.out.println(StudentClass.Name);



    }
}
