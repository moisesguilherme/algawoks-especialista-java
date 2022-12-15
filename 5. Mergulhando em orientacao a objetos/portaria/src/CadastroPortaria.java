public class CadastroPortaria {

    // Pode user o final no parâmetro do método
    void cadastrar(final Visitante visitante, final int tempoExpiracao) {
        // Não é uma boa prática usar a variável de parâmetro método, pois se vc precisar usar ele novamente
        // vai perder o valor inicial
        // tempoExpiracao = tempoExpiracao * 30;

        // Erro
        //visitante = new Visitante();
        // Consegue acessar as propriedade de instancia (ela não é final)
        visitante.idade += 10;


        // Essa variável não pode ser alterada
        final int tempoExpiracaoEmDias;
        tempoExpiracaoEmDias = tempoExpiracao * 30;
        // Erro pois está atribuindo uma variável final
        // tempoExpiracao += 1;

        System.out.printf("Visitante %s cadastrado para %d dias%n",
                visitante.nome, tempoExpiracaoEmDias);

    }
}
