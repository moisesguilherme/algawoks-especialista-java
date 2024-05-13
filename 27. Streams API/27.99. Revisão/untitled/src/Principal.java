import estoque.CadastroProduto;
import estoque.Produto;

import java.util.List;

public class Principal {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();

        List<Produto> produtos =  cadastroProduto.obterTodos();

        produtos.stream()
                .forEach(System.out::println);
    }

}
