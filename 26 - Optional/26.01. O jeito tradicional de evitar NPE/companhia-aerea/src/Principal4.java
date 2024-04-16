import com.algaworks.ciaaerea.*;

import java.util.Optional;

public class Principal4 {

    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        servicoDeBagagem.contratar("28A888", 1);
        //Passageiro passageiro = reserva.getPassageiro();

        Passageiro passageiro = servicoDeReserva.buscar("28A888") //Com código inválido lança a execeção
                .filter(r -> r.getQuantidadeBagagens() > 0) //Filtro true ou false //Interface funcional Predicate
                .flatMap(Reserva::getPassageiro) //Retorna o valor "achatado" flat
                .orElseThrow(RuntimeException::new); // se for false, retorna empty. O filter retorna um optional

        System.out.println(passageiro);


    }

}
