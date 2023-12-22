import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Principal {

    public static void main(String[] args) {
        double a = 4_142_298.4238;
        float b = 0.3f;
        int c = -1;
        BigDecimal d = new BigDecimal("45.362");

        // #.### (arredonda se necessário e quando não tem numero não exibe nas casas decimais, no intero ele exibe)
        //NumberFormat formatador = new DecimalFormat("#.###");

        // ¤ -> Currency sign
        // padrão positivo : padrão negativo
        // NumberFormat formatador = new DecimalFormat("O valor é \u00A4 #,##0.000;O valor é (\u00A4 #,##0.000)");
        //formatador.setRoundingMode(RoundingMode.UP);

        // Formatador para percentual
        //NumberFormat formatador = NumberFormat.getPercentInstance();
        // Formatador de moeda padrão
        NumberFormat formatador = NumberFormat.getCurrencyInstance();


        System.out.println(formatador.format(a)); //4142298.424 vai exibir . pois o SO está em inglês
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));

    }

}