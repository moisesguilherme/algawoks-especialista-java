package OffsetDateTime;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Principal1 {

    public static void main(String[] args) {

        //OffsetDateTime dataHora = OffsetDateTime.now();
        //System.out.println(dataHora);
        // 2024-03-18T07:35:28.297399111-03:00

        //System.out.println(dataHora.getOffset());
        // -03:00

        //OffsetDateTime dataHora = OffsetDateTime.now(ZoneId.of("America/Los_Angeles"));
        // 2024-03-18T03:43:55.633182300-07:00
        // resolveu com um off-set de menos 7 horas.

        //OffsetDateTime dataHora = OffsetDateTime.now(ZoneOffset.ofHours(5));
        //System.out.println(dataHora);
        // 2024-03-18T15:45:49.056325668+05:00

        //System.out.println(dataHora.getOffset());
        // +05:00


        // Parse
        OffsetDateTime dataHora = OffsetDateTime.parse("2024-06-08T20:00:00-03:00");

        System.out.println(dataHora);
        System.out.println(dataHora.getOffset());

    }

}
