import com.algaworks.estruturadedados.Pilha;
import com.algaworks.loja.Produto;

public class Principal {

    public static void main(String[] args) {
        Pilha<Produto> pilha = new Pilha<Produto>();
        //pilha.colocar("A");
        //pilha.colocar("B");
        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("Feijão"));
        pilha.colocar(new Produto("Macarrão"));

        Produto produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = pilha.retirar();
        System.out.println(produto.getDescricao());

        // Não corre o risco de -> ClassCastException
        produto = pilha.retirar();
        System.out.println(produto.getDescricao());


    }

}