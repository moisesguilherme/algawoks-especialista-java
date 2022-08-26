public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;


    static double calcularCustosTotais(Produto produto) {
        return produto.precoCusto + Produto.custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    // não é método ds instância e sim da classe
    static void alterarCustoEmbalagem(double custoEmbalagem){
        // Forma errada alterar uma variável estática pelo this
        // this.custoEmbalagem = custoEmbalagem;
        Produto.custoEmbalagem = custoEmbalagem;
    }

    static void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem : %.2f%n", Produto.custoEmbalagem);
    }


}
