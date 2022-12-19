public class Produto {

    String nome;
    double precoUnitario;
    boolean ativo;

    void alterarStatus(boolean ativo) {
        if (ativo) {
            System.out.println("Ativando");
        } else {
            System.out.println("Desativando");
        }

        this.ativo = ativo;
    }

}
