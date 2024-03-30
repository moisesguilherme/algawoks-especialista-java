import java.time.Duration;

public class DurationTest {

    public static void main(String[] args) {

        Duration duracao = Duration.ofHours(5);
        System.out.println(duracao); //PT5H -> P -> Periodo T -> tempo

        Duration duracao2 = Duration.ofDays(2);
        System.out.println(duracao2); //PT48H -> duration não representa dias, converte em horas

        Duration duracao3 = Duration.parse("PT5H");
        System.out.println(duracao3);


        Duration duracao4 = Duration.parse("P1DT5H"); //ISO 8601
        System.out.println(duracao4); //PT29H -> não tem dias, converte para horas

        //Duration duracaoCalculada = duracao4.plus(Duration.ofMinutes(30));
        //Duration duracaoCalculada = duracao4.plusMinutes(30); //mesmo resultado
        //Duration duracaoCalculada = duracao4.multipliedBy(2);
        Duration duracaoCalculada = duracao4.dividedBy(2);

        System.out.println(duracaoCalculada);


        Duration durationTest = Duration.parse("PT1H5M");
        System.out.println(durationTest.getSeconds());

        System.out.println(durationTest.toMinutes());
        System.out.println(durationTest.toHours());

        // part
        System.out.println(durationTest.toMinutesPart());
        System.out.println(durationTest.toHoursPart());

    }

}
