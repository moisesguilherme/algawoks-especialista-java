import java.time.Instant;

public class Principal1 {

    public static void main(String[] args) {

        //System.out.println(new Date());
        Instant instant = Instant.now();
        System.out.println(instant);

        //Fri Dec 22 07:37:15 BRT 2023 (-3 horas)
        //2023-12-22T10:35:27.043087847Z -> sempre no UTC

        System.out.println(instant.getEpochSecond()); // desde 1970
        System.out.println(instant.getNano()); //uma precisão maior

        // 1 mili segundos tem 1 milão de nano segundos
        System.out.println(instant.toEpochMilli());
        System.out.println(System.currentTimeMillis());

    }

}
