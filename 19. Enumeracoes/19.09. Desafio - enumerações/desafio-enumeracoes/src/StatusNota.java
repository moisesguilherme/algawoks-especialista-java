public enum StatusNota {
    NAO_EMITIDA {
        @Override
        public boolean podeMudarParaCancelado(double valorNota) {
            return false;
        }
    },
    EMITIDA {
        @Override
        public boolean podeMudarParaCancelado(double valorNota) {
            return valorNota > 1_000;
        }
    },
    CANCELADA {
        @Override
        public boolean podeMudarParaCancelado(double valorNota) {
            return true;
        }
    };

    private String descricao;

    StatusNota() {

    }

    StatusNota(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract  boolean podeMudarParaCancelado(double valorNota);

    /*public boolean podeMudarParaCancelado(double valorNota) {
        return (StatusNota.STATUS_EMITIDA.equals(this)
               && valorNota >= 1_000)
               || StatusNota.STATUS_CANCELADA.equals(this);
    }*/

    public boolean podeMudarParaEmitido() {
        return !(StatusNota.EMITIDA.equals(this)
                || StatusNota.CANCELADA.equals(this));
    }
}
