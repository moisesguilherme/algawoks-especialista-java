package ZoneDateTime.convert;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal2 {

    public static void main(String[] args) {

        LocalDateTime dataLocalDaFesta = LocalDateTime.parse("2024-08-06T20:00:00");

        //ZonedDateTime dataDaFestaFusoPadrao = ZonedDateTime
        // .of(dataLocalDaFesta, ZoneId.systemDefault());

        // Mesmo resultado com ZoneId.of
        ZonedDateTime dataDaFestaFusoPadrao = dataLocalDaFesta
                .atZone(ZoneId.of("America/Los_Angeles"));

        ZonedDateTime dataDaFestaFusoChina = ZonedDateTime
                .of(dataLocalDaFesta, ZoneId.of("Asia/Shanghai"));


        System.out.println(dataLocalDaFesta);
        // 2024-08-06T20:00

        System.out.println(dataDaFestaFusoPadrao);
        // 2024-08-06T20:00-03:00[America/Sao_Paulo]

        System.out.println(dataDaFestaFusoChina);
        // 2024-08-06T20:00+08:00[Asia/Shanghai]
        // adiciona o fuso horário e calcula o offset +08:00


        ZonedDateTime dataHoraNaChina = dataDaFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("Asia/Shanghai"));
        // Também tem como calcular com o Instant, ofInstance


        System.out.println(dataHoraNaChina);
        // 2024-08-07T07:00+08:00[Asia/Shanghai]

        // Lista todos os fusos horários
        //System.out.println(ZoneId.getAvailableZoneIds());


    }

}
