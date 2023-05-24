import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();

        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

        //cadastro.remover(new Hotel("Vila Selvagem", "Fortim/CE", 0));
        cadastro.removerPorCidade("Fortim/CE");
        cadastro.removeTodos();


        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        //hoteis.add(3, new Hotel("Teste", "teste", 0));
        //hoteis.set(0, new Hotel("Teste 2", "teste", 0));

        //int indice = hoteis.indexOf(new Hotel("Vila Selvagem", "Fortim/CE", 0));
        //System.out.println(indice);
        //System.out.println(hoteis.get(indice));
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                hotel.getCidade(), hotel.getPrecoDiaria());
        }

    }

}
