import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Principal4 {


    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant);


        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        LocalDateTime dataHora = LocalDateTime.ofInstant(instant, fusoSaoPaulo);
        System.out.println(dataHora);

        //
        //2024-03-10T23:47:47.491046302Z (com zone time)
        //2024-03-10T20:47:47.491046302 (sem zone time)
    }


}
