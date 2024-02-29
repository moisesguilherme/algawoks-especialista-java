package yearmonth;

import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class Principa2 {


    public static void main(String[] args) {

        YearMonth anoMes = YearMonth.parse("2024-02");

        // plus recebe um Temporal Amount (Period)
        //YearMonth anoMesFuturo = anoMes.plus(Period.parse("P10D")); // Unsupported unit: Days
        //YearMonth anoMesFuturo = anoMes.plus(Period.parse("P2Y5M"));

        //YearMonth anoMesFuturo = anoMes.plus(2, ChronoUnit.CENTURIES);
        YearMonth anoMesFuturo = anoMes.plusMonths(10);

        System.out.println(anoMesFuturo);

        //Long tempoEmMeses = anoMesFuturo.until(YearMonth.of(2025, 10), ChronoUnit.MONTHS);
        Long tempoEmMeses = anoMes.until(LocalDate.parse("2025-03-01"), ChronoUnit.MONTHS);
        System.out.println(tempoEmMeses);


    }
}
