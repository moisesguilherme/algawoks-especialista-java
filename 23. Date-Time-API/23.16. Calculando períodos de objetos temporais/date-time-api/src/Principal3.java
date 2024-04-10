import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Principal3 {


    public static void main(String[] args) {

        LocalDateTime dataHoraCompra = LocalDateTime.parse("2022-11-12T21:30:00");
        LocalDateTime dataHoraEntrega = LocalDateTime.parse("2022-11-12T22:10:10");

        Duration tempoEntrega = Duration.between(dataHoraCompra, dataHoraEntrega);

        System.out.println(tempoEntrega);

        //long tempoEntergaSegundos = dataHoraCompra.until(dataHoraEntrega, ChronoUnit.SECONDS);
        Long tempoEntergaSegundos = ChronoUnit.SECONDS.between(dataHoraCompra, dataHoraEntrega);

        System.out.println(tempoEntergaSegundos);

    }



}
