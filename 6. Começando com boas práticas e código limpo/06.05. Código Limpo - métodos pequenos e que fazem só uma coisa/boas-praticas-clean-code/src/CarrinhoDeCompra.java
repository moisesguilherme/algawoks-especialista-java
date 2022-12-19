public class CarrinhoDeCompra {

    static final double TAXA_SERVICO_PADRAO = 0.10;

    int quantidadeItens;
    Produto produto;

    // Nível mais alto (Níveis de abstracão dos métodos)
    // Esse método possui 3 etapas, apenas executa as etapas não faz ela.
    // Não trabalha com os detalhes da compra
    void realizarCompra(String numeroCartao) {
        double valorTotal = calcularValorTotal();

        boolean pagamentoAutorizado = GatewayPagamento.autorizarPagamento(numeroCartao, valorTotal);

        if(pagamentoAutorizado){
            // Ideal apenas uma linha no if (transformar em método)
            imprimirRecibo(valorTotal);
        }
    }

    private static void imprimirRecibo(double valorTotal) {
        System.out.println("RECIBO DE PAGAMENTO");
        System.out.println("Valor total: R$%.2f%n", valorTotal);
    }

    // Nível intermediário, ele nào faz a contas, calcular definitivamente, ainda executa e chama outros métodos.
    double calcularValorTotal() {
        double subtotal = calcularSubtotal();
        double taxaServico = calcularTaxaServico(subtotal);
        double valorTotal = subtotal + taxaServico;

        return valorTotal;
    }

    // Nível mais baixo de método, faz a conta.
    private static double calcularTaxaServico(double subtotal) {
        return subtotal * TAXA_SERVICO_PADRAO;
    }

    private double calcularSubtotal() {
        return produto.precoUnitario * quantidadeItens;
    }


}