package practice.day31;

public class CalculateAverage {
    //create a method that calculates 4 students' 6,4,3, and 5 exams' aaverage respectively.

    public static void main(String[] args) {
        calculateAverage("Tom Hanks",55,69,45,90,100);
calculateAverage("John Trovalto",45,34,56,79,56,66 );
calculateAverage("Cuneyt Arkin",99,100,98);



    }


    public static void calculateAverage(String stdName, double...mark){
        double sum=0;

        for(double w:mark){
            sum+=w;//this will increase the value of the sum with w.

        }
        System.out.println(stdName+"'s Average of Exams: "+String.format ("%.2f",sum/mark.length));
    }
}
