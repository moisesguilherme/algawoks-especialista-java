public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante) {
        this.cadastrar(visitante, TEMPO_EXPIRACAO_EM_MESES);
    }

    // Var em parâmetro também não funciona
    //var Visitante visitante
    int  cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {

        // vair descobrir q é uma variável do tipo inteiro
        final var tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias%n",
                visitante.nome, tempoExpiracaoEmDias);

        return 1;
    }
}
