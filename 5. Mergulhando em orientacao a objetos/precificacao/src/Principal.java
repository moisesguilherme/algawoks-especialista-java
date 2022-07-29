public class Principal {

    public static void main(String[] args) {
        Produto novoProduto = new Produto();
        // novoProduto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(80);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        // Quando passar o precoCompraFornecedor vai alterar o valor ou não?
        // não ele passa o valor e não a referência da variável
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de custo: %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
    }

}

