import com.algaworks.loja.Carrinho;
import com.algaworks.loja.ItemCarrinho;
import com.algaworks.loja.pagamento.CartaoCredito;
import com.algaworks.loja.pagamento.MetodoPagamento;
import com.algaworks.loja.pagamento.Transferencia;

public class Principal {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Mouse", 600));

        //CartaoCredito metodoPagamento = new CartaoCredito("234234");

        //para funcionar
        //Transferencia metodoPagamento = new CartaoCredito("234234");
        //Usar uma interface mais abstrata ou interface MetodoPagamento

        //MetodoPagamento metodoPagamento = new CartaoCredito("234234");
        //MetodoPagamento metodoPagamento = new Transferencia("234234", "2222");

        //Transferencia metodoPagamento = new Transferencia("234234", "2222");
        // System.out.printf("Agência: %s%n", metodoPagamento.getAgencia()); // vai dar problema se trocar tipo
        // classe mais concreta.

        // Sempre trabalhar com o tipo mais abstrato, exemplo MetodoPagamento
        MetodoPagamento metodoPagamento = new Transferencia("234234", "2222");

        carrinho.finalizar(metodoPagamento);
    }

}