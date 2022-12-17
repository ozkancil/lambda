package day18datetimeclassvargs;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class IncrementDecrement01 {
    public static void main(String[] args) {
//        int a =12;
//        int b=a++;//Post increment
//        System.out.println(a);
//        System.out.println(b);
//
//        int x=15;
//        int y=x--;//post increment
//        System.out.println(x);
//        System.out.println(y);
//
//        int m=21;
//        int n=++m;
//        System.out.println(m);
//        System.out.println(n);
//
//        int t=32;
//        int u=--t;//pre decrement
//        System.out.println(t);
//        System.out.println(u);


        LocalDate vildanDate=LocalDate.of(1994, Month.OCTOBER,6);
        LocalDate now=LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(vildanDate,now));
        System.out.println(ChronoUnit.MONTHS.between(vildanDate,now));
        System.out.println(ChronoUnit.WEEKS.between(vildanDate,now));
        System.out.println(ChronoUnit.DAYS.between(vildanDate,now));







    }
}
