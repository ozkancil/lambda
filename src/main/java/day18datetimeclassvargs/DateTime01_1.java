package day18datetimeclassvargs;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01_1 {
    public static void main(String[] args) {
        //How to get current date by typing java code?
        LocalDate dt=LocalDate.now();
        System.out.println(dt);

        //create local date and time
        LocalDateTime b=LocalDateTime.now();
        //How to get current time?
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        //How to get current date in another country by typing java code?
        LocalDate otherCountry=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(otherCountry);

        LocalDate japan=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(japan);

        //How to go to future in date?
        LocalDate ftr=LocalDate.now();
        LocalDate ftr1=ftr.plusDays(120);

        //chain method
        LocalDate ftr2=LocalDate.now();
        LocalDate ftr3=ftr2.plusYears(2).plusMonths(2).plusWeeks(2).plusDays(35);
        System.out.println(ftr3);
        //How to go to past in date
        LocalDate pst4=LocalDate.now();
        LocalDate pst5=pst4.minusYears(3).minusMonths(2).minusWeeks(3).minusDays(40);
        System.out.println(pst5);

        //get hours
        LocalTime lcltime=LocalTime.now();
        System.out.println(lcltime);
        int lcTime=lcltime.getHour();
        System.out.println(lcltime);
        int minute=lcltime.getMinute();
        System.out.println(minute);

        //How to change the format of the date?
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMMM/YYYY h:mm a");
        System.out.println(dtf);
String dtf1=dtf.format(b) ;
        System.out.println(dtf1);

        //change format of localdatetime
        DateTimeFormatter a=DateTimeFormatter.ofPattern("DD/MMMM/yyyy hh:mm a");
        String c=a.format(b);
        System.out.println(c);

        //use different hours
        DateTimeFormatter v=DateTimeFormatter.ofPattern("HH:mm a");
        String n=v.format(b);
        System.out.println(n);

        //How to create specific dates?
        LocalDate lc=LocalDate.of(2027,2,23);
        LocalDate lc2=LocalDate.of(2023,3,31);
        System.out.println(lc+"   "+lc2);
        //how to compare two dates
        //In isBefore() method if the first date is before the second date you get true
        //otherwise you get false

        boolean isBefore=lc.isBefore(lc2);
        System.out.println(isBefore);


    }

}
