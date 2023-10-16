import com.algaworks.agencia.*;

import java.util.ArrayList;

public class Principal2 {


    public static void main(String[] args) {
        CadastroHotel2 cadastro = new CadastroHotel2();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1300);
        cadastro.adicionar("Tivoli Ecoresort", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Ceara/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1300);

        cadastro.remover(new Hotel("Vila Selvagem", "Fortim/CE", 0));
        //cadastro.removerPorCidade("Fortim/CE");

        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        //hoteis.set(0, new Hotel("Substituiu", "Fortim/CE", 0));
        //hoteis.add(3, new Hotel("Adicionou", "Fortim/CE", 0));
        imprimirHoteis(hoteis);

        // Comparacão entre nome e cidade (método equals em Hotel)
        // Se não existir retorna -1
        //int indice = hoteis.indexOf(new Hotel("Vila Selvagem", "Fortim/CE", 0));

        // Do final para o início
        //int indice = hoteis.lastIndexOf(new Hotel("Vila Selvagem", "Fortim/CE", 0));
        //System.out.println(indice);
        //System.out.println(hoteis.get(indice));

    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
}

