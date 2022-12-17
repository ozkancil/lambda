package day34_lambdafp;

public class Courses {

/*
    POJO=> plain old java object.
    Needs 3 things not to have:
    1. Can't extend to any other class
    2. can't implement anything(interfaces)
    3. No outside annotations
    no need for outside libraries.

    JAVA BEANS-> getters and setters
    1. no-args constuctor -> even though its not seen java gives it automaticlaly. Ex: Cat myCat+ new Cat(); this is a no-args constructor.
    2.properties must be private
    3. public getters and setters
    4. Must be serializable

     */

    //POJO==> Plain Old Java Object==> with its getters and setters. We put our usable variables. so with private variables are not
    //initiated so we use it so this is POJO. getters and setters are java beans.
    //if we dont want the variables to change, only update we do POJO, getters and setters, so we put private.
    //POJO is constantly needed classes. POJO classes are like storage classes.

    private String Season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;

    //1)Constructor without parameter
    public Courses() {
    }

    //2)Constructor with all parameters
    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {
        this.Season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }

    //3)getters() and setter()

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    //4)toString()
    @Override
    public String toString() {
        return "Course: Season=" + Season + ", courseName=" + courseName + ", averageScore=" + averageScore
                + ", numberOfStudents=" + numberOfStudents;
    }
}
