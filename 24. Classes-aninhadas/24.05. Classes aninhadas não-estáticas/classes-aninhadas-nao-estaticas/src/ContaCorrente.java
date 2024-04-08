import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContaCorrente {

    private BigDecimal saldo;
    private List<Transacao> transacoes = new ArrayList<>();

    public ContaCorrente(BigDecimal saldoInicial) {
        this.saldo = saldoInicial;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return Collections.unmodifiableList(transacoes);
    }

    // Classe aninhada não estática (sem estatic)
    // diferença na forma de instanciar ->
    // ContaCorrente.Transacao transacao1 = conta.new Transacao()

    // Com private não daria certo, acessar os metodos
    public class Transacao {

        private String descricao;
        private BigDecimal valor;

        public Transacao(String descricao, BigDecimal valor) {
            this.descricao = descricao;
            this.valor = valor;
            // A classe aninhada consegue acessar a variável de instância
            // da classe superior.
            saldo = saldo.subtract(valor);
            transacoes.add(this); // a própria instância
        }

        public String getDescricao() {
            return descricao;
        }

        public BigDecimal getValor() {
            return valor;
        }

    }


}