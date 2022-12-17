package day34_lambdafp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Courses {
    public static void main(String[] args) {
        /*
        what we do here is that we are calling the object of the other class, and putting the infor insdie the parameter
        because we used object on the other class and put the information in there. as i change the object naame i can constatnly add
        more information.
         */
        Courses courseTurkishDay=new Courses("Summer","Turkish Day",97,128);
        Courses courseTurkishNight=new Courses("Winter","Turkish Night",98,154);
        Courses courseEnglishDay=new Courses("Spring","English Day",95,132);
        Courses courseEnglishNight=new Courses("Winter","English Night",93,144);

        List<Courses> coursesList=new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(courseTurkishDay);
        System.out.println(coursesList);

        System.out.println(checkAverageScoresToBeGreaterThanGivenNumber(coursesList,92));
        System.out.println(checkIfAnyCourseNameContainesGivenWord(coursesList,"Ozkan"));
        System.out.println(sortCourseWithTheAverageScoreInAscendingSkipFirstGiven(coursesList,2));
    }

    //create a method if all average scores are greater than given number
    public static boolean checkAverageScoresToBeGreaterThanGivenNumber(List<Courses>list,double avg) {
      return  list.stream().allMatch(t -> t.getAverageScore() > avg);


    }

    //create a method to check if at least one of the course names contains given word
    public static boolean checkIfAnyCourseNameContainesGivenWord(List<Courses>list, String word){

       return list.stream().anyMatch(t->t.getCourseName().contains(word));
    }
    //create a method to print the course whos average score is the highest
    public static String checkAverageScoreIsHighest(List<Courses>list){
      return  list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }
    //sort the list elements according to the average score in ascending order and skip first given one.
    public static List<Courses> sortCourseWithTheAverageScoreInAscendingSkipFirstGiven(List<Courses>list,int num){
      return   list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num).collect(Collectors.toList());
    }
}
