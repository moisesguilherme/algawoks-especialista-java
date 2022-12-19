public class CarrinhoDeCompra {

    int quantidadeItens;
    Produto produto;

    void realizarCompra(String numeroCartao) {
        double subtotal = produto.precoUnitario * quantidadeItens;
        double taxaServico = subtotal * 0.10;
        double valorTotal = subtotal + taxaServico;

        boolean pagamentoAutorizado = GatewayPagamento.autorizarPagamento(numeroCartao, valorTotal);

        if(pagamentoAutorizado){
            System.out.println("RECIBO DE PAGAMENTO");
            System.out.println("Valor total: R$%.2f%n", valorTotal);
        }
    }


}