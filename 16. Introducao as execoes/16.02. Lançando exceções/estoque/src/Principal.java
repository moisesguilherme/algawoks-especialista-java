import com.algaworks.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        // Produto produto = new Produto(null);
        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);

        produto.ativar();

        // Problema vai adicionar no estoque, - com - é igual + = (resultado 15)
        produto.retirarEstoque(15);


        System.out.printf("Estoque: %d%n", produto.getQuantidadeEstoque());
    }

}
