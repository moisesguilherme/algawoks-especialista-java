import com.algaworks.agencia.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Principal2 {


    public static void main(String[] args) {
        CadastroHotel2 cadastro = new CadastroHotel2();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1300);
        cadastro.adicionar("Tivoli Ecoresort", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Ceara/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1300);

        //cadastro.removerPorCidade("Ceara/CE");
        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);
    }

    //Usando ListIterator (anda de trás para frente, consegue voltar na iteracão)
    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        // precisa indicar o final  (default inicia no index 0)
        ListIterator<Hotel> hotelIterator = hoteis.listIterator(hoteis.size());
        while (hotelIterator.hasPrevious()) {
            Hotel hotel = hotelIterator.previous();
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
}

