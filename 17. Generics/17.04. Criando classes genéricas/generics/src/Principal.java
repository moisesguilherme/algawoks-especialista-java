import com.algaworks.estruturadedados.Pilha;
import com.algaworks.loja.Produto;

public class Principal {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.colocar("A");
        pilha.colocar("B");
        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("Feijão"));

        Produto produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());

        // ClassCastException
        produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());


    }

}