import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Principal3 {


    public static void main(String[] args) {

        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");

        // horário de verão, 2018
        ZoneOffset offsetSaoPaulo = fusoSaoPaulo.getRules()
                .getOffset(LocalDateTime.parse("2018-02-17T00:00:00")); // horário de verão -02:00
                //.getOffset(LocalDateTime.parse("2018-02-18T00:00:00")); // horário de verão -03:00

        System.out.println(offsetSaoPaulo);
    }

}
