package day18datetimeclassvargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime02 {
    public static void main(String[] args) {
        //Type the code that finds out how many months Ali lived. Date of birth of ali is 4th of june 1997
        LocalDate dobAli=LocalDate.of(1997, Month.JUNE,4);
        LocalDate currentDate=LocalDate.now();

        Object numOfMonths=ChronoUnit.MONTHS.between(dobAli,currentDate);
        long numOfMonths1=ChronoUnit.MONTHS.between(dobAli,currentDate);
        System.out.println(numOfMonths);
        System.out.println(numOfMonths1);

        //Example 2: Ali was born 45 years, 8 motnhs and 5 days after 29 october 1923.
        //veli was born 24 years, 2 months and 11 days before 15 september 1993
        //Type code to calculate the exact date of birth of Ali and Veli
        //Type code to check if the date of birth of Ali and Veli is the same or not.

        LocalDate dobTom=LocalDate.of(1923,Month.OCTOBER,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dobVeli=LocalDate.of(1993,Month.SEPTEMBER,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dobTom);
        System.out.println(dobVeli);

       boolean isSame= dobTom.equals(dobVeli);
       boolean isSame1=dobTom.isEqual(dobVeli);//they say this is better for dates.
        System.out.println(isSame);


        //type code to find teh time difference in hours between japan time zone and Germany time zone.

      //Example 3: Type code to find the time difference between Japan time zone and Germany time zone.

        LocalDateTime dtInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime dtInGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        long difference = ChronoUnit.HOURS.between(dtInGermany, dtInJapan);
        System.out.println(difference);//6

    }
}
