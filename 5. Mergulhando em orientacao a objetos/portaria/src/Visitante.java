public class Visitante {

    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 16;

    // var nome = "nome";
    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade() {
        return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }

}
