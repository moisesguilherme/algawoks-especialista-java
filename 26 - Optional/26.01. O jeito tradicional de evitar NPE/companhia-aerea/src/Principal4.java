import com.algaworks.ciaaerea.*;

public class Principal4 {

    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        servicoDeBagagem.contratar("28A888", 1);

        Reserva reserva = servicoDeReserva.buscar("28A888")
                .filter(r -> r.getQuantidadeBagagens() > 0) //Filtro true ou false //Interface funcional Predicate
                        .orElseThrow(RuntimeException::new); // se for false, retorna empty. O filter retorna um optional

        // Equivalente, usando o filter acima
        /*if (reserva.getQuantidadeBagagens() > 0 ){
            System.out.println(reserva);
        }*/
        System.out.println(reserva);

        servicoDeReserva.getReservas().forEach(System.out::println);

    }

}
