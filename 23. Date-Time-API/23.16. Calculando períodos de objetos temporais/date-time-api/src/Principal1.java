import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Principal1 {

    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.parse("2022-09-15");
        LocalDate dataEntrega = LocalDate.parse("2022-11-12");

        //Period tempoEntrega = Period.between(dataCompra, dataEntrega); // P1M28D
        Period tempoEntrega = dataCompra.until(dataEntrega); //Mesmo resultado P1M28D
        System.out.println(tempoEntrega);

        long tempoEntregaSemanas = dataCompra.until(dataEntrega, ChronoUnit.WEEKS);
        System.out.printf("%d semanas%n", tempoEntregaSemanas);

        System.out.println(ChronoUnit.WEEKS.between(dataCompra, dataEntrega));



        // Semanas no ano
        LocalDate dataInicial = LocalDate.parse("2023-01-01");
        LocalDate dataFinal = LocalDate.parse("2023-12-31");

        System.out.println(ChronoUnit.WEEKS.between(dataInicial, dataFinal));

    }

}
