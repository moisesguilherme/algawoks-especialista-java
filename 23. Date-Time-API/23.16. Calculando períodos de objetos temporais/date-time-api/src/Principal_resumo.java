import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Principal_resumo {


    public static void main(String[] args) {

        System.out.println(new Date());

        //Instant instant = Instant.now();
        //System.out.println(instant);
        //System.out.println(instant.getNano());

        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje.withMonth(5));
        System.out.println(dataHoje.withDayOfMonth(4));


    }

}
