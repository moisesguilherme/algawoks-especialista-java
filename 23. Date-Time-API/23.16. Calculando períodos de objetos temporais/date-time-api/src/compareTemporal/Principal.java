package compareTemporal;

import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistDate;

public class Principal {

    public static void main(String[] args) {

        LocalDate hoje1 = LocalDate.now();
        LocalDate hoje2 = LocalDate.now();
        LocalDate depoisDeAmanha = hoje1.plusDays(2);

        // Sistema de calendário diferente. Budista.
        ThaiBuddhistDate hojeThai = ThaiBuddhistDate.now();
        System.out.println(hojeThai);

        //System.out.println(hoje1.equals(hoje2)); //true

        System.out.println(hoje1.equals(hojeThai)); //false

        // Para comparar sistemas diferentes
        System.out.println(hoje2.isEqual(hojeThai)); //true

        //System.out.println(depoisDeAmanha.compareTo(hoje2)); // -2, 0, 2
        System.out.println(depoisDeAmanha.compareTo(hoje1) > 0 ); //true
        System.out.println(depoisDeAmanha.isAfter(hoje1)); // true
        System.out.println(depoisDeAmanha.isBefore(hoje1)); // true

    }

}
