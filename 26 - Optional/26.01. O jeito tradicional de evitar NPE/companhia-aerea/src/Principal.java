import com.algaworks.ciaaerea.*;

import java.util.Optional;

public class Principal {

    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

         servicoDeBagagem.contratar("28A888", 2);

        servicoDeReserva.getReservas().forEach(System.out::println);


        //Não complicar usando o optinal, mais simples com if(passageiro != null)
        Passageiro passageiro = null;
        //Passageiro passageiro = new Passageiro("Teste");

        if(Optional.ofNullable(passageiro).isPresent()) {
            System.out.println(passageiro);
        }
    }

}
