public class Pedido {

    public static final int ORIGEM_BALCAO = 100;
    public static final int ORGIGEM_ONLINE = 101;

    private String nomeCliente;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public int getTempoEntregaEmHoras() {
        // calcula com status, se adicionar um vai dar erro
        return switch (status) {
            case EMITIDO -> 12;
            case FATURADO -> 10;
            case DESPACHADO ->  6;
            case ENTREGE -> 0;
            default -> throw new IllegalArgumentException("Pedido não pode ser entregue");
        };
    }
}
