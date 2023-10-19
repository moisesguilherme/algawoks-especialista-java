package com.algaworks.agencia;

import java.util.Objects;

// Comparar Hotel com qual outro tipo <Hotel>, no cao com ele mesmo hotel
public class Hotel implements Comparable<Hotel> {

    private String nome;
    private String cidade;
    private double precoDiaria;

    public Hotel(String nome, String cidade, double precoDiaria) {
        setNome(nome);
        setCidade(cidade);
        setPrecoDiaria(precoDiaria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if (precoDiaria < 0) {
            throw new IllegalArgumentException("Preço da diária não pode ser negativo");
        }

        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", precoDiaria=" + precoDiaria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (!nome.equals(hotel.nome)) return false;
        return cidade.equals(hotel.cidade);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + cidade.hashCode();
        return result;
    }

    @Override
    public int compareTo(Hotel o) {

        return Double.compare(getPrecoDiaria(), o.getPrecoDiaria());

        // Convertendo para Double que já possui o comparable
        /*return Double.valueOf(getPrecoDiaria())
                .compareTo(Double.valueOf(o.getPrecoDiaria()));
        */
        /*
        if(this.getPrecoDiaria() < o.getPrecoDiaria())
            return -1;
        else if(this.getPrecoDiaria() > o.getPrecoDiaria())
            return 1;

        return 0; //-1 menor, 1 maior, 0 igual
         */
    }
}