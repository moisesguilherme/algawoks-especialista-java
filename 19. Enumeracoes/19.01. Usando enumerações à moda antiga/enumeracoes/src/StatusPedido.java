public enum StatusPedido {
    // problema ao adicionar um status, caso separado
    RASCUNHO,
    EMITIDO(12, "Mensagem emitido"),
    FATURADO(10),
    SEPARADO(8), // agora podemos adicionar um elemento
    DESPACHADO(6),
    ENTREGE(0),
    CANCELADO; // quando tem construtor metodo

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

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean podeMudarParaCancelado(double valorPedido) {
        return StatusPedido.RASCUNHO.equals(this)
                || StatusPedido.EMITIDO.equals(this)
                && valorPedido < 100;
    }
}
