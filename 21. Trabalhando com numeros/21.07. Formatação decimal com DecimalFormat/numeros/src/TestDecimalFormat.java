import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TestDecimalFormat {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("45.363");
        BigDecimal b = new BigDecimal("-45.363");

        // ¤ Currency sing
        //NumberFormat formatador = new DecimalFormat("¤ #,##0.00");
        //NumberFormat formatador = new DecimalFormat("\u00A4 #,##0.00");

        // positivo e negativo
        NumberFormat formatador = new DecimalFormat("O valor é ¤ #,##0.00;O valor é (¤ #,##0.00)");


        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
    }
}
