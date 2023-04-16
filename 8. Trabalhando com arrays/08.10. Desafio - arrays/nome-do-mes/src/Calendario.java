public class Calendario {

    static String obterNomeMes(int numeroMes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return meses[numeroMes -1];
    }
}