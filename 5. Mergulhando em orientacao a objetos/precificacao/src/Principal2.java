public class Principal2 {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Produto.custoEmbalagem = 20;

        // Forma não boa para acessar a variável (static) compartilhada "global" para todas as instâncias
        // acessar através de uma referência de uma instância (produto1) o ideal é pela classe Produto
        // produto1.custoEmbalagem = 10;
        // produto2.custoEmbalagem = 15;

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();

    }

}


