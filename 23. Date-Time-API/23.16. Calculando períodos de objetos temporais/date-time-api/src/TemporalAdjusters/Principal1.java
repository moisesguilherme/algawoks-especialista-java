package TemporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Principal1 {


    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        //ajustar campos temporais


        // TemporalAdjuster - que é uma interface para implementar e colocar uma lógica.
        // TemporalAdjusters - Classe que tem métodos abstratos com diversas lógicas implementadas

        LocalDate primeiraSegundaProximoMes = dataHoje
                .plusMonths(1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        System.out.println(primeiraSegundaProximoMes);

        //2022-11-25 -- gravado
        //2023-02-19 -- módulo liberado
        //2024-02-29 -- diahoje


        // Ultimo dia do mes
        //LocalDate dataUltimoDiaDoMes = dataHoje.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
        LocalDate dataUltimoDiaDoMes = dataHoje.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(dataUltimoDiaDoMes);

        LocalDate dataProximaSextaFeira = dataHoje.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(dataProximaSextaFeira);


    }

}
