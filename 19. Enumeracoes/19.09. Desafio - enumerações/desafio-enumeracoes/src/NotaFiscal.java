public class NotaFiscal {

    //public static final int STATUS_NAO_EMITIDA = 0;
    //public static final int STATUS_EMITIDA = 1;
    //public static final int STATUS_CANCELADA = 2;

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusNota status = StatusNota.STATUS_NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusNota getStatus() {
        return status;
    }

    public void cancelar() {
        if ((StatusNota.STATUS_EMITIDA.equals(getStatus())  && getValor() >= 1_000)
                || StatusNota.STATUS_CANCELADA.equals(getStatus())) {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }

        status = StatusNota.STATUS_CANCELADA;
    }

    public void emitir() {
        if (StatusNota.STATUS_EMITIDA.equals(getStatus()) || StatusNota.STATUS_CANCELADA.equals(getStatus())) {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }

        status = StatusNota.STATUS_EMITIDA;
    }

    public String getDescricaoCompleta() {
        String descricaoStatus = switch (status) {
            case STATUS_NAO_EMITIDA -> "Não emitida";
            case STATUS_EMITIDA -> "Emitida";
            case STATUS_CANCELADA -> "Cancelada";
            default -> throw new RuntimeException("Status não tratado");
        };

        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), descricaoStatus);
    }

}
