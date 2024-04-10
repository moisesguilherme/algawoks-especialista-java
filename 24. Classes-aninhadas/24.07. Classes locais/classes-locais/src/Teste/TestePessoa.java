package Teste;

public class TestePessoa {


    public static void main(String[] args) {

        //Statica
        Pessoa.ImprimeStatica.print();

        // Não Stática
        Pessoa pessoa = new Pessoa();
        //Pessoa.Imprime imprime = pessoa.new Imprime("adicionado") ;
        Pessoa.Imprime imprime = new Pessoa().new Imprime("adicionado") ;

        imprime.print();


    }

}
