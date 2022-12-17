package testmyself.inheritance;

public class Test extends Test1{
    String studentName;
    int studentID;

    public void studentInfo(String studentName, int studentID){
        System.out.println(super.grade=95);
        System.out.println(super.gradeLetter='A');



        this.studentID=studentID;
        this.studentName=studentName;

        System.out.println("Student name is "+studentName+". Student ID is "+studentID);
        System.out.println("This student "+studentName+ " recevied a grade of "+grade+ " which gives him a grade letter of "+ gradeLetter+". You " +
                "can find him through his ID number which is "+studentID);
    }
    public void getData(){
        studentInfo("Ozkan Cil",2030);


    }


}
class Test1
{
    int grade;
    char gradeLetter;

    public void test1(int grade, char gradeLetter){
        this.grade=grade;
        this.gradeLetter=gradeLetter;

    }


}
class Runner1{
    public static void main(String[] args) {
        Test t=new Test();
        t.getData();

    }
}