package ZoneDateTime.convert;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal3 {

    public static void main(String[] args) {
        ZonedDateTime dataHoraFusoSaoPaulo = ZonedDateTime
                .parse("2024-08-06T20:00-07:00[America/Sao_Paulo]");

        Instant instant = dataHoraFusoSaoPaulo.toInstant();

        LocalDateTime dataHoraLocalChina = LocalDateTime
                .ofInstant(instant, ZoneId.of("Asia/Shanghai"));

        System.out.println(dataHoraFusoSaoPaulo);
        // 2024-08-07T00:00-03:00[America/Sao_Paulo]

        System.out.println(instant);
        // 2024-08-07T03:00:00Z - Z (zulu time)
        // Já calcula com o time zone (adiciona 3 horas)

        System.out.println(dataHoraLocalChina);
        // 2024-08-07T11:00

    }

}
