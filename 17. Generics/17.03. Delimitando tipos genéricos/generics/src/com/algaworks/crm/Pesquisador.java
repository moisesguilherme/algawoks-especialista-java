package com.algaworks.crm;

public class Pesquisador {

    public static <T>T obterPorNome(T[] items, String nome) {
        for (T item : items) {
            if(item instanceof  Cliente c) {
                //acessar méthodos do cliente
                if (c.getRazaoSocial().equals(nome)) {
                    return (T) c;
                }
            } else if (item instanceof  Funcionario f) {
                //acessar méthodos do funcionario
                if (f.getNome().equals(nome)) {
                    return (T) f;
                }
            }
            // Não é genérico
            /*if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }*/
        }

        throw new RuntimeException("Entidade não encontrada pelo nome");
    }

}