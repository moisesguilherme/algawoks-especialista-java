import java.math.BigDecimal;
import java.math.RoundingMode;

public class Principal {

    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("10.0");
        BigDecimal y = new BigDecimal("3.0");

        //BigDecimal z = x.divide(y);
        //BigDecimal z = x.divide(y, 10, RoundingMode.UP);
        //BigDecimal z = x.divide(y, 10, RoundingMode.DOWN);
        BigDecimal z = x.divide(y, 10, RoundingMode.HALF_EVEN);
        // 2.524 = 2.52 (HALF EVEN)
        // 2.526 - 2.53
        // 2.525 = 2.53 (numero a esquerda (5) impar arredonda para cima)
        // 2.424 = 2.42


        System.out.println(z); // 5

        // 10.0 divide 2.0 = 5 (correto)
        // 10.0 divide 3.0 = (erro) //Non-terminating decimal expansion; no exact representable decimal result.

    }

}