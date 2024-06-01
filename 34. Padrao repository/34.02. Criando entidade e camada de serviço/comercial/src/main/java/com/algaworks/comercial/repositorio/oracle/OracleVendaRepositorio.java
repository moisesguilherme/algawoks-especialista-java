package com.algaworks.comercial.repositorio.oracle;

import com.algaworks.comercial.entidade.Venda;
import com.algaworks.comercial.repositorio.VendaRepositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Importante que essa classe implementa VendaRepositorio
// para tirar o acoplamento
public class OracleVendaRepositorio implements VendaRepositorio {

    private static long proximoId = 1L;
    private static final List<Venda> vendas = new ArrayList<>();

    @Override
    public Venda adicionar(Venda venda) {
        System.out.println("Simulação adiciona cliente com banco Oracle");
        Venda novaVenda = new Venda(proximoId++, venda.getNomeCliente(), venda.getValorTotal(), venda.getDataPagamento());
        vendas.add(novaVenda);
        return novaVenda;
    }

    @Override
    public List<Venda> consultar() {
        System.out.println("Simulação consulta com banco Oracle");
        return Collections.unmodifiableList(vendas);
    }
}
