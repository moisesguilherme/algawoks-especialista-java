public class AposentadoriaTempoContribuicao {


    /*
    // O ideial é não ter comentário
    void solicitarAposentadoria(Contribuinte contribuinte) {
        // Verifca se contribuinte está elegível para se aposentar
        // A idade minima é de 65 anos e o tempo de contribuićão minimo é de 20 anos
        if (contribuinte.idade >= 65 && contribuinte.tempoContribuicaoEmAnos >= 20) {

        }
    }
    */

    // Código mais expressivo

    void solicitarAposentadoria(Contribuinte contribuinte) {
        if (contribuinte.estaElegivelParaAposentadoria()) {
            // TODO implementar aqui
        }
    }
}
