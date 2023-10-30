public class Pedido {

    public static final int RASCUNHO = 0;
    public static final int EMITIDO = 1;
    public static final int FATURADO = 2;
    public static final int DESPACHADO = 3;
    public static final int CANCELADO = 4;

    private String nomeCliente;
    private int status = RASCUNHO;


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
