import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("398.22");
        BigDecimal b = new BigDecimal("2469.44");
        BigDecimal c = new BigDecimal("4142298.42");
        BigDecimal d = new BigDecimal("8404142298.0"); // 8 bi

        // Java 12
        // CLDR: Unicode Common Locale Data Repository
        // (Forma curta)
        //NumberFormat formatador = NumberFormat.getCompactNumberInstance();
        //NumberFormat formatador = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        NumberFormat formatador = NumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.SHORT);

        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
    }

}