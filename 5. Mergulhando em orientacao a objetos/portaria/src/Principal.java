public class Principal {

    public static void main(String[] args) {
        // Inferência de tipo de variável local
        // Inferir -> deduzir
        // VAR -> JAVA 11

        var novoVisitante = new Visitante();

        // não é uma palavra chave reservada
        // var var = 1;

        /*
        Desta forma não funciona
        var novoVisitante;
        novoVisitante = new Visitante();

        // Nulo
        var nome = null;
        */

        novoVisitante.nome = "João";
        novoVisitante.idade = 15;


        var cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante);

        // Essa abordagem não é boa por causa da legibilidade do código
        // Você não sabe que o retorno é um int
        // trocar resultado para codigoVisitante (mesmo assim não fica bom)
        var resultado = cadastroPortaria.cadastrar(novoVisitante, 1);

    }

}
