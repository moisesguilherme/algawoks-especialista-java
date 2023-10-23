package com.algaworks.agencia;

import java.util.*;

public class CadastroPacoteViagem {

    // DID declarar lista de pacotes de viagem aqui
    // Tipo parametrizado usando generics, list de PacoteViagem
    private final List<PacoteViagem> viagems = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        // DID adicionar pacote na lista, validando antes se
        // Se já existir lançar exceção, verificar usando contains.
        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);

        if(viagems.contains(pacoteViagem)){
            throw new PacoteViagemJaExisteException("Pacote de viagem já foi adicionado");
        }

        viagems.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        // DID retornar lista de pacotes
        return viagems;
    }

    public void ordenar() {
        // DID ordenar pacotes pela ordem natural
        // Pacote viagem vai precisar implementar comparable
        Collections.sort(viagems);
    }

    public void ordenarPorPrecoDecrescente() {
        // DID ordenar pacotes pelo preço (decrescente)
        // uma classe que implementa comparator
        viagems.sort(new PrecoViagemComparator());
    }

    public void removerPorDescricao(String descricao) {
        // DID iterar nos pacotes com Iterator e remover aqueles com descrição informada,
        //  lançando exceção se nenhum pacote foi removido
        int viagemsInitialSize = viagems.size();
        Iterator<PacoteViagem> pacoteViagemIterator = viagems.iterator();
        while (pacoteViagemIterator.hasNext()) {
            PacoteViagem pacoteViagem = pacoteViagemIterator.next();
            if(pacoteViagem.getDescricao().equals(descricao)) {
                pacoteViagemIterator.remove();
            }
        }
        if(viagemsInitialSize == viagems.size())
            throw new PacoteViagemException("Nenhum pacote foi removido");

    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        // DID iterar pacotes com enhanced for, localizar e retornar
        //  pacote com descrição informada (ou lançar exceção se não encontrar)

        for (PacoteViagem viagem : viagems) {
            if(viagem.getDescricao().equals(descricao))
                return viagem;
        }

        throw new PacoteViagemException("Nenhum pacote de viagem foi encontrado");

    }

}
