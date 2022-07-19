public class Principal {

    public static void main(String[] args) {
        /*int idade;
        idade = 40;
        */

        Pessoa eu = new Pessoa();
        eu.nome = "Moisés Guilherme";
        eu.cpf = "111.333.333-44";
        eu.anoNascimento = 1981;

        Pessoa voce = new Pessoa();
        voce.nome = "João das Couves";
        voce.cpf = "999.999.999-99";
        voce.anoNascimento = 1992;

        Carro meuCarro;
        meuCarro = new Carro();


        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 120000;

        meuCarro.proprietario = eu;

        /*
        meuCarro.proprietario = new Pessoa();
        meuCarro.proprietario.nome = "Thiago Faria";
        meuCarro.proprietario.cpf = "111.333.333-44";
        meuCarro.proprietario.anoNascimento = 1981;
        */


        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;

        double valorRevenda = meuCarro.calcularValorRevenda();

        System.out.printf("Tempo de uso (anos): %d%n", 2022 - meuCarro.anoFabricacao);

        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);
        //seuCarro.calcularValorRevenda();

        /*
        System.out.println("Meu carro");
        System.out.println("---------------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietario: %s%n", meuCarro.proprietario.nome);


        System.out.println();

        System.out.println("Seu carro");
        System.out.println("---------------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietario: %s%n", seuCarro.proprietario.nome);
         */

    }
}
