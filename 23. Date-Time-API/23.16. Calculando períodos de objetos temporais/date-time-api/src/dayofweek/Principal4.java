package dayofweek;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Principal4 {
    public static void main(String[] args) {

        Year ano = Year.parse("1980");
        //Year anoFuturo = ano.plus(Period.parse("P74Y"));
        //Year anoFuturo = ano.plus(1, ChronoUnit.CENTURIES);
        Year anoFuturo = ano.plusYears(10);


        System.out.println(ano);
        System.out.println(anoFuturo);


    }
}
