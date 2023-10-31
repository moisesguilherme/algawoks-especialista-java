public class Pedido {

    public static final int ORIGEM_BALCAO = 100;
    public static final int ORGIGEM_ONLINE = 101;

    private String nomeCliente;
    private double valorTotal;
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

    /*public void setStatus(StatusPedido status) {
        this.status = status;
    }*/

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getTempoEntregaEmHoras() {
        return status.getTempoEntregaEmHoras();
    }

    public void cancelar() {
        // if (getStatus().equals(StatusPedido.RASCUNHO)) // getSstatus pode ser null
        // se o getStatus for null não vai dar nullpointexception
        if(StatusPedido.RASCUNHO.equals(getStatus())
            || (StatusPedido.EMITIDO.equals(getStatus())
            && getValorTotal() < 100))
            status = StatusPedido.CANCELADO;
        else
            throw new IllegalStateException("Pedido não pode ser cancelado");
    }
}
