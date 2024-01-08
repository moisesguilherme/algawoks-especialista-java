import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Principal1 {

    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.parse("2022-09-15");
        LocalDate dataEntrega = LocalDate.parse("2022-11-12");

        Period tempoEntrega = Period.between(dataCompra, dataEntrega);
        System.out.println(tempoEntrega);


    }

}
