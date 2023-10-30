public class Pedido {

    public static final int STATUS_RASCUNHO = 0;
    public static final int STATUS_EMITIDO = 1;
    public static final int STATUS_FATURADO = 2;
    public static final int STATUS_DESPACHADO = 3;
    public static final int STATUS_ENTREGE = 4;
    public static final int STATUS_CANCELADO = 5;
    //problema da fragilidade, caso usar uma classe compilada, caso
    // alterar a contante e não compilar, vai ter o valor antigo

    // problema de ambiguidade, tem constantes para status e origem
    // colocar prefixo ORIGEM_ E STATUS_
    // outro intervalo em origem
    public static final int ORIGEM_BALCAO = 100;
    public static final int ORGIGEM_ONLINE = 101;

    private String nomeCliente;
    private int status = STATUS_RASCUNHO;
    private int origem = ORIGEM_BALCAO;


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
        if(status < STATUS_RASCUNHO || status > STATUS_CANCELADO) {
            throw new IllegalArgumentException("Status inválido");
        }

        this.status = status;
    }

    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        if(origem < ORIGEM_BALCAO || origem > ORGIGEM_ONLINE) {
            throw new IllegalArgumentException("Pedido inválido");
        }
        this.origem = origem;
    }

    public static String getDescricaoStatus(int status){
        // problema: se atualizar o status vai quebrar
        // java 5 resolve, com ENUM
        return switch (status) {
            case STATUS_RASCUNHO -> "Raschunho";
            case STATUS_EMITIDO -> "Emitido";
            case STATUS_FATURADO -> "Faturado";
            case STATUS_DESPACHADO -> "Despachado";
            case STATUS_ENTREGE -> "Entrege";
            case STATUS_CANCELADO -> "CANCELADO";
            default -> throw new IllegalArgumentException("Status inválido");
        };
    }


}
