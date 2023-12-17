import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(new Locale("pt", "BR"));

        String texto = "1.000,43";
        //String texto = "1000.43";

        //double valor = Double.valueOf(texto); //java.lang.NumberFormatException:
        NumberFormat formatador = new DecimalFormat("#,##0.00");
        Number valor = formatador.parse(texto);

        System.out.println(valor.getClass());
        System.out.println(valor);

    }

}