import java.time.Instant;
import java.util.Date;

public class Principal2 {

    public static void main(String[] args) {
        Instant instante = Instant.now();

        //Converter para date
        Date data = Date.from(instante);

        System.out.println(instante);
        System.out.println(data);

        //2023-12-22T10:47:30.608166885Z (instant) soma 3
        //Fri Dec 22 07:47:30 BRT 2023

    }

}
