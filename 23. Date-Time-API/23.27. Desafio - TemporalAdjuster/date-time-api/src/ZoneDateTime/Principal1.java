package ZoneDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal1 {


    public static void main(String[] args) {

        ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now();
        System.out.println(dataHoraFusoPadrao);
        // 2024-03-16T18:38:11.986530283-03:00[America/Sao_Paulo]
        // -03:00 é o offset ou seja -3 horas do UTC
        // [America/Sao_Paulo] - Se tiver no horário de verão vai diminuir uma hora.

        ZonedDateTime dataHoraLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(dataHoraLosAngeles);
        // 2024-03-16T14:55:45.741058182-07:00[America/Los_Angele


        System.out.println(dataHoraFusoPadrao.getOffset());
        System.out.println(dataHoraFusoPadrao.getZone());
        // -03:03
        // America/Sao_Paulo


    }


}
