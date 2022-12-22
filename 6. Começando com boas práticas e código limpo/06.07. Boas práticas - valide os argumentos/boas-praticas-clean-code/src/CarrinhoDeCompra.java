import java.util.Objects;

public class CarrinhoDeCompra {

    Produto produto;
    int quantidadeItens;

    void adicionarItem(Produto produto, int quantidade) {

        // Precisa criar uma excessão
        /*
        if (produto == null) {
            System.out.println("Produto não pode ser nulo");
        } else {
            System.out.printf("Produto: %s%n", produto.nome);
        }*/

        // Usar object java.utils
        Objects.requireNonNull(produto, "Produto deve ser informado");

        if(quantidade <= 0){
            throw new IllegalArgumentException("Quantidade deve ser maior que 0");
        }

        // TODO implementar
    }

    void gerarPedido(Endereco enderecoEntrega) {
        criarNovoPedido(enderecoEntrega);
    }

    // Criar uma sobrecarga de método.
    // Se for um método interno e somente a classe conhece pode passar nulo
    // porém aqui ela é chamada externamente, por isso criar um novo método
    // criarNovoPedido.
    void gerarPedido(){
        criarNovoPedido(null);
    }

    // método interno
    // só o método interno q pode receber nulo
    private void criarNovoPedido(Endereco enderecoEntrega) {
        // TODO implementar
        Objects.requireNonNull(enderecoEntrega, "Endereco de entrega deve ser informado");
    }

}