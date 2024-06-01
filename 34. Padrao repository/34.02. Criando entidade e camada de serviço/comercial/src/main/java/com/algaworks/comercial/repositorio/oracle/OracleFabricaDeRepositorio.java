package com.algaworks.comercial.repositorio.oracle;

import com.algaworks.comercial.repositorio.FabricaDeRepositorio;
import com.algaworks.comercial.repositorio.PersistenciaException;
import com.algaworks.comercial.repositorio.VendaRepositorio;

import java.util.Properties;

public class OracleFabricaDeRepositorio implements FabricaDeRepositorio {

    public OracleFabricaDeRepositorio(Properties properties) {
        try {
            System.out.println("Simulação conexão com banco Oracle: \n" +
                            properties.getProperty("conexao.url") +
                            properties.getProperty("conexao.usuario"));
        } catch (Exception e) {
            throw new PersistenciaException("Erro estabelecendo conexão", e);
        }
    }

    @Override
    public VendaRepositorio criarVendaRepositorio() {
        return new OracleVendaRepositorio();
    }

    @Override
    public void close() {
        System.out.println("Simulação Oracle fechando conexão");
    }
}
