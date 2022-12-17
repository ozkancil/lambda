package day23encapsulationabstraction;

public class Student {
    public String name="Tom hanks";

    private String stdID="TH123";

    private double stdGPA=3.8;

    private String disease="Heart Disease";

    private boolean smart=true;
    private boolean isSuccessful=false;

//NOTE: if the data type is boolean get method name starts with is not get, but makes it "is" for booleans.


    public boolean isSmart() {
        return smart;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }


    public String getDisease(){
        return disease;
    }
    public String getStdID() {
        return stdID;
    }

    public double getStdGPA() {
        return stdGPA;
    }




    public void setStdGPA(double stdGPA) {
        this.stdGPA = stdGPA;
    }

    //    private String disease="Heart Disease";
    public void setDisease(String disease) {
        this.disease = disease;
    }

    //private String stdID="TH123";

    public void setStdID(String stdID){
        this.stdID=stdID;
    }


    public void setSuccessful(boolean successful) {
        isSuccessful = successful;


    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public static void main(String[] args) {
        /*
                  Encapsulation:
        Encapsulation is "data hiding"
        To hide a data we make the access modifier "private"
        After "hiding data" you may need to read or update the data.
        To read or update the data we will create some methods.
        To read encapsulated data you should create get() methods.
        get() methods are for reading. We name it getters.
        To update encapsulated data we use set() methods, we name it setters
        Making it private makes it encapsulated.
        WHEN DO WE NEED ENCAPSULATION?
        For ssn, personal information.


        NOTE: get and set methods are called java beans.

         */

    }

}
