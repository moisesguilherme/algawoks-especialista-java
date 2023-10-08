package com.algaworks.crm;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome, int idade) {
        if (idade < 18) {
            // Violacão da regra de negócio...
            //return null;
            throw new MenorDeIdadeException("Cliente menor de idade não pode ser cadastrado");
        }

        // TODO faz o cadastro aqui

        return new Cliente(nome, idade);
    }

}