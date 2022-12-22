public class Principal {

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        Produto produto = new Produto();
        produto.nome = "Água";
        produto.precoUnitario = 5;

        // com null vai gerar a excessão
        //carrinho.adicionarItem(null, 4);

        // com valor negativo, gera uma excessão
        //carrinho.adicionarItem(produto, -4);
        carrinho.adicionarItem(produto, 4);

        Endereco endereco = new Endereco();
        endereco.logradouro = "Rua das Amoras";
        endereco.numero = "1000";
        endereco.bairro = "Centro";

        // Princípio: vc nunca deve passar null para um argumento de um método,
        // para explicar que não tem nenhum valor para esse elemento.
        //carrinho.gerarPedido(null);
        carrinho.gerarPedido(endereco);


        System.out.println("Pedido gerado");
    }

}
