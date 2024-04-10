import java.math.BigDecimal;

public class Principal1 {

    public static void main(String[] args) {

        // BigDecimal, tem precisão decimal, mas a operacão é mais lenta q double
        BigDecimal valorTotal = new BigDecimal("2.05");
        BigDecimal valorPago = new BigDecimal("1.05");

        //double valorDevido = valorTotal - valorPago; (BigDecimal não faz assim)
        BigDecimal valorDevido = valorTotal.subtract(valorPago);

        System.out.println(valorDevido);
    }

}