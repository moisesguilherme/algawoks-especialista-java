package com.algaworks.crm;

import java.util.Comparator;

// Fazer uma comparacão que não tem na classe implementada <Contato>
public class IdadeContatoComparator implements Comparator<Contato> {


    // O treeSet não utiliza o equasl, mas mesmo assim o compare precisa
    // estar consistente
    @Override
    public int compare(Contato o1, Contato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
