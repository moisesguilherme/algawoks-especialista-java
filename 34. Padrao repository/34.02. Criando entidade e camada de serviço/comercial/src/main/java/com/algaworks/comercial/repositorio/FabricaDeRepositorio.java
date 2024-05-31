package com.algaworks.comercial.repositorio;

import com.algaworks.comercial.repositorio.memoria.MemoriaFabricaDeRepositorio;
import com.algaworks.comercial.repositorio.mysql.MySQLFabricaDeRepositorio;
import com.algaworks.comercial.repositorio.oracle.OracleVendaRepositorio;

public interface FabricaDeRepositorio extends AutoCloseable {

    public static FabricaDeRepositorio obterIntancia() {
        //return new MySQLFabricaDeRepositorio();
        //return new OracleVendaRepositorio();
        return new MemoriaFabricaDeRepositorio();
    }

    VendaRepositorio criarVendaRepositorio();

    @Override
    void close();
}
