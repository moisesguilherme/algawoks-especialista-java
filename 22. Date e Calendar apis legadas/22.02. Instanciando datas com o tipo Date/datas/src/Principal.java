import java.util.Date;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {

        //System.out.println(System.currentTimeMillis());

        //Date data = new Date(0); //12 - 1970
        // Wed Dec 31 21:00:00 BRT 1969 -> UTC-3
        //Date data = new Date(1_000_000_000); //1 bilhão de mls

        Date data = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));
        System.out.println(data.getMonth());
        System.out.println(data.getYear());

    }

}
