package com.algaworks.comercial.repositorio;

import com.algaworks.comercial.repositorio.memoria.MemoriaFabricaDeRepositorio;
import com.algaworks.comercial.repositorio.mysql.MySQLFabricaDeRepositorio;
import com.algaworks.comercial.repositorio.oracle.OracleFabricaDeRepositorio;

import java.io.IOException;
import java.util.Properties;

public interface FabricaDeRepositorio extends AutoCloseable {

    public static FabricaDeRepositorio obterIntancia() {
        // um inputStream (ler o arquivo persistencia.properties)
        var properties = new Properties();
        try (var is = FabricaDeRepositorio.class
                .getResourceAsStream("/persistencia.properties")) {
            properties.load(is);
        } catch (IOException e) {
            throw new PersistenciaException("Erro carregando configurações", e);
        }

        if("mysql".equals(properties.getProperty("repositorio"))) {
            return new MySQLFabricaDeRepositorio(properties);
        } else if("memoria".equals(properties.getProperty("repositorio"))) {
            return new MemoriaFabricaDeRepositorio();
        } else if("oracle".equals(properties.getProperty("repositorio"))) {
            return new OracleFabricaDeRepositorio(properties);
        }

        throw new PersistenciaException("Implementação de repositório não existe");
    }

    VendaRepositorio criarVendaRepositorio();

    @Override
    void close();
}
