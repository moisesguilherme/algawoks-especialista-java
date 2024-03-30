package ZoneDateTime.convert.viagemVoo;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal1 {


    public static void main(String[] args) {

        Duration duracaoVoo = Duration.parse("PT12H22M");
        ZonedDateTime dataHoraDecolagem = ZonedDateTime
                .parse("2022-11-20T20:00:00-03:00[America/Sao_Paulo]");

        ZonedDateTime dataHoraPousoPrevisto = dataHoraDecolagem
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"))
                .plus(duracaoVoo);
        //.plus Já leva em consideração o off-set e faz o cálculo
        // 15 horas (Los Angeles)
        // 15 + 12H e 22M
        // 24H + 3H e 22M (1D e 3H e 22M)

        System.out.println(dataHoraDecolagem);
        System.out.println(dataHoraPousoPrevisto);

    }

}
