public class Principal {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Picanha 1k (peca)");
        Produto produto2 = new Produto("Maminha", 20);

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);

        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEstoque);

    }

}
