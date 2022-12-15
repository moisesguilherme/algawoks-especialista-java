public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_EM_MESES = 1;

    // Overloading - sobrecarga de métodos
    // mesmo nome com parâmetros diferentes
    void cadastrar(final Visitante visitante) {
        // this chama método de instância - opcional
        this.cadastrar(visitante, TEMPO_EXPIRACAO_EM_MESES);
    }
    // precisa mudar o tipo para ser diferente o outro método
    // para sobrecarga não pode ter a mesma assinatura do método
    // void cadastrar(Visitante, int)

    void cadastrar(final Visitante visitante, final long senha) {
    }


    void cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {

        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias%n",
                visitante.nome, tempoExpiracaoEmDias);
    }
}
