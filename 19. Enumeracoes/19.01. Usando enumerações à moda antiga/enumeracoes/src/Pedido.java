public class Pedido {

    private String nomeCliente;

    // 0 - rascunho
    // 1 - emitido
    // 2 - faturado
    // 3 - despachado
    // 4 - cancelado
    private int status = 0;


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
