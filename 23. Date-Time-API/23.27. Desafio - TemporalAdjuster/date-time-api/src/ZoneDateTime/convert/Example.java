package ZoneDateTime.convert;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Example {

    public static void main(String[] args) {

        String dataRecebida = "2023-03-20 10:00:00.1 +10:30";
        //String dataRecebida = "2023-03-20 10:00:00.12 +10:30";
        //String dataRecebida = "2023-03-20 10:00:00.123 +10:30";
        //String dataRecebida = "2023-03-20 10:00:00.1234 +10:30";
        //String dataRecebida = "2023-03-20 10:00:00.1235 +10:30";
        //String dataRecebida = "2023-03-20 10:00:00.12356 +10:30";
        //String dataRecebida = "2023-03-20 10:00:00.1 +2:30";
        //String dataRecebida = "2023-03-20 10:00:00.12 +2:30";
        //String dataRecebida = "2023-03-20 10:00:00.123 +2:30";
        //String dataRecebida = "2023-03-20 10:00:00.1234 +2:30";
        //String dataRecebida = "2023-03-20 10:00:00.1235 +2:30";
        //String dataRecebida = "2023-03-20 10:00:00.12356 +2:30";


        DateTimeFormatter formato = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .append(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                .appendFraction(ChronoField.NANO_OF_SECOND, 0, 6, true)
                .appendLiteral(" ")
                .appendOffset("+H:mm", "")
                .toFormatter();

        OffsetDateTime dataConvertida = OffsetDateTime
                .parse(dataRecebida, formato);

        System.out.println(dataConvertida);



    }


}
