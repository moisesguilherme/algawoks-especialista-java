import java.util.ArrayList;
import java.util.List;

public class PrincipalTeste {

    public static void main(String[] args) {
        //var cadastroProduto = new CadastroProduto();

        ProdutoTeste p1 = new ProdutoTeste();
        p1.nome = "Teste1";
        p1.preco = 20.4;

        ProdutoTeste p2 = new ProdutoTeste();
        p2.nome = "Teste2";
        p2.preco = null;

        ProdutoTeste p3 = new ProdutoTeste();
        p3.nome = null;
        p3.preco = 22.9;

        ProdutoTeste p4 = new ProdutoTeste();
        p4.nome = "Teste4";
        p4.preco = 222.9;

        List<ProdutoTeste> produtos = new ArrayList<>();

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        //Media
        double mediaEstoque = produtos.stream()
                .filter( p -> p.preco != null && p.nome != null)
                .peek(p -> System.out.println(p.nome + " " + p.preco))
                .mapToDouble(ProdutoTeste::getPreco)
                .average()
                .orElseThrow(() -> new RuntimeException("Não há produtos para calcular a média"));
                //OptinalDouble

        System.out.println("Média: " + mediaEstoque);


    }

}

class ProdutoTeste {
    String nome;
    Double preco;

    public double getPreco() {
        return preco;
    }
}
