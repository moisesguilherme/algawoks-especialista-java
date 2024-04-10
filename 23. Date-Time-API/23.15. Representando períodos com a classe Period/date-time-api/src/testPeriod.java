import java.time.LocalDate;
import java.time.Period;

public class testPeriod {

    public static void main(String[] args) {

        //não nomaliza os dias, fica 40 D
        Period periodo = Period.parse("P10Y15M40D").normalized();

        System.out.println(periodo);

        LocalDate dataInicial = LocalDate.of(2023, 1, 1);
        LocalDate dataFinalComPeriodo = dataInicial.plus(periodo);
        Period periodoTotal = Period.between(dataInicial, dataFinalComPeriodo);
        System.out.println(periodoTotal);

        System.out.println(dataFinalComPeriodo);

    }

}
