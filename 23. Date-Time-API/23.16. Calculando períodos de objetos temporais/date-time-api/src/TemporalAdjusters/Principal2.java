package TemporalAdjusters;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Principal2 {

    public static void main(String[] args) {

        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        //LocalDate dataNatal = dataHoje.withMonth(12).withDayOfMonth(25);

        LocalDate dataNatal = dataHoje.with(new NatalTemporalAdjuster());
        System.out.println(dataNatal);

    }

}
