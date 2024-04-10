import java.math.BigDecimal;

public class Conta {

    private BigDecimal saldo;

    public Conta(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Transacao efetuarPagamento(BigDecimal valor) {
        BigDecimal taxa = valor.multiply(new BigDecimal("0.10"));
        saldo = saldo.subtract(taxa).subtract(valor);

        class Pagamento implements Transacao {

            /*private BigDecimal valor;
            private BigDecimal taxa;

            public Pagamento(BigDecimal valor, BigDecimal taxa) {
                this.valor = valor;
                this.taxa = taxa;
            }*/

            @Override
            public BigDecimal getValorTotal() {
                // tem acesso as variáveis locais do método
                return valor.add(taxa);
            }

            @Override
            public void reembolsar() {
                saldo = saldo.add(taxa).add(valor);
            }

        }

        //Conta.this.saldo = new BigDecimal(0);
        return new Pagamento();
    }

    public Transacao cobrarTarifa(BigDecimal valor) {
        saldo = saldo.subtract(valor);

        class Tarifa implements Transacao {

            //usar métodos estáticos
            public static void testar() {}

            @Override
            public BigDecimal getValorTotal() {
                return valor;
            }

            @Override
            public void reembolsar() {
                saldo = saldo.add(valor);
            }
        }

        Tarifa.testar();

        return new Tarifa();
    }
}