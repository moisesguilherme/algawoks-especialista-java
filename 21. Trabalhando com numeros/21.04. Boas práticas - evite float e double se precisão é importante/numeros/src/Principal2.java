import java.math.BigDecimal;

public class Principal2 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(new BigDecimal(1.0));

        conta.sacar(new BigDecimal(0.10));
        conta.sacar(new BigDecimal(0.20));
        conta.sacar(new BigDecimal(0.30));
        conta.sacar(new BigDecimal(0.40));
        // perde a precisão se for em double
        // ideal é usar com string "0.40"
        // erro: 0.3999999999999999944488848768742172978818416595458984375

        System.out.println(conta.getSaldo());
    }

}
