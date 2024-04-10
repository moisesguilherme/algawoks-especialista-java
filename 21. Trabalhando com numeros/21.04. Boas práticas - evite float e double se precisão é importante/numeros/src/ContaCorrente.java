import java.math.BigDecimal;

public class ContaCorrente {

    // como é um objeto precisa instanciar, poderia ser. -> new BigDecimal("0");
    private BigDecimal saldo = BigDecimal.ZERO;

    public void depositar(BigDecimal valor) {
        //saldo += valor;
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valorSaque) {
        //valorSaque > saldo
        if (valorSaque.compareTo(saldo) > 0) {
            throw new RuntimeException(
                    String.format("Saque: %s, Saldo: %s", valorSaque, saldo));
        }

        //saldo -= valorSaque;
        saldo = saldo.subtract(valorSaque);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

}