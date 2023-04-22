public class Principal {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        //Produto produto1 = new Produto(null);
        // Exceção em tempo de execução
        //Produto produto2 = new Produto(null, -35);
        //Produto produto3 = new Produto();


        // Mesmo com o construtor protegendo na inicializacão ainda consegue colocar como null
        produto1.nome = null;
        produto1.quantidadeEstoque = -2;


        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);

        //System.out.println(produto2.nome);
        //System.out.println(produto2.quantidadeEstoque);

        //System.out.println(produto3.nome);
        //System.out.println(produto3.quantidadeEstoque);
    }

}
