public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    String nome;
    int quantidadeEstoque;

    public Produto() {
        this.nome = "Sem nome";
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    Produto(String nome){
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    // Sobrecarga de construtores
    Produto(String nome, int etoqueInicial){
        this.nome = nome;
        this.quantidadeEstoque = etoqueInicial;
    }

}
