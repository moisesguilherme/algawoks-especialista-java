public enum StatusPedido {
    // problema ao adicionar um status, caso separado
    RASCUNHO,
    EMITIDO(12),
    FATURADO(10),
    SEPARADO(8), // agora podemos adicionar um elemento
    DESPACHADO(6),
    ENTREGE(0),
    CANCELADO; // quando tem construtor metodo

    private Integer tempoEntregaEmHoras;

    StatusPedido() {

    }

    // Só pode ter construtor private, não public
    StatusPedido(int tempoEntregaEmHoras) {
        this.tempoEntregaEmHoras = tempoEntregaEmHoras;
    }

    // O método pode ser public
    public Integer getTempoEntregaEmHoras() {
        return tempoEntregaEmHoras;
    }

}
