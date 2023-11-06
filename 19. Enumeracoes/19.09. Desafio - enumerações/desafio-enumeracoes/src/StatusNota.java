public enum StatusNota {
    NAO_EMITIDA("Não emitida"){
        @Override
        public boolean podeMudarParaCancelado(double valorNota) {
            return true;
        }

        @Override
        public boolean podeMudarParaEmitido() {
            return true;
        }
    },
    STATUS_EMITIDA("Emitida"){
        @Override
        public boolean podeMudarParaCancelado(double valorNota) {
            return valorNota < 1_000;
        }

        @Override
        public boolean podeMudarParaEmitido() {
            return false;
        }
    },
    STATUS_CANCELADA("Cancelada") {
        @Override
        public boolean podeMudarParaCancelado(double valorNota) {
            return true;
        }

        @Override
        public boolean podeMudarParaEmitido() {
            return true;
        }
    };

    private String descricao;

    StatusNota(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract boolean podeMudarParaCancelado(double valorNota);

    public abstract boolean podeMudarParaEmitido();

    /*public boolean podeMudarParaCancelado(double valorNota) {
        return (StatusNota.STATUS_EMITIDA.equals(this)
               && valorNota >= 1_000)
               || StatusNota.STATUS_CANCELADA.equals(this);
    }*/

    /*public boolean podeMudarParaEmitido() {
        return !(StatusNota.STATUS_EMITIDA.equals(this)
                || StatusNota.STATUS_CANCELADA.equals(this));
    }*/
}
