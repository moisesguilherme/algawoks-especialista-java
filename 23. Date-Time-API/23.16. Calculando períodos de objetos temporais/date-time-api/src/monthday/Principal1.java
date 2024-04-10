package monthday;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Principal1 {

    public static void main(String[] args) {

        // MonthDay diaMesAtual = MonthDay.now(); //--11-24 (não tem ano)
        //MonthDay diaAniversario = MonthDay.of(Month.AUGUST, 6);
        //MonthDay diaMes = MonthDay.from(LocalDate.now());
        MonthDay diaMes = MonthDay.parse("--02-26");

        System.out.println(diaMes);

        //LocalDate dataAniversario = diaMes.atYear(2022);
        LocalDate dataAniversario = Year.now().atMonthDay(diaMes);

        System.out.println(dataAniversario.getClass());

        System.out.println(diaMes);

    }

}
