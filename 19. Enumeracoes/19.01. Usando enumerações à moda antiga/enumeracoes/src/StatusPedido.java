public enum StatusPedido {
    // com método abstrato precisa sobrescrever
    RASCUNHO{
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return true;
        }
    },
    EMITIDO(12, "Mensagem emitido"){
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return valorPedido < 100;
        }
    },
    EM_ANALISE(11) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return valorPedido < 100;
        }
    },
    FATURADO(10) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    SEPARADO(8) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    }, // agora podemos adicionar um elemento
    DESPACHADO(6) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    ENTREGE(0) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    CANCELADO {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    }; // quando tem construtor metodo

    private Integer tempoEntregaEmHoras;
    private String msg;

    StatusPedido() {

    }

    StatusPedido(int tempoEntregaEmHoras) {
        this.tempoEntregaEmHoras = tempoEntregaEmHoras;
        this.msg = "Mensagem padrão";
    }

    // Só pode ter construtor private, não public
    StatusPedido(int tempoEntregaEmHoras, String msg) {
        this.tempoEntregaEmHoras = tempoEntregaEmHoras;
        this.msg = msg;
    }

    // O método pode ser public
    public Integer getTempoEntregaEmHoras() {
        return tempoEntregaEmHoras;
    }

    public String getMsg() {
        return msg;
    }

    /*public boolean podeMudarParaCancelado(double valorPedido) {
        return StatusPedido.RASCUNHO.equals(this)
                || (StatusPedido.EMITIDO.equals(this) && valorPedido < 100)
                || (StatusPedido.EM_ANALISE.equals(this) && valorPedido < 100); //Precisa adicionar a regra aqui
    }*/

    public abstract boolean podeMudarParaCancelado(double valorPedido);
}
