package ZoneDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal2 {


    public static void main(String[] args) {

        ZonedDateTime dataFestaSaoPaulo = ZonedDateTime
                .parse("2023-09-13T20:00:00-03:00[America/Sao_Paulo]");

        //ZonedDateTime dataFestaLosAngeles = dataFestaSaoPaulo
        //        .withZoneSameLocal(ZoneId.of("America/Los_Angeles")); // Trava a data hora local.

        //System.out.println(dataFestaSaoPaulo);
        //System.out.println(dataFestaLosAngeles);
        //2023-09-13T20:00-03:00[America/Sao_Paulo]
        //2023-09-13T20:00-07:00[America/Los_Angeles] --> nessa data tem horário de verão.


        ZonedDateTime dataFestaLosAngeles = dataFestaSaoPaulo
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataFestaSaoPaulo);
        //2023-09-13T20:00-03:00[America/Sao_Paulo]

        System.out.println(dataFestaLosAngeles);
        //2023-09-13T16:00-07:00[America/Los_Angeles]

        System.out.println(dataFestaSaoPaulo.equals(dataFestaLosAngeles));
        // false - não são objetos iguais, o instante é o mesmo, mas possui informações diferentes.

        System.out.println(dataFestaSaoPaulo.isEqual(dataFestaLosAngeles));
        // true

    }

}
