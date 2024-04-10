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
        DecimalFormat formatador = new DecimalFormat("#,##0.00");
        formatador.setParseBigDecimal(true);

        //Number valor = formatador.parse(texto);
        //Double valor = (Double) formatador.parse(texto);
        //double valor = formatador.parse(texto).doubleValue();
        //double total = valor + 1000;

        //Big decimal
        BigDecimal valor = (BigDecimal) formatador.parse(texto);
        BigDecimal total = valor.add(new BigDecimal("1000"));

        // ERRO class java.lang.Double cannot be cast to class java.math.BigDecimal
        // (java.lang.Double and java.math.BigDecimal are in module java.base
        // of loader 'bootstrap')

        //System.out.println(valor.getClass());
        System.out.println(total);

    }

}