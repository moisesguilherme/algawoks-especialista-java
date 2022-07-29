public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    void alterarCustoEmbalagem(double custoEmbalagem){
        // Forma errada alterar uma variável estática pelo this
        // this.custoEmbalagem = custoEmbalagem;
        Produto.custoEmbalagem = custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem : %.2f%n", Produto.custoEmbalagem);
    }

}
