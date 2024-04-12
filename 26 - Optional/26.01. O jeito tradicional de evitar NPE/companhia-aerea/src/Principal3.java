import com.algaworks.ciaaerea.Reserva;
import com.algaworks.ciaaerea.ReservaNaoEncontradaException;
import com.algaworks.ciaaerea.ServicoDeReserva;
import com.algaworks.ciaaerea.Voo;

public class Principal3 {

    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        // Se tiver adiciona, se não executa e tb não lança a execeção...
        /*servicoDeReserva.buscar("28A888x") // retorna reserva
                .ifPresent(reserva -> reserva.adicionarBagagens(10));
        */

        /*servicoDeReserva.buscar("28A888x") // retorna reserva
                .ifPresentOrElse(reserva -> reserva.adicionarBagagens(10),
                        () -> System.out.println("Reserva não encontrada")); //Interface Runnable -> somente executa
        */

        // Lançar exceção
        servicoDeReserva.buscar("28A888x") // retorna reserva
                .ifPresentOrElse(r -> r.adicionarBagagens(10),
                        () -> { throw new ReservaNaoEncontradaException("Não encontrado"); });



        servicoDeReserva.getReservas().forEach(System.out::println);

    }

}
