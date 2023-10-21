package com.algaworks.agencia;

import java.util.*;

public class CadastroPacoteViagem {

    // TODO declarar lista de pacotes de viagem aqui
    // Tipo parametrizado usando generics, list de PacoteViagem
    private final List<PacoteViagem> viagems = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        // TODO adicionar pacote na lista, validando antes se
        // Se já existir lançar exceção, verificar usando contains.
        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);

        if(viagems.contains(pacoteViagem)){
            throw new PacoteViagemJaExisteException("Pacote de viagem já foi adicionado");
        }

        viagems.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        // TODO retornar lista de pacotes
        return viagems;
    }

    public void ordenar() {
        // TODO ordenar pacotes pela ordem natural
        // Pacote viagem vai precisar implementar comparable
    }

    public void ordenarPorPrecoDecrescente() {
        // TODO ordenar pacotes pelo preço (decrescente)
        // uma classe que implementa comparator
    }

    public void removerPorDescricao(String descricao) {
        // TODO iterar nos pacotes com Iterator e remover aqueles com descrição informada,
        //  lançando exceção se nenhum pacote foi removido
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        // TODO iterar pacotes com enhanced for, localizar e retornar
        //  pacote com descrição informada (ou lançar exceção se não encontrar)
        return null;
    }

}
