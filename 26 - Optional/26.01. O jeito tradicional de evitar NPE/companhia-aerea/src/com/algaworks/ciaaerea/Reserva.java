package com.algaworks.ciaaerea;

import java.util.Objects;
import java.util.Optional;

public class Reserva {
    // Boas práticas ao usar Optional
    // Não usar em tudo exemplo:
    // private final Optional<String> codigo;

    private final String codigo;
    private final Voo voo;
    private final Passageiro passageiro;
    private int quantidadeBagagens;

    // Não colocar no métodos/construtor, vai complicar o uso da sua api.
    //public Reserva(Optional<String> codigo, Optional<Voo> voo, Optional<String> nomePassageiro) {
    // Local ideal, retorno do método q pode retornar null
    public Reserva(String codigo, Voo voo, String nomePassageiro) {
        Objects.requireNonNull(codigo);
        Objects.requireNonNull(voo);
        Objects.requireNonNull(nomePassageiro);
        this.codigo = codigo;
        this.voo = voo;
        this.passageiro = new Passageiro(nomePassageiro);
    }

    public String getCodigo() {
        return codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public Optional<Passageiro> getPassageiro() {
        return Optional.of(passageiro);
    }

    public String getNomePassageiro() {
        return passageiro.getNome();
    }

    public int getQuantidadeBagagens() {
        return quantidadeBagagens;
    }

    public void adicionarBagagens(int quantidade) {
        this.quantidadeBagagens += quantidade;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo=" + codigo +
                ", voo=" + voo.codigo() + "(" + voo.origem() + "-" + voo.destino() + ")" +
                ", passageiro=" + getNomePassageiro() +
                ", quantidadeBagagens=" + quantidadeBagagens +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return codigo.equals(reserva.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

}