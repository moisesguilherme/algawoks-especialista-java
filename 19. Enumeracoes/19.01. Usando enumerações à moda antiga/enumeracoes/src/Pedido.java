public class Pedido {

    public static final int RASCUNHO = 0;
    public static final int EMITIDO = 1;
    public static final int FATURADO = 2;
    public static final int DESPACHADO = 3;
    public static final int CANCELADO = 4;

    // problema de ambiguidade, tem constantes para status e origem
    public static final int BALCAO = 0;
    public static final int ONLINE = 1;

    private String nomeCliente;
    private int status = RASCUNHO;
    private int origem = BALCAO;


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
        if(status < RASCUNHO || status > CANCELADO) {
            throw new IllegalArgumentException("Status inválido");
        }

        this.status = status;
    }

    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        if(origem < BALCAO || origem > ONLINE) {
            throw new IllegalArgumentException("Pedido inválido");
        }
        this.origem = origem;
    }
}
