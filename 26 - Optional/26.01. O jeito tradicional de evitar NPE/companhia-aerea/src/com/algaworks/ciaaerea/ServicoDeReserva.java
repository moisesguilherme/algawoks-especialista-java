package com.algaworks.ciaaerea;

import java.util.*;
import java.util.Optional;

public class ServicoDeReserva {

    private final Set<Reserva> reservas = new HashSet<>();

    public Collection<Reserva> getReservas() {
        return Collections.unmodifiableSet(reservas);
    }

    public void adicionar(Reserva reserva) {
        boolean reservaAdicionada = reservas.add(reserva);

        if (!reservaAdicionada) {
            throw new RuntimeException(
                    String.format("Reserva %s já existe", reserva.getCodigo()));
        }
    }

    // Optional a partir Java 8
    public Optional<Reserva> buscar(String codigo) {
        //Reserva reservaEncontrada = null;

        for (Reserva reserva : reservas) {
            if (reserva.getCodigo().equals(codigo)) {
                //Sempre vai retornar um valor
                // diferenca entre of e ofNullable, o Nullable pode retornar vazio
                // já of precisa ser um valor.

                ///Optional.ofNullable(reservaEncontrada); // se for null, vai ser vazio

                return Optional.of(reserva);
                //reservaEncontrada = reserva;
                //break;
            }
        }

        // recebe o valor
        // se for null ele entende que o optional está vazio
        //return Optional.ofNullable(reservaEncontrada);
        return Optional.empty(); //vazio não tem nda nele

    }

}