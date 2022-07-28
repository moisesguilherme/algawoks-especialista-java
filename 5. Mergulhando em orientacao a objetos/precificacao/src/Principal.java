public class Principal {

    public static void main(String[] args) {
        double precoCompraFornecedor = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        // Quando passar o precoCompraFornecedor vai alterar o valor ou não?
        // não ele passa o valor e não a referência da variável
        servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);

        System.out.printf("Preço: %.2f%n", precoCompraFornecedor);
    }

}
