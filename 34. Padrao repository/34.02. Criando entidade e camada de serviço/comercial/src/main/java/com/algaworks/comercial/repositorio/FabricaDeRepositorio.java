package com.algaworks.comercial.repositorio;

public interface FabricaDeRepositorio extends AutoCloseable {


    VendaRepositorio criarVendaRepositorio();

    @Override
    void close();
}
