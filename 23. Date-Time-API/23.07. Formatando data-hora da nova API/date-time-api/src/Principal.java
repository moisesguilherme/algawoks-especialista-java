import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
        //DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME; //2023-12-29T07:27:40.038196631
        //DateTimeFormatter formatador = DateTimeFormatter.ISO_DATE; // 2023-12-29

        /*DateTimeFormatter formatador = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
                .withLocale(new Locale("pt", "BR"));
        */
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy 'às' HH:mm:ss");


        System.out.println(dataHora);

        //DateTimeFormatter.ISO_DATE_TIME.format(dataHora);
        System.out.println(formatador.format(dataHora));
        //System.out.println(dataHora.format(formatador));

        OffsetDateTime testData1 = OffsetDateTime.now();
        System.out.println(testData1);

        LocalDateTime test = LocalDateTime.now();
        System.out.println(test);
    }

}
