package com.algaworks.crm;

public class Pesquisador {


    //T é um subtipo de nomeável (extends não é heranca)
    //Limita a chamada do método somente nomeável.
    public static <T extends Nomeavel>T obterPorNome(T[] items, String nome) {
        for (T item : items) {
            if (item.getNome().equals(nome)) {
                return item;
            }
        }

        throw new RuntimeException("Entidade não encontrada pelo nome");
    }

}