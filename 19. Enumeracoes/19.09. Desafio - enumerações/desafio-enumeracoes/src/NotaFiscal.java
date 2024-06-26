public class NotaFiscal {

    //public static final int STATUS_NAO_EMITIDA = 0;
    //public static final int STATUS_EMITIDA = 1;
    //public static final int STATUS_CANCELADA = 2;

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusNota status = StatusNota.NAO_EMITIDA;

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

    // Somente para teste
    public void setStatus(StatusNota status) {
        this.status = status;
    }

    public void cancelar() {
        if (getStatus().podeMudarParaCancelado(getValor()))
            status = StatusNota.CANCELADA;
        else
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");

    }

    public void emitir() {
        if (getStatus().podeMudarParaEmitido())
            status = StatusNota.EMITIDA;
        else
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
    }

    public String getDescricaoCompleta() {

        String descricaoStatus = switch (status) {
            case NAO_EMITIDA -> "Não emitida";
            case EMITIDA -> "Emitida";
            case CANCELADA -> "Cancelada";
            default -> throw new RuntimeException("Status não tratado");
        };*/

        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), status.getDescricao());
    }

}
