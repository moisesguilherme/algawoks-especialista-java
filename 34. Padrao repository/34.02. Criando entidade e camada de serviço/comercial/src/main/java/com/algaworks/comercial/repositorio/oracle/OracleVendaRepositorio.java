package com.algaworks.comercial.repositorio.oracle;

import com.algaworks.comercial.entidade.Venda;
import com.algaworks.comercial.repositorio.VendaRepositorio;

import java.util.List;

// Importante que essa classe implementa VendaRepositorio
// para tirar o acoplamento
public class OracleVendaRepositorio implements VendaRepositorio {


    @Override
    public Venda adicionar(Venda venda) {
        System.out.println("Simula conexão com banco Oracle");
        return new Venda(1L, venda.getNomeCliente(), venda.getValorTotal(), venda.getDataPagamento());
    }

    @Override
    public List<Venda> consultar() {
        System.out.println("Simula consulta com banco Oracle");
        return List.of();
    }
}
