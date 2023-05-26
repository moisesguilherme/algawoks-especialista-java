package com.algaworks.banco;

public record Passaporte(String numero, String pais) {



    @Override
    public String toString() {
        return "Custom: Passaporte{" +
                "numero='" + numero + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
