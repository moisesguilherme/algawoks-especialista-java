import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Cambio {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do produto em Dólares: ");
        String precoProdutoDigitado = scanner.nextLine();

        System.out.print("Preço de 1 Dólar em Real: ");
        String precoDolarDigitado = scanner.nextLine();

    }

}