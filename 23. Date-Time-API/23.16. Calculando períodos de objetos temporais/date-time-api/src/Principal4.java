import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Principal4 {

    public static void main(String[] args) {
        Duration tempoMedioEntrega = Duration.parse("PT45M");
        LocalDateTime agora = LocalDateTime.now();


        // Truncar 
        LocalDateTime dataHoraEntregaPrevista = agora.plus(tempoMedioEntrega)
                .truncatedTo(ChronoUnit.MINUTES);

        System.out.println(agora);
        System.out.println(dataHoraEntregaPrevista);

    }

}
