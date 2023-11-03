public enum StatusNota {
    STATUS_NAO_EMITIDA,
    STATUS_EMITIDA,
    STATUS_CANCELADA;

    private String descricao;

    StatusNota() {

    }

    StatusNota(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean podeMudarParaCancelado(double valorNota) {
        return (StatusNota.STATUS_EMITIDA.equals(this)
               && valorNota >= 1_000)
               || StatusNota.STATUS_CANCELADA.equals(this);
    }

    public boolean podeMudarParaEmitido() {
        return !(StatusNota.STATUS_EMITIDA.equals(this)
                || StatusNota.STATUS_CANCELADA.equals(this));
    }
}
