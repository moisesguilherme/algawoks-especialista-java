import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                //Problema: Não consegue colocar em primeiro lugar (forEach é um op terminal, preciser o útlimo)
                //colocar o peek -> ideal para debug
                .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
                .peek(System.out::println) // .peek(produto -> System.out.println(produto))
                .filter(Produto::temEstoque)
                .filter(Produto::isInativo)
                .forEach(produto -> {
                    System.out.println("Ativando " + produto);
                    produto.ativar();
                });
    }

}
