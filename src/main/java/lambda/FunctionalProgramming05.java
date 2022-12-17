package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming05 {
    public static void main(String[] args) {

        Course courseTurkishDay=new Course("Summer","Turkish Day",97,128);
        Course courseTurkishNight=new Course("Winter","Turkish Night",98,154);
        Course courseEnglishDay=new Course("Spring","English Day",95,132);
        Course courseEnglishNight=new Course("Winter","English Night",93,144);

        /*
        We will use these in functional programming and in functional programming
        we need it as lists.
         */
        List<Course> courseList=new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);


        System.out.println(checkCourseNamesContainsTurkish(courseList));
    }

    //crte a mthd to check if all average scores are greater than 91
    public static boolean checkAverageScoreToBeGreaterThan91(List<Course>courseList){
      return courseList.stream().allMatch(t->t.getAverageScore()>91);
    }

    //crete a mthd to check at least one of the course names contains "Turkish" word
    public static boolean checkCourseNamesContainsTurkish(List<Course>courseList){
        return courseList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
    }
    //create a methd to print the course whos average score is the highest
    public static void checkAverageScoreTheHighest(List<Course>courseList){        //.findFirst() uses optional data type. if u dont want optional data type use .get()
       Course resulrt= courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
        System.out.println(resulrt);
    }
    //Sort the list elemtns accroding to the average score in ascending order and skip first 2 elments.
    public static List<Course> sortAvg(List<Course>courseList){   //to turn it into a list we do collect(Collectors.toList())
      return  courseList.stream().sorted((Comparator.comparing(Course::getAverageScore))).skip(2).collect(Collectors.toList());

    }
    //Sort the list elemtns accroding to the average score in ascending order and print just 3rd one.
    public static List<Course> sortAvgGetThirdOnly(List<Course>courseList){   //to turn it into a list we do collect(Collectors.toList())
        return  courseList.stream().sorted((Comparator.comparing(Course::getAverageScore))).skip(2).limit(1).collect(Collectors.toList());

}}
