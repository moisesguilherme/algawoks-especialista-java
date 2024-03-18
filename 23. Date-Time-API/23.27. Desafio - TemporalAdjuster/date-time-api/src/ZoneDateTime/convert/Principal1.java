package ZoneDateTime.convert;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Principal1 {

    public static void main(String[] args) {

        ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now();

        System.out.println(dataHoraFusoPadrao);
        // 2024-03-18T06:16:21.227626196-03:00[America/Sao_Paulo]
        // Off-set e fuso horário resolvido.

        LocalDateTime dataHoraSemFuso = dataHoraFusoPadrao.toLocalDateTime();
        // método toLocalDate, to alguma coisa, não faz conversão, pega sem a parte do offset e fuso
        System.out.println(dataHoraSemFuso);
        // 2024-03-18T06:20:03.704855165
        // Ele tira o offset e o fuso horário

    }

}
