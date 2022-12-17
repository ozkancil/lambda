package day18datetimeclassvargs;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime02_2 {
    public static void main(String[] args) {
        //Type the code that finds out how many months Ali lived. Date of birth of ali is 4th of june 1997
        LocalDate dobAli=LocalDate.of(1997, Month.JUNE,4);
        LocalDate currentDate=LocalDate.now();

        Object numOfMonths= ChronoUnit.MONTHS.between(dobAli,currentDate);
        long numOfMonths1=ChronoUnit.YEARS.between(dobAli,currentDate);
        System.out.println(numOfMonths);
        System.out.println(numOfMonths1);


        //To get how many months Ali lived we do LocalDate
        LocalDate aliLived=LocalDate.of(1992, Month.FEBRUARY,20);
        LocalDate dateNow=LocalDate.now();

        long differenceInYears=ChronoUnit.YEARS.between(dobAli,currentDate);
        System.out.println(differenceInYears);

        long birthdayDifference=ChronoUnit.YEARS.between(aliLived,dateNow);
        System.out.println(birthdayDifference);
        System.out.println(ChronoUnit.MONTHS.between(aliLived,dateNow));
        System.out.println(ChronoUnit.WEEKS.between(aliLived,dateNow));
        System.out.println(ChronoUnit.DAYS.between(aliLived,dateNow));


        //Example 3: Type code to find the time difference between Japan time zone and Germany time zone.

        LocalDateTime dtInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime dtInGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        long difference = ChronoUnit.HOURS.between(dtInGermany, dtInJapan);
        System.out.println(difference);//6


        //Example 3: Type code to find the time difference between Japan time zone and Germany time zone.
        LocalTime japan=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime germany=LocalTime.now(ZoneId.of("Europe/Berlin"));

        long timeDifference=ChronoUnit.HOURS.between(japan,germany);
        System.out.println(timeDifference);
        System.out.println(ChronoUnit.MINUTES.between(japan,germany));


    }
}
