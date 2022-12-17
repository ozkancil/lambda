package day18datetimeclassvargs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //How to get current date by typing java code?
        LocalDate currentDate=LocalDate.now();//takes date and time from out computer system.
        System.out.println(currentDate);
        LocalTime currentTime=LocalTime.now();//
        System.out.println(currentTime);

        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);

        //How to get current date in another country by typing java code?
        LocalDate currentDateInJapan=LocalDate.now(ZoneId.of("Asia/Tokyo"));

        //How to go to future in date?
        LocalDate cd1=LocalDate.now();
        LocalDate cd1Next=cd1.plusDays(120);
        System.out.println(cd1Next);

        LocalDate next=cd1.plusYears(2).plusDays(120);//when u use multiple methods in one line its called
        //method chain.
        System.out.println(next);

        //How to go to past in date
        LocalDate past=LocalDate.now();
        past.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(past);


        //get hours
        LocalTime ct2=LocalTime.now();
        LocalTime c8=LocalTime.now();
        int hours=c8.getHour();
        int hour=ct2.getHour();
        System.out.println(hour);

        int minute=ct2.getMinute();
        System.out.println(minute);

        //How to change the format of the date?
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM//yyyy");//Upper case M is for months, Lower case
        //months is for minutes.
        String formattedCurrentDate=dtf.format(cd1);
        System.out.println(formattedCurrentDate);




        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MMM//yy");//3 M's gives you the first 3 characters of the month name
        //yy gives u the last 2 digits of the year
        String formattedCurrentDate2=dtf.format(cd1);
        System.out.println(formattedCurrentDate2);


        DateTimeFormatter d=DateTimeFormatter.ofPattern("dd/MMMM//yyyy");//MMMM gives you full name of the month
        String formattedCurrentDate3=dtf.format(cd1);
        System.out.println(formattedCurrentDate3);


        //How to change format of the time
        DateTimeFormatter mnr=DateTimeFormatter.ofPattern("hh:mm a");//hh uses 12 hours system, HH uses 24 hours system.
                                                                    //single 'a' is for displaying "PM".
        LocalTime lt=LocalTime.now();

        String formattedCurrentTime=mnr.format(lt);
        System.out.println(formattedCurrentTime);


        //How to create specific dates?
        LocalDate dob1=LocalDate.of(2012,3,12);
        LocalDate dob2=LocalDate.of(2013, Month.MAY,21);

        /*
        Enum is something like class normally in a class you have variables and methods. In Enum you may have variables
        and methods as well. But when we create enum we use it to store constant variables. Unchangeable variables. Like months...
        Whenever you need unchangeable variables use Enum.
        For example you are creating for Honda- honda has some models like civir, hrv, Accord...
        Their names will not change anytime Honda civic exists for many years.
        If you are sure they will remain same for long time, you are creating application for Honda you will use civic model many times in your application then you
        put them in your enum.
        You don't need to memorise model names. Go to enum and get the one you need. When you create a value in enum you can add values. For example: you are working
        with states in USA to create a enum and put states in it. Then you create method to get variables from that enum.
         */

        //how to compare two dates
        //In isBefore() method if the first date is before the second date you get true
        //otherwise you get false
        boolean isBefore=dob1.isBefore(dob2);
        System.out.println(isBefore);

        boolean is=dob2.isBefore(dob1);
        System.out.println(is);




    }
}
